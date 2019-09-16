package com.yidiankt.bean.bill;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

/*VoLTE或VoNR注册话单参数*/
public class BillImsRegister extends BillCommon {
    private String          emulationNe;                       //仿真网元名称，当前模块产生
    private String          msisdn;                            //手机号码
    private String          imsi;                              //国际移动识别符
    private ProcessResult registerResult;                    //VoLTE注册结果信息
    private ProcessResult   ueAuthResult;                      //鉴权结果信息
    private String          psbcIp;                            //使用的 PSBC 的 IP 地址
    private String          scscfName;                         //S-CSCF 网元名称
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

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }
}
