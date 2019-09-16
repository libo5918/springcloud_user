package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebLteReceiveSmsResp extends EnodebCommonResp {
    private ProcessResult mtsmsResult;                       //发短信结果
    private String              sms;                               //短信内容
    private String              signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getMtsmsResult() {
        return mtsmsResult;
    }

    public void setMtsmsResult(ProcessResult mtsmsResult) {
        this.mtsmsResult = mtsmsResult;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getSignalFlow() {
        return signalFlow;
    }

    public void setSignalFlow(String signalFlow) {
        this.signalFlow = signalFlow;
    }

    public FailureInfo getFailureInfo() {
        return failureInfo;
    }

    public void setFailureInfo(FailureInfo failureInfo) {
        this.failureInfo = failureInfo;
    }
}
