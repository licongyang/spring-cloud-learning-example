package com.lidong.webiot.netty;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Date;

import com.lidong.webiot.strategy.Context;
import com.lidong.webiot.utils.DateUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

/**
 * I/O数据读写处理类
 */
@Slf4j
public class BootNettyChannelInboundHandlerAdapter extends SimpleChannelInboundHandler<Object> {

    /**
     * 从客户端收到新的数据时，这个方法会在收到消息时被调用
     *
     * @param ctx
     * @param msg
     */
    @Override
    public void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception, IOException
    {
        String receiveData = msg.toString();
        //客户端收到的数据
        log.info("收到的客户端数据");
        log.info(receiveData);
        if (StringUtils.isNotBlank(receiveData)){
            String[] split = receiveData.split("\\|");
            String commandData = split[2];
            String imei = split[3];
            if (ClientCache.clientMap.get(imei) != null && ClientCache.clientMap.get(imei).equals(ctx)) {
                //接收到服务端发来的数据进行业务处理
                log.info("接收数据成功！" + DateUtils.dateToString(new Date()));
            } else {
                //接收到服务端发来的数据进行业务处理
                //如果map中没有此ctx 将连接存入map中
                ClientCache.clientMap.put(imei, ctx);
                log.info("连接成功，加入map管理连接！"+"imei:" +imei+" " +""+ DateUtils.dateToString(new Date()));
            }
            Context context = new Context();
            context.calCommandData(commandData,receiveData,ctx);
            log.info("处理业务数据成功");
        }else {
            log.info(""+"不是检测的数据"+ msg.toString()+" "+ DateUtils.dateToString(new Date()));
        }
        //回应客户端
        log.info("回应客户端");
    }

    /**
     * 从客户端收到新的数据、读取完成时调用
     *
     * @param ctx
     */
    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws IOException
    {
        log.info("channelReadComplete");
    	ctx.flush();
    }

    /**
     * 当出现 Throwable 对象才会被调用，即当 Netty 由于 IO 错误或者处理器在处理事件时抛出的异常时
     *
     * @param ctx
     * @param cause
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws IOException
    {
        log.error("exceptionCaught",cause);
        ClientCache.removeChannnelMap(ctx);
        ctx.close();//抛出异常，断开与客户端的连接
    }

    /**
     * 客户端与服务端第一次建立连接时 执行
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception, IOException
    {
        super.channelActive(ctx);
        log.info("客户端与服务端第一次建立连接时执行");
        ctx.channel().read();
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
        //此处不能使用ctx.close()，否则客户端始终无法与服务端建立连接
        log.info("channelActive:"+clientIp+ctx.name());
    }

    /**
     * 客户端主动断开服务端的链接,关闭流
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception, IOException
    {
        super.channelInactive(ctx);
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
        ClientCache.removeChannnelMap(ctx);
        ctx.close(); //断开连接时，必须关闭，否则造成资源浪费，并发量很大情况下可能造成宕机
        log.info("channelInactive:"+clientIp);
    }

    /**
     * 服务端当read超时, 会调用这个方法
     *
     * @param ctx
     * @param evt
     * @throws Exception
     */
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception, IOException
    {
        super.userEventTriggered(ctx, evt);
        InetSocketAddress insocket = (InetSocketAddress) ctx.channel().remoteAddress();
        String clientIp = insocket.getAddress().getHostAddress();
        ctx.close();//超时时断开连接
        log.info("userEventTriggered:"+clientIp);
    }
}
