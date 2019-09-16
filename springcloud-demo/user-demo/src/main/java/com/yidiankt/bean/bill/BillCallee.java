package com.yidiankt.bean.bill;

import com.yidiankt.bean.basicBean.BearerInfo;
import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.ProcessResult;

/*被叫微服务话单参数*/
public class BillCallee extends BillCommon {
    private String          emulationNe;                       //仿真网元名称，当前模块产生
    private String          caller;                            //主叫号码
    private String          callee;                            //被叫号码
    private String          imsi;                              //国际移动识别符
    private ProcessResult voiceDedicatedBearerResult;        //语音专用承载
    private ProcessResult   videoDedicatedBearerResult;        //视频专用承载
    private ProcessResult   callsetupResult;                   //呼叫建立结果
    private ProcessResult   preconditionResult;                //资源预留结果
    private ProcessResult   pickupResult;                      //呼叫摘机结果
    private ProcessResult   hangupResult;                      //呼叫挂机结果
    private Long            callDuration;                      //呼叫持续时间  秒
    private String          localVoiceIp;                      //本端语音媒体IP地址
    private Long            localVoicePort;                    //本端语音媒体IP端口
    private String          remoteVoiceIp;                     //远端语音媒体IP地址
    private Long            remoteVoicePort;                   //远端语音媒体IP端口
    private String          voiceCodec;                        //语音媒体编码格式
    private String          localVideoIp;                      //本端视频媒体IP地址
    private Long            localVideoPort;                    //本端视频媒体IP端口
    private String          remoteVideoIp;                     //远端语音媒体IP地址
    private Long            remoteVideoPort;                   //远端语音媒体IP端口
    private String          videoCodec;                        //视频媒体编码格式
    private BearerInfo voiceDedicatedBearerInfo;          //语音承载信息
    private BearerInfo      videoDedicatedBearerInfo;          //视频承载信息
    private String          sentDtmfs;                         //发送的DTMF码串
    private String          receivedDtmfs;                     //收到的DTMF码串
    private String          voiceFile;                         //录制生成的语音文件名称
    private String          videoFile;                         //录制生成的视频文件名称
    private String          voiceDetectResult;                 //语音检测结果
    private String          videoDetectResult;                 //视频检测结果
    private String          signalFlow;                        //信令流程信息
    private FailureInfo failureInfo;                       //失败对象
    private String          returnResult;                      //返回结果

    public String getEmulationNe() {
        return emulationNe;
    }

    public void setEmulationNe(String emulationNe) {
        this.emulationNe = emulationNe;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public ProcessResult getVoiceDedicatedBearerResult() {
        return voiceDedicatedBearerResult;
    }

    public void setVoiceDedicatedBearerResult(ProcessResult voiceDedicatedBearerResult) {
        this.voiceDedicatedBearerResult = voiceDedicatedBearerResult;
    }

    public ProcessResult getVideoDedicatedBearerResult() {
        return videoDedicatedBearerResult;
    }

    public void setVideoDedicatedBearerResult(ProcessResult videoDedicatedBearerResult) {
        this.videoDedicatedBearerResult = videoDedicatedBearerResult;
    }

    public ProcessResult getCallsetupResult() {
        return callsetupResult;
    }

    public void setCallsetupResult(ProcessResult callsetupResult) {
        this.callsetupResult = callsetupResult;
    }

    public ProcessResult getPreconditionResult() {
        return preconditionResult;
    }

    public void setPreconditionResult(ProcessResult preconditionResult) {
        this.preconditionResult = preconditionResult;
    }

    public ProcessResult getPickupResult() {
        return pickupResult;
    }

    public void setPickupResult(ProcessResult pickupResult) {
        this.pickupResult = pickupResult;
    }

    public ProcessResult getHangupResult() {
        return hangupResult;
    }

    public void setHangupResult(ProcessResult hangupResult) {
        this.hangupResult = hangupResult;
    }

    public Long getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Long callDuration) {
        this.callDuration = callDuration;
    }

    public String getLocalVoiceIp() {
        return localVoiceIp;
    }

    public void setLocalVoiceIp(String localVoiceIp) {
        this.localVoiceIp = localVoiceIp;
    }

    public Long getLocalVoicePort() {
        return localVoicePort;
    }

    public void setLocalVoicePort(Long localVoicePort) {
        this.localVoicePort = localVoicePort;
    }

    public String getRemoteVoiceIp() {
        return remoteVoiceIp;
    }

    public void setRemoteVoiceIp(String remoteVoiceIp) {
        this.remoteVoiceIp = remoteVoiceIp;
    }

    public Long getRemoteVoicePort() {
        return remoteVoicePort;
    }

    public void setRemoteVoicePort(Long remoteVoicePort) {
        this.remoteVoicePort = remoteVoicePort;
    }

    public String getVoiceCodec() {
        return voiceCodec;
    }

    public void setVoiceCodec(String voiceCodec) {
        this.voiceCodec = voiceCodec;
    }

    public String getLocalVideoIp() {
        return localVideoIp;
    }

    public void setLocalVideoIp(String localVideoIp) {
        this.localVideoIp = localVideoIp;
    }

    public Long getLocalVideoPort() {
        return localVideoPort;
    }

    public void setLocalVideoPort(Long localVideoPort) {
        this.localVideoPort = localVideoPort;
    }

    public String getRemoteVideoIp() {
        return remoteVideoIp;
    }

    public void setRemoteVideoIp(String remoteVideoIp) {
        this.remoteVideoIp = remoteVideoIp;
    }

    public Long getRemoteVideoPort() {
        return remoteVideoPort;
    }

    public void setRemoteVideoPort(Long remoteVideoPort) {
        this.remoteVideoPort = remoteVideoPort;
    }

    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public BearerInfo getVoiceDedicatedBearerInfo() {
        return voiceDedicatedBearerInfo;
    }

    public void setVoiceDedicatedBearerInfo(BearerInfo voiceDedicatedBearerInfo) {
        this.voiceDedicatedBearerInfo = voiceDedicatedBearerInfo;
    }

    public BearerInfo getVideoDedicatedBearerInfo() {
        return videoDedicatedBearerInfo;
    }

    public void setVideoDedicatedBearerInfo(BearerInfo videoDedicatedBearerInfo) {
        this.videoDedicatedBearerInfo = videoDedicatedBearerInfo;
    }

    public String getSentDtmfs() {
        return sentDtmfs;
    }

    public void setSentDtmfs(String sentDtmfs) {
        this.sentDtmfs = sentDtmfs;
    }

    public String getReceivedDtmfs() {
        return receivedDtmfs;
    }

    public void setReceivedDtmfs(String receivedDtmfs) {
        this.receivedDtmfs = receivedDtmfs;
    }

    public String getVoiceFile() {
        return voiceFile;
    }

    public void setVoiceFile(String voiceFile) {
        this.voiceFile = voiceFile;
    }

    public String getVideoFile() {
        return videoFile;
    }

    public void setVideoFile(String videoFile) {
        this.videoFile = videoFile;
    }

    public String getVoiceDetectResult() {
        return voiceDetectResult;
    }

    public void setVoiceDetectResult(String voiceDetectResult) {
        this.voiceDetectResult = voiceDetectResult;
    }

    public String getVideoDetectResult() {
        return videoDetectResult;
    }

    public void setVideoDetectResult(String videoDetectResult) {
        this.videoDetectResult = videoDetectResult;
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
