package com.yidiankt.bean.bill;


import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

/*VoLTE或VoNR注销话单参数*/
public class BillImsDeregister extends BillCommon {
    private String          emulationNe;                       //仿真网元名称，当前模块产生
    private String          msisdn;                            //手机号码
    private String          imsi;                              //国际移动识别符
    private ProcessResult deregisterResult;                  //去附着结果
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败信息
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

    public String getReturnResult() {
        return returnResult;
    }

    public void setReturnResult(String returnResult) {
        this.returnResult = returnResult;
    }
}
