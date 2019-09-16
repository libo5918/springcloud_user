package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

/*enodeb附着返回结果参数，回给编排器*/
public class EnodebDetachResp extends EnodebCommonResp {
    private ProcessResult detachResult;                      //去附着结果
    private ProcessResult   relPdpResult;                      //去激活结果
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getDetachResult() {
        return detachResult;
    }

    public void setDetachResult(ProcessResult detachResult) {
        this.detachResult = detachResult;
    }

    public ProcessResult getRelPdpResult() {
        return relPdpResult;
    }

    public void setRelPdpResult(ProcessResult relPdpResult) {
        this.relPdpResult = relPdpResult;
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
