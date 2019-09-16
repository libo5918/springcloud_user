package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.*;

/*enodeb附着返回结果参数，回给编排器*/
public class EnodebAttachResp extends EnodebCommonResp {
    private ProcessResult attachResult;                      //附着结果
    private ProcessResult   ueAuthResult;                      //鉴权结果
    private ProcessResult   ueSecModeResult;                   //安全模式结果
    private ProcessResult   pdpResult;                         //PDP激活结果
    private IpAddr          ueIpAddr;                          //手机激活IP地址。
    private BearerInfo      bearerInfo;                        //承载信息
    private DnsIpAddr       primaryDns;                         //主 DNS 地址
    private DnsIpAddr       secondaryDns;                      //备 DNS 地址
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getAttachResult() {
        return attachResult;
    }

    public void setAttachResult(ProcessResult attachResult) {
        this.attachResult = attachResult;
    }

    public ProcessResult getUeAuthResult() {
        return ueAuthResult;
    }

    public void setUeAuthResult(ProcessResult ueAuthResult) {
        this.ueAuthResult = ueAuthResult;
    }

    public ProcessResult getUeSecModeResult() {
        return ueSecModeResult;
    }

    public void setUeSecModeResult(ProcessResult ueSecModeResult) {
        this.ueSecModeResult = ueSecModeResult;
    }

    public ProcessResult getPdpResult() {
        return pdpResult;
    }

    public void setPdpResult(ProcessResult pdpResult) {
        this.pdpResult = pdpResult;
    }

    public IpAddr getUeIpAddr() {
        return ueIpAddr;
    }

    public void setUeIpAddr(IpAddr ueIpAddr) {
        this.ueIpAddr = ueIpAddr;
    }

    public BearerInfo getBearerInfo() {
        return bearerInfo;
    }

    public void setBearerInfo(BearerInfo bearerInfo) {
        this.bearerInfo = bearerInfo;
    }

    public DnsIpAddr getPrimaryDns() {
        return primaryDns;
    }

    public void setPrimaryDns(DnsIpAddr primaryDns) {
        this.primaryDns = primaryDns;
    }

    public DnsIpAddr getSecondaryDns() {
        return secondaryDns;
    }

    public void setSecondaryDns(DnsIpAddr secondaryDns) {
        this.secondaryDns = secondaryDns;
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
