package com.yidiankt.bean.bill;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

/*取消呼叫转移话单参数*/
public class BillResetCallforwarding extends BillCommon {
    private String          emulationNe;                       //仿真网元名称，当前模块产生
    private String          msisdn;                            //手机号码
    private String          imsi;                              //国际移动识别符
    private String          ueIp;                              //手机使用的 IP 地址
    private ProcessResult cfdResetResult;                    //呼转取消结果
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

    public String getUeIp() {
        return ueIp;
    }

    public void setUeIp(String ueIp) {
        this.ueIp = ueIp;
    }

    public ProcessResult getCfdResetResult() {
        return cfdResetResult;
    }

    public void setCfdResetResult(ProcessResult cfdResetResult) {
        this.cfdResetResult = cfdResetResult;
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
