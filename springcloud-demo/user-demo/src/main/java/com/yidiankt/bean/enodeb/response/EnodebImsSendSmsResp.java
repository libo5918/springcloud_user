package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebImsSendSmsResp extends EnodebCommonResp {
    private ProcessResult mosmsResult;                       //发短信结果
    private ProcessResult       reportResult;                      //状态报告结果
    private String              signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public ProcessResult getMosmsResult() {
        return mosmsResult;
    }

    public void setMosmsResult(ProcessResult mosmsResult) {
        this.mosmsResult = mosmsResult;
    }

    public ProcessResult getReportResult() {
        return reportResult;
    }

    public void setReportResult(ProcessResult reportResult) {
        this.reportResult = reportResult;
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
