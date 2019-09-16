package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.IpAddr;
import com.yidiankt.bean.basicBean.ProcessResult;

/*跟踪区更新返回结果，回给编排器*/
public class EnodebTauResp extends EnodebCommonResp {
    private ProcessResult tauResult;                         //tau结果
    private IpAddr ueIpAddr;                          //手机激活IP地址
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getTauResult() {
        return tauResult;
    }

    public void setTauResult(ProcessResult tauResult) {
        this.tauResult = tauResult;
    }

    public IpAddr getUeIpAddr() {
        return ueIpAddr;
    }

    public void setUeIpAddr(IpAddr ueIpAddr) {
        this.ueIpAddr = ueIpAddr;
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
