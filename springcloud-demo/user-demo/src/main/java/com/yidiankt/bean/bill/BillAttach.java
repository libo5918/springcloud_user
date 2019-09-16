package com.yidiankt.bean.bill;

import com.yidiankt.bean.basicBean.*;

/*附着话单参数*/
public class BillAttach extends BillCommon {
    private String          emulationNe;                       //仿真网元名称，当前模块产生
    private String          msisdn;                            //手机号码
    private String          imsi;                              //国际移动识别符
    private ProcessResult attachResult;                      //附着结果
    private ProcessResult   ueAuthResult;                      //鉴权结果
    private ProcessResult   ueSecModeResult;                   //安全模式结果
    private ProcessResult   pdpResult;                         //PDP激活结果
    private IpAddr ueIpAddr;                          //手机激活IP地址。
    private BearerInfo bearerInfo;                        //承载信息
    private DnsIpAddr primaryDns;                        //主 DNS 地址
    private DnsIpAddr       secondaryDns;                      //备 DNS 地址
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象
    private String          returnResult;                      //返回结果

    public String getEmulationNe() {
        return emulationNe;
    }

    public void setEmulationNe(String emulationNe) {
        this.emulationNe = emulationNe;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

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

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }
}
