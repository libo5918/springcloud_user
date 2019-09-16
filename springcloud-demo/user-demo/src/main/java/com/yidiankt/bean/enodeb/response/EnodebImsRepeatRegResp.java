package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebImsRepeatRegResp extends EnodebCommonResp {
    private ProcessResult registerResult;                    //VoLTE注册结果信息
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getRegisterResult() {
        return registerResult;
    }

    public void setRegisterResult(ProcessResult registerResult) {
        this.registerResult = registerResult;
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
