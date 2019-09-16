package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebImsRegisterResp extends EnodebCommonResp {
    private ProcessResult registerResult;                    //VoLTE注册结果信息
    private ProcessResult   ueAuthResult;                      //鉴权结果信息
    private String          psbcIp;                            //使用的 PSBC 的 IP 地址
    private String          scscfName;                         //S-CSCF 网元名称
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getRegisterResult() {
        return registerResult;
    }

    public void setRegisterResult(ProcessResult registerResult) {
        this.registerResult = registerResult;
    }

    public ProcessResult getUeAuthResult() {
        return ueAuthResult;
    }

    public void setUeAuthResult(ProcessResult ueAuthResult) {
        this.ueAuthResult = ueAuthResult;
    }

    public String getPsbcIp() {
        return psbcIp;
    }

    public void setPsbcIp(String psbcIp) {
        this.psbcIp = psbcIp;
    }

    public String getScscfName() {
        return scscfName;
    }

    public void setScscfName(String scscfName) {
        this.scscfName = scscfName;
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
