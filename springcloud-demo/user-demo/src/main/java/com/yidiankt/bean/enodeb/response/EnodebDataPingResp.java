package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebDataPingResp extends EnodebCommonResp {
    private String              ueIp;                              //手机使用的 IP 地址
    private String              dnsIp;                             //DNS 地址
    private ProcessResult dnsResult;                         //DNS 解析结果
    private ProcessResult       pingResult;                        //PING 结果
    private Long                packetLoss;                        //丢失数据包数量
    private Long                packetJitter;                      //抖动值
    private Long                packetDelay;                       //PING 时延，单位：毫秒
    private String              signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象

    public String getUeIp() {
        return ueIp;
    }

    public void setUeIp(String ueIp) {
        this.ueIp = ueIp;
    }

    public String getDnsIp() {
        return dnsIp;
    }

    public void setDnsIp(String dnsIp) {
        this.dnsIp = dnsIp;
    }

    public ProcessResult getDnsResult() {
        return dnsResult;
    }

    public void setDnsResult(ProcessResult dnsResult) {
        this.dnsResult = dnsResult;
    }

    public ProcessResult getPingResult() {
        return pingResult;
    }

    public void setPingResult(ProcessResult pingResult) {
        this.pingResult = pingResult;
    }

    public Long getPacketLoss() {
        return packetLoss;
    }

    public void setPacketLoss(Long packetLoss) {
        this.packetLoss = packetLoss;
    }

    public Long getPacketJitter() {
        return packetJitter;
    }

    public void setPacketJitter(Long packetJitter) {
        this.packetJitter = packetJitter;
    }

    public Long getPacketDelay() {
        return packetDelay;
    }

    public void setPacketDelay(Long packetDelay) {
        this.packetDelay = packetDelay;
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
