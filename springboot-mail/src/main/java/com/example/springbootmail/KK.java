package com.example.springbootmail;

import java.util.List;

public class KK {


    /**
     * sampling : 125
     * leads : [{"ecg":[0.26,0.2,0.12,0.06,0.01,-0.02,-0.05,-0.07,-0.09,-0.09,-0.1,-0.09,-0.1,-0.1,-0.1,-0.09,-0.1,-0.09,-0.09,-0.1,-0.07,-0.09,-0.07,-0.07,-0.07,-0.06,-0.07,-0.06,-0.06,-0.07,-0.04,-0.02,-0.02,-0.04,-0.05,-0.05,-0.05,-0.06,-0.07,-0.09,-0.09,-0.07,-0.07,-0.07,-0.09,-0.07,-0.02,0.3,0.54,0.47,0,-0.82,-0.95,-0.52,-0.17,-0.07,0,-0.01,0.01,0.04,0.01,0.07,0.05,0.09,0.11,0.1,0.17,0.17,0.22,0.26,0.27,0.34,0.36,0.38,0.38,0.36,0.33,0.26,0.2,0.14,0.06,0.01,-0.02,-0.05,-0.09,-0.1,-0.1,-0.11,-0.1,-0.11,-0.1,-0.11,-0.11,-0.12,-0.11,-0.11,-0.11,-0.1,-0.1,-0.1,-0.09,-0.1,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.09,-0.06,-0.05,-0.05,-0.04,-0.05,-0.06,-0.06,-0.07,-0.07,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.07,-0.06,0.01,0.38,0.5,0.41,-0.23,-0.94,-0.85,-0.38,-0.14,-0.06,0,-0.01,0.02,0.02,0.02,0.07,0.05,0.1,0.11,0.14,0.17,0.18,0.23,0.26,0.3,0.36,0.34,0.38,0.37,0.36,0.32,0.25,0.2,0.12,0.05,0,-0.04,-0.06,-0.09,-0.1,-0.09,-0.11,-0.1,-0.11,-0.1,-0.11,-0.11,-0.11,-0.1,-0.1,-0.1,-0.09,-0.1,-0.09,-0.09,-0.09,-0.07,-0.07,-0.07,-0.07,-0.07,-0.07,-0.07,-0.06,-0.02,-0.01,-0.02,-0.04,-0.05,-0.05,-0.06,-0.06,-0.07,-0.07,-0.07,-0.09,-0.07,-0.06,-0.07,-0.04,0.16,0.52,0.53,0.2,-0.68,-1,-0.65,-0.25,-0.1,0,0,0.01,0.05,0.02,0.06,0.07,0.09,0.12,0.1,0.16,0.17,0.2,0.26,0.27,0.33,0.36,0.37,0.41,0.37,0.36,0.3,0.23,0.17,0.1,0.04,0,-0.04,-0.07,-0.09,-0.09,-0.1,-0.09,-0.09,-0.1,-0.09,-0.1,-0.09,-0.1,-0.09,-0.07,-0.09,-0.07,-0.09,-0.06,-0.07,-0.06,-0.06,-0.06,-0.06,-0.06,-0.05,-0.05,-0.02,-0.01,-0.02,-0.02,-0.04,-0.05,-0.05,-0.06,-0.06,-0.06,-0.07,-0.06,-0.06,-0.06,-0.06,-0.04,0.14,0.53,0.6,0.3,-0.57,-0.98,-0.7,-0.3,-0.1,0,0.01,0.01,0.06,0.02,0.06,0.07,0.07,0.11,0.11,0.15,0.17,0.18,0.25,0.27,0.32,0.34,0.38,0.39,0.37,0.34,0.31,0.23,0.18,0.11,0.05,0,-0.04,-0.05,-0.09,-0.07,-0.09,-0.09,-0.09,-0.1,-0.09,-0.1,-0.1,-0.09,-0.1,-0.07,-0.09,-0.07,-0.09,-0.07,-0.06,-0.06,-0.06,-0.06,-0.05,-0.05,-0.04,-0.02,-0.01,-0.04,-0.05,-0.06,-0.05,-0.06,-0.07,-0.07,-0.07,-0.06,-0.07,-0.06,-0.07,-0.07,-0.02,0.26,0.57,0.5,0,-0.84,-0.92,-0.55,-0.2,-0.09,0,0,0.01,0.05,0.02,0.09,0.07,0.1,0.12,0.11,0.17,0.17,0.22,0.27,0.28,0.36,0.37,0.39,0.39,0.37,0.34,0.28,0.21,0.15,0.06,0.01,-0.02,-0.05,-0.07,-0.1,-0.11,-0.1,-0.11,-0.1,-0.11,-0.11,-0.11,-0.1,-0.11,-0.1,-0.1,-0.09,-0.09,-0.1,-0.07,-0.09,-0.09,-0.07,-0.07,-0.07,-0.07,-0.07,-0.04,-0.04,-0.02,-0.05,-0.04,-0.06,-0.06,-0.07,-0.07,-0.09,-0.09,-0.07,-0.09,-0.07,-0.06,-0.07,-0.04,0.23,0.55,0.49,0.06,-0.78,-0.97,-0.6,-0.2,-0.1,-0.01,0,0,0.04,0,0.06,0.06,0.07,0.12,0.1,0.16,0.17,0.21,0.26,0.27,0.34,0.36,0.38,0.39,0.36,0.34,0.28,0.22,0.15,0.07,0.01,-0.02,-0.07,-0.09,-0.1,-0.1,-0.11,-0.11,-0.11,-0.12,-0.11,-0.12,-0.12,-0.11,-0.11,-0.12,-0.11,-0.11,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.09,-0.07,-0.09,-0.06,-0.05,-0.04,-0.04,-0.06,-0.06,-0.06,-0.07,-0.07,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.09,-0.06,0.17,0.5,0.46,0.18,-0.66,-0.98,-0.64,-0.21,-0.12,-0.01,0,-0.01,0.04,0,0.05,0.06,0.06,0.11,0.1,0.15,0.17,0.2,0.26,0.27,0.32,0.36,0.37,0.39,0.37,0.34,0.3,0.22,0.16,0.09,0.04,-0.01,-0.05,-0.07,-0.09,-0.1,-0.11,-0.1,-0.11,-0.11,-0.1,-0.11,-0.11,-0.11,-0.11,-0.1,-0.1,-0.1,-0.1,-0.09,-0.1,-0.09,-0.09,-0.07,-0.09,-0.09,-0.07,-0.06,-0.09,-0.07,-0.04,-0.04,-0.04,-0.05,-0.05,-0.06,-0.07,-0.06,-0.09,-0.09,-0.1,-0.09,-0.09,-0.07,-0.07,-0.07,0.06,0.44,0.52,0.34,-0.42,-1,-0.78,-0.33,-0.12,-0.04,0,-0.02,0.04,0.01,0.04,0.07,0.06,0.11,0.11,0.14,0.18,0.18,0.25,0.28,0.31,0.36,0.36,0.39,0.38,0.36,0.32,0.26,0.21,0.12,0.05,0,-0.04,-0.06,-0.09,-0.1,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.1,-0.1,-0.11,-0.1,-0.1,-0.09,-0.09,-0.1,-0.09,-0.09,-0.07,-0.09,-0.07,-0.09,-0.07,-0.07,-0.06,-0.05,-0.04,-0.02,-0.04,-0.05,-0.05,-0.06,-0.06,-0.06,-0.07,-0.07,-0.07,-0.09,-0.07,-0.07,-0.07,-0.02,0.26,0.58,0.53,0,-0.84,-0.95,-0.55,-0.2,-0.07,0.01,0,0.02,0.05,0.02,0.09,0.06,0.09,0.11,0.11,0.17,0.17,0.21,0.26,0.28,0.33,0.34,0.39,0.39,0.37,0.34,0.3,0.23,0.16,0.07,0.02,-0.02,-0.05,-0.06,-0.09,-0.09,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.11,-0.11,-0.1,-0.09,-0.1,-0.1,-0.09,-0.09,-0.07,-0.07,-0.09,-0.07,-0.07,-0.07,-0.06,-0.05,-0.04,-0.02,-0.05,-0.05,-0.06,-0.07,-0.07,-0.09,-0.09,-0.07,-0.09,-0.07,-0.07,-0.07,-0.06,0.04,0.43,0.6,0.41,-0.36,-0.97,-0.79,-0.38,-0.12,-0.04,0,-0.01,0.02,0.02,0.02,0.07,0.05,0.11,0.1,0.12,0.17,0.18,0.23,0.26,0.3,0.36,0.37,0.39,0.38,0.36,0.32,0.25,0.2,0.11,0.06,0,-0.04,-0.06,-0.09,-0.09,-0.09,-0.1,-0.11,-0.11,-0.11,-0.11,-0.11,-0.1,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.06,-0.07,-0.05,-0.04,-0.02,-0.04,-0.06,-0.06,-0.06,-0.07,-0.07,-0.09,-0.1,-0.09,-0.09,-0.09,-0.07,-0.09,-0.04,0.21,0.54,0.49,0.07,-0.78,-0.97,-0.6,-0.21,-0.1,0,0,0,0.05,0.01,0.07,0.06,0.09,0.12,0.11,0.17,0.18,0.22,0.27,0.28,0.34,0.37,0.39,0.42,0.37,0.37,0.3,0.23,0.17,0.09,0.04,-0.01,-0.04,-0.06,-0.09,-0.09,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.1,-0.1,-0.09,-0.1,-0.09,-0.09,-0.1,-0.09,-0.07,-0.07,-0.07,-0.07,-0.06,-0.06,-0.06,-0.05,-0.04,-0.02,-0.01,-0.04,-0.04,-0.05,-0.05,-0.06,-0.07,-0.07,-0.07,-0.07,-0.07,-0.06,-0.07,-0.07,0,0.33,0.54,0.44,-0.09,-0.87,-0.9,-0.47,-0.14,-0.07,0,-0.01,0.01,0.04,0.01,0.07,0.04,0.09,0.11,0.1,0.17,0.17,0.22,0.26,0.28,0.34,0.36,0.38,0.39,0.36,0.34,0.27,0.21,0.15,0.06,0.01,-0.02,-0.06,-0.07,-0.09,-0.1,-0.11,-0.11,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.07,-0.07,-0.07,-0.06,-0.06,-0.02,-0.05,-0.05,-0.05,-0.07,-0.07,-0.07,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.07,-0.07,0.1,0.47,0.48,0.27,-0.52,-1,-0.73,-0.27,-0.1,-0.04,0,-0.01,0.04,0.01,0.04,0.06,0.05,0.11,0.11,0.15,0.17,0.2,0.26,0.27,0.32,0.37,0.37,0.41,0.38,0.36,0.32,0.26,0.2,0.11,0.05,0,-0.05,-0.06,-0.09,-0.1,-0.09,-0.09,-0.1,-0.09,-0.1,-0.1,-0.1,-0.09,-0.1,-0.1,-0.1,-0.1,-0.09,-0.07,-0.09,-0.07,-0.07,-0.07,-0.07,-0.07,-0.07,-0.06,-0.06,-0.05,-0.02,-0.02,-0.02,-0.05,-0.05,-0.05,-0.06,-0.06,-0.07,-0.07,-0.07,-0.07,-0.06,-0.07,-0.06,-0.04,0.17,0.52,0.52,0.16,-0.7,-0.97,-0.63,-0.22,-0.07,0.01,0,0.01,0.06,0.02,0.09,0.09,0.09,0.14,0.12,0.17,0.18,0.21,0.27,0.28,0.33,0.37,0.39,0.42,0.39,0.38,0.32,0.25,0.2,0.1,0.05,0,-0.02,-0.05,-0.07,-0.09,-0.09,-0.1,-0.1,-0.1,-0.09,-0.1,-0.1,-0.1,-0.09,-0.09,-0.1,-0.09,-0.09,-0.07,-0.09,-0.07,-0.07,-0.07,-0.07,-0.07,-0.06,-0.06,-0.07,-0.05,-0.04,-0.02,-0.02,-0.04,-0.05,-0.06,-0.06,-0.06,-0.07,-0.06,-0.07,-0.06,-0.06,-0.06,-0.06,-0.05,0.15,0.52,0.58,0.23,-0.64,-0.98,-0.68,-0.3,-0.1,0,0.01,0,0.06,0.02,0.07,0.09,0.09,0.12,0.11,0.15,0.17,0.2,0.26,0.27,0.33,0.37,0.38,0.41,0.39,0.37,0.32,0.26,0.2,0.12,0.06,0,-0.02,-0.05,-0.07,-0.09,-0.09,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.09,-0.09,-0.07,-0.07,-0.06,-0.07,-0.07,-0.06,-0.06,-0.06,-0.06,-0.05,-0.02,-0.02,-0.04,-0.05,-0.05,-0.06,-0.06,-0.07,-0.07,-0.09,-0.06,-0.07,-0.06,-0.06,-0.06,0,0.33,0.58,0.44,-0.17,-0.92,-0.89,-0.48,-0.16,-0.07,0.02,0,0.04,0.04,0.04,0.09,0.06,0.1,0.12,0.12,0.18,0.18,0.25,0.28,0.3,0.37,0.38,0.41,0.41,0.39,0.36,0.28,0.23,0.15,0.09,0.01,-0.02,-0.04,-0.06,-0.09,-0.09,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.07,-0.07,-0.07,-0.06,-0.06,-0.07,-0.07,-0.06,-0.07,-0.06,-0.06,-0.04,-0.02,-0.02,-0.04,-0.05,-0.06,-0.07,-0.06,-0.06,-0.07,-0.07,-0.07,-0.06,-0.06,-0.07,-0.05,0.07,0.46,0.53,0.33,-0.41,-0.98,-0.79,-0.34,-0.12,-0.04,0,-0.01,0.04,0.02,0.05,0.07,0.06,0.11,0.11,0.15,0.17,0.18,0.25,0.27,0.32,0.36,0.37,0.41,0.39,0.37,0.33,0.26,0.22,0.12,0.06,0.01,-0.04,-0.05,-0.09,-0.1,-0.09,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.09,-0.09,-0.07,-0.09,-0.09,-0.09,-0.09,-0.09,-0.07,-0.04,-0.02,-0.02,-0.05,-0.05,-0.06,-0.07,-0.06,-0.09,-0.07,-0.07,-0.09,-0.07,-0.07,-0.07,-0.06,0,0.34,0.53,0.43,-0.11,-0.87,-0.9,-0.46,-0.14,-0.06,0,0,0.01,0.04,0.02,0.07,0.05,0.1,0.12,0.12,0.18,0.18,0.23,0.27,0.3,0.36,0.36,0.38,0.41,0.37,0.36,0.28,0.22,0.15,0.06,0.02,-0.04,-0.07,-0.09,-0.1,-0.1,-0.11,-0.1,-0.11,-0.12,-0.11,-0.12,-0.12,-0.11,-0.11,-0.11,-0.11,-0.11,-0.1,-0.1,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.09,-0.07,-0.07,-0.06,-0.05,-0.02,-0.02,-0.04,-0.05,-0.05,-0.06,-0.07,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.07,-0.07,0,0.32,0.54,0.43,-0.12,-0.91,-0.92,-0.52,-0.17,-0.06,0.01,0,0.04,0.05,0.04,0.1,0.06,0.1,0.12,0.12,0.17,0.17,0.23,0.27,0.3,0.36,0.37,0.39,0.41,0.38,0.36,0.3,0.23,0.16,0.09,0.05,0,-0.04,-0.07,-0.09,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.1,-0.11,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.1,-0.07,-0.07,-0.07,-0.07,-0.07,-0.06,-0.06,-0.06,-0.05,-0.04,-0.02,-0.05,-0.05,-0.05,-0.06,-0.06,-0.07,-0.09,-0.09,-0.06,-0.09,-0.06,-0.07,-0.06,0.1,0.49,0.59,0.32,-0.53,-1.01,-0.74,-0.33,-0.12,-0.01,0.01,0,0.06,0.04,0.06,0.09,0.06,0.12,0.11,0.14,0.18,0.18,0.26,0.26,0.32,0.36,0.37,0.42,0.39,0.37,0.32,0.26,0.2,0.11,0.05,0,-0.02,-0.06,-0.07,-0.09,-0.09,-0.11,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.1,-0.1,-0.1,-0.1,-0.09,-0.07,-0.09,-0.09,-0.09,-0.07,-0.06,-0.06,-0.06,-0.04,-0.02,-0.02,-0.05,-0.06,-0.06,-0.07,-0.07,-0.09,-0.1,-0.09,-0.09,-0.09,-0.09,-0.09,-0.06,0.1,0.49,0.54,0.25,-0.58,-1.02,-0.73,-0.32,-0.12,-0.02,0,0,0.04,0.01,0.05,0.06,0.06,0.11,0.1,0.14,0.16,0.18,0.25,0.26,0.32,0.36,0.38,0.39,0.38,0.36,0.32,0.26,0.2,0.11,0.05,0,-0.04,-0.06,-0.09,-0.1,-0.1,-0.1,-0.1,-0.11,-0.11,-0.11,-0.11,-0.1,-0.1,-0.11,-0.1,-0.1,-0.09,-0.09,-0.09,-0.1,-0.09,-0.09,-0.09,-0.09,-0.07,-0.06,-0.05,-0.02,-0.05,-0.06,-0.05,-0.07,-0.07,-0.07,-0.09,-0.09,-0.1,-0.09,-0.09,-0.07,-0.07,-0.06,0.17,0.52,0.48,0.17,-0.66,-1,-0.66,-0.23,-0.11,-0.01,-0.01,0,0.04,0,0.05,0.06,0.05,0.1,0.1,0.15,0.16,0.18,0.26,0.27,0.33,0.37,0.37,0.41,0.38,0.36,0.31,0.25,0.17,0.1,0.04,-0.01,-0.05,-0.06,-0.09,-0.1,-0.1,-0.1,-0.1,-0.1,-0.11,-0.1,-0.11,-0.1,-0.1,-0.11,-0.1,-0.1,-0.1,-0.1,-0.09,-0.09,-0.09,-0.09,-0.07,-0.09,-0.09,-0.06,-0.05,-0.02,-0.04,-0.05,-0.05,-0.06,-0.07,-0.09,-0.07,-0.09,-0.09,-0.09,-0.09,-0.06,-0.07,-0.06,0.04,0.38,0.5,0.38,-0.26,-0.95,-0.84,-0.38,-0.12,-0.06,0.01,-0.01,0.02,0.01,0.02,0.09,0.05,0.1,0.11,0.12,0.17,0.18,0.23,0.27,0.31,0.36,0.37,0.38,0.38,0.37,0.33,0.27,0.21,0.15,0.05,0.01,-0.02,-0.06,-0.09,-0.1,-0.1,-0.11,-0.1,-0.1,-0.1,-0.11,-0.11,-0.11,-0.1,-0.11,-0.1,-0.09,-0.1,-0.09,-0.09,-0.1,-0.07,-0.07,-0.09,-0.07,-0.07,-0.05,-0.04,-0.01,-0.04,-0.06,-0.06,-0.06,-0.07,-0.09,-0.09,-0.09,-0.09,-0.07,-0.07,-0.07,-0.07,-0.05,0.14,0.5,0.53,0.2,-0.66,-1.01,-0.69,-0.27,-0.1,0,0,0,0.05,0.02,0.06,0.07,0.07,0.11,0.11,0.16,0.17,0.2,0.25,0.27,0.33,0.36,0.37,0.42,0.39,0.37,0.32,0.25,0.21,0.11,0.06,0,-0.02,-0.05,-0.07,-0.09,-0.09,-0.09,-0.1,-0.09,-0.1,-0.09,-0.09,-0.07,-0.07,-0.07,-0.07,-0.06,-0.07,-0.06,-0.06,-0.06,-0.05,-0.04,-0.04,-0.02,-0.01,0,-0.01,-0.04,-0.04,-0.04,-0.06,-0.06,-0.06,-0.07,-0.07,-0.06,-0.06,-0.05,-0.06,-0.05,0.11,0.5,0.59,0.32,-0.52,-0.97,-0.7,-0.28,-0.09,0,0.02,0.01,0.07,0.04,0.07,0.1,0.09,0.14,0.12,0.16,0.18,0.2,0.26,0.28,0.33,0.37,0.38,0.41,0.38,0.37,0.33,0.25,0.18,0.11,0.05,0,-0.04,-0.06,-0.07,-0.07,-0.09,-0.11,-0.1,-0.11,-0.11,-0.11,-0.12,-0.12,-0.12,-0.12,-0.11,-0.1,-0.1,-0.1,-0.09,-0.09,-0.09,-0.09,-0.07,-0.06,-0.06,-0.11,-0.16]}]
     */

    private int sampling;
    private List<LeadsBean> leads;

    public int getSampling() {
        return sampling;
    }

    public void setSampling(int sampling) {
        this.sampling = sampling;
    }

    public List<LeadsBean> getLeads() {
        return leads;
    }

    public void setLeads(List<LeadsBean> leads) {
        this.leads = leads;
    }

    public static class LeadsBean {
        private List<Double> ecg;

        public List<Double> getEcg() {
            return ecg;
        }

        public void setEcg(List<Double> ecg) {
            this.ecg = ecg;
        }
    }
}
