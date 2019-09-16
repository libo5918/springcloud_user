package com.yidiankt.bean.bill;

import com.yidiankt.bean.basicBean.BearerInfo;
import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

/*VoLTE或VoNR默认承载建立话单参数*/
public class BillImsPdnConn extends BillCommon {
    private String          emulationNe;                       //仿真网元名称，当前模块产生
    private String          msisdn;                            //手机号码
    private String          imsi;                              //国际移动识别符
    private ProcessResult imsPdnResult;                      //PDN建立结果
    private String[]        activedIpList;                     //激活地址列表
    private String          primaryDns;                        //主DNS地址
    private String          secondaryDns;                      //备DNS地址
    private String          apn;                               //apn名称
    private String[]        pcscfIpList;                       //PCSCF或PSBC地址列表
    private BearerInfo bearerInfo;                        //IMS默认承载信息
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

    public ProcessResult getImsPdnResult() {
        return imsPdnResult;
    }

    public void setImsPdnResult(ProcessResult imsPdnResult) {
        this.imsPdnResult = imsPdnResult;
    }

    public String[] getActivedIpList() {
        return activedIpList;
    }

    public void setActivedIpList(String[] activedIpList) {
        this.activedIpList = activedIpList;
    }

    public String getPrimaryDns() {
        return primaryDns;
    }

    public void setPrimaryDns(String primaryDns) {
        this.primaryDns = primaryDns;
    }

    public String getSecondaryDns() {
        return secondaryDns;
    }

    public void setSecondaryDns(String secondaryDns) {
        this.secondaryDns = secondaryDns;
    }

    public String getApn() {
        return apn;
    }

    public void setApn(String apn) {
        this.apn = apn;
    }

    public String[] getPcscfIpList() {
        return pcscfIpList;
    }

    public void setPcscfIpList(String[] pcscfIpList) {
        this.pcscfIpList = pcscfIpList;
    }

    public BearerInfo getBearerInfo() {
        return bearerInfo;
    }

    public void setBearerInfo(BearerInfo bearerInfo) {
        this.bearerInfo = bearerInfo;
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
