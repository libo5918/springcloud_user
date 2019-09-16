package com.yidiankt.bean.enodeb.response;

import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

public class EnodebDataHttpResp extends EnodebCommonResp {
    private String              ueIp;                              //手机使用的 IP 地址
    private String              dnsIp;                             //DNS 地址
    private ProcessResult dnsResult;                         //DNS 解析结果
    private ProcessResult       tcpResult;                         //TCP 建立结果
    private ProcessResult       httpResult;                        //网页浏览结果
    private Long                webpageSize;                       //网页大小
    private Long                downloadSpeed;                     //下载速率，单位：字节数/秒
    private Long                goodSpeedTimes;                    //平均速度大于 60KB/S 的次数
    private Long                firstResponse;                     //首个 HTTP 响应数据的时延，单位：毫秒
    private Long                dataReceiveDelay;                  //数据接收时延
    private Long                uplinkPackets;                     //上行流量包数
    private Long                downlinkPackets;                   //下行流量包数
    private Long                uplinkTraffic;                     //上行流量字节数
    private Long                downlinkTraffic;                   //下行流量字节数
    private Long                packetLoss;                        //丢失数据包数量
    private Long                packetDisorder;                    //乱序数据包数量
    private Long                packetRetransmit;                  //重传数据包数量
    private String              targetIp;                          //网页 IP 地址
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

    public ProcessResult getTcpResult() {
        return tcpResult;
    }

    public void setTcpResult(ProcessResult tcpResult) {
        this.tcpResult = tcpResult;
    }

    public ProcessResult getHttpResult() {
        return httpResult;
    }

    public void setHttpResult(ProcessResult httpResult) {
        this.httpResult = httpResult;
    }

    public Long getWebpageSize() {
        return webpageSize;
    }

    public void setWebpageSize(Long webpageSize) {
        this.webpageSize = webpageSize;
    }

    public Long getDownloadSpeed() {
        return downloadSpeed;
    }

    public void setDownloadSpeed(Long downloadSpeed) {
        this.downloadSpeed = downloadSpeed;
    }

    public Long getGoodSpeedTimes() {
        return goodSpeedTimes;
    }

    public void setGoodSpeedTimes(Long goodSpeedTimes) {
        this.goodSpeedTimes = goodSpeedTimes;
    }

    public Long getFirstResponse() {
        return firstResponse;
    }

    public void setFirstResponse(Long firstResponse) {
        this.firstResponse = firstResponse;
    }

    public Long getDataReceiveDelay() {
        return dataReceiveDelay;
    }

    public void setDataReceiveDelay(Long dataReceiveDelay) {
        this.dataReceiveDelay = dataReceiveDelay;
    }

    public Long getUplinkPackets() {
        return uplinkPackets;
    }

    public void setUplinkPackets(Long uplinkPackets) {
        this.uplinkPackets = uplinkPackets;
    }

    public Long getDownlinkPackets() {
        return downlinkPackets;
    }

    public void setDownlinkPackets(Long downlinkPackets) {
        this.downlinkPackets = downlinkPackets;
    }

    public Long getUplinkTraffic() {
        return uplinkTraffic;
    }

    public void setUplinkTraffic(Long uplinkTraffic) {
        this.uplinkTraffic = uplinkTraffic;
    }

    public Long getDownlinkTraffic() {
        return downlinkTraffic;
    }

    public void setDownlinkTraffic(Long downlinkTraffic) {
        this.downlinkTraffic = downlinkTraffic;
    }

    public Long getPacketLoss() {
        return packetLoss;
    }

    public void setPacketLoss(Long packetLoss) {
        this.packetLoss = packetLoss;
    }

    public Long getPacketDisorder() {
        return packetDisorder;
    }

    public void setPacketDisorder(Long packetDisorder) {
        this.packetDisorder = packetDisorder;
    }

    public Long getPacketRetransmit() {
        return packetRetransmit;
    }

    public void setPacketRetransmit(Long packetRetransmit) {
        this.packetRetransmit = packetRetransmit;
    }

    public String getTargetIp() {
        return targetIp;
    }

    public void setTargetIp(String targetIp) {
        this.targetIp = targetIp;
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
