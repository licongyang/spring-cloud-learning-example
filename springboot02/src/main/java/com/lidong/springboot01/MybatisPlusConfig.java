package com.lidong.springboot01;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantHandler;
import com.baomidou.mybatisplus.extension.plugins.tenant.TenantSqlParser;
import com.google.common.collect.Lists;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.LongValue;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@MapperScan("com.lidong.springboot01")
public class MybatisPlusConfig {
 
  private static final String SYSTEM_TENANT_ID = "provider_id";
  private static final List<String> IGNORE_TENANT_TABLES = Lists.newArrayList("provider");
 
  @Autowired
  private ApiContext apiContext;
 
  @Bean
  public PaginationInterceptor paginationInterceptor() {
    PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
 
    // SQL解析处理拦截：增加租户处理回调。
    TenantSqlParser tenantSqlParser = new TenantSqlParser()
        .setTenantHandler(new TenantHandler() {
 
          @Override
          public Expression getTenantId() {
            // 从当前系统上下文中取出当前请求的服务商ID，通过解析器注入到SQL中。
            Long currentProviderId = apiContext.getCurrentProviderId();
            if (null == currentProviderId) {
              throw new RuntimeException("#1129 getCurrentProviderId error.");
            }
            return new LongValue(currentProviderId);
          }
 
          @Override
          public String getTenantIdColumn() {
            return SYSTEM_TENANT_ID;
          }
 
          @Override
          public boolean doTableFilter(String tableName) {
            // 忽略掉一些表：如租户表（provider）本身不需要执行这样的处理。
            return IGNORE_TENANT_TABLES.stream().anyMatch((e) -> e.equalsIgnoreCase(tableName));
          }
        });
    paginationInterceptor.setSqlParserList(Lists.newArrayList(tenantSqlParser));
    return paginationInterceptor;
  }
 
  @Bean(name = "performanceInterceptor")
  public PerformanceInterceptor performanceInterceptor() {
    return new PerformanceInterceptor();
  }
}