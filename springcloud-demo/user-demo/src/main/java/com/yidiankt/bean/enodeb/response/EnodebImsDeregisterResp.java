package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebImsDeregisterResp extends EnodebCommonResp {
    private ProcessResult deregisterResult;                   //去附着结果结果信息
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getDeregisterResult() {
        return deregisterResult;
    }

    public void setDeregisterResult(ProcessResult deregisterResult) {
        this.deregisterResult = deregisterResult;
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
