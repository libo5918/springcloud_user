package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.BearerInfo;
import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebImsPdnConnResp extends EnodebCommonResp {
    private ProcessResult imsPdnResult;                      //PDN建立结果
    private String[]        activedIpList;                     //激活地址列表
    private String          primaryDns;                        //主DNS地址
    private String          secondaryDns;                      //备DNS地址
    private String          apn;                               //APN名称
    private String[]        pcscfIpList;                       //PCSCF或PSBC地址列表
    private BearerInfo bearerInfo;                        //IMS默认承载信息
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

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
}
