package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebDataUtResetCallResp extends EnodebCommonResp {
    private String              ueIp;                              //手机使用的 IP 地址
    private ProcessResult cfdSetResult;                      //呼转取消结果
    private String              signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public String getUeIp() {
        return ueIp;
    }

    public void setUeIp(String ueIp) {
        this.ueIp = ueIp;
    }

    public ProcessResult getCfdSetResult() {
        return cfdSetResult;
    }

    public void setCfdSetResult(ProcessResult cfdSetResult) {
        this.cfdSetResult = cfdSetResult;
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
