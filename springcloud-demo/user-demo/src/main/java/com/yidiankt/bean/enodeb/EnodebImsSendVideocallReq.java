package com.yidiankt.bean.enodeb;


import com.yidiankt.bean.basicBean.*;

/*VoLTE发起视频呼叫参数*/
public class EnodebImsSendVideocallReq extends EnodebCommonReq {
    private String              imsi;                              //国际移动用户识别码
    private String              callee;                            //被叫号码
    private String              pickupFlag="Yes";                  //摘机标志（默认为Yes）
    private Long                callDuration;                      //呼叫持续时间 秒
    private String              videoFallbackVoiceFlag="No";       //视频呼叫回落到语音呼叫启用标志
    private PlayMediaFiles playVoice;                         //放语音参数
    private RecordMediaFiles recordVoice;                       //录语音参数
    private PlayMediaFiles      playVideo;                         //放视频参数
    private RecordMediaFiles    recordVideo;                       //录视频参数
    private SendDTMF sendDTMF;                          //发DTMF参数
    private ReceiveDTMF receiveDTMF;                       //收DTMF参数
    private SendRTP sendRTP;                           //发RTP参数
    private ReceiveRTP          receiveRTP;                        //收RTP参数
    private MediaDetect         voiceDetect;                       //语音检测参数
    private MediaDetect         videoDetect;                       //视频检测参数

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getCallee() {
        return callee;
    }

    public void setCallee(String callee) {
        this.callee = callee;
    }

    public String getPickupFlag() {
        return pickupFlag;
    }

    public void setPickupFlag(String pickupFlag) {
        this.pickupFlag = pickupFlag;
    }

    public Long getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Long callDuration) {
        this.callDuration = callDuration;
    }

    public String getVideoFallbackVoiceFlag() {
        return videoFallbackVoiceFlag;
    }

    public void setVideoFallbackVoiceFlag(String videoFallbackVoiceFlag) {
        this.videoFallbackVoiceFlag = videoFallbackVoiceFlag;
    }

    public PlayMediaFiles getPlayVoice() {
        return playVoice;
    }

    public void setPlayVoice(PlayMediaFiles playVoice) {
        this.playVoice = playVoice;
    }

    public RecordMediaFiles getRecordVoice() {
        return recordVoice;
    }

    public void setRecordVoice(RecordMediaFiles recordVoice) {
        this.recordVoice = recordVoice;
    }

    public PlayMediaFiles getPlayVideo() {
        return playVideo;
    }

    public void setPlayVideo(PlayMediaFiles playVideo) {
        this.playVideo = playVideo;
    }

    public RecordMediaFiles getRecordVideo() {
        return recordVideo;
    }

    public void setRecordVideo(RecordMediaFiles recordVideo) {
        this.recordVideo = recordVideo;
    }

    public SendDTMF getSendDTMF() {
        return sendDTMF;
    }

    public void setSendDTMF(SendDTMF sendDTMF) {
        this.sendDTMF = sendDTMF;
    }

    public ReceiveDTMF getReceiveDTMF() {
        return receiveDTMF;
    }

    public void setReceiveDTMF(ReceiveDTMF receiveDTMF) {
        this.receiveDTMF = receiveDTMF;
    }

    public SendRTP getSendRTP() {
        return sendRTP;
    }

    public void setSendRTP(SendRTP sendRTP) {
        this.sendRTP = sendRTP;
    }

    public ReceiveRTP getReceiveRTP() {
        return receiveRTP;
    }

    public void setReceiveRTP(ReceiveRTP receiveRTP) {
        this.receiveRTP = receiveRTP;
    }

    public MediaDetect getVoiceDetect() {
        return voiceDetect;
    }

    public void setVoiceDetect(MediaDetect voiceDetect) {
        this.voiceDetect = voiceDetect;
    }

    public MediaDetect getVideoDetect() {
        return videoDetect;
    }

    public void setVideoDetect(MediaDetect videoDetect) {
        this.videoDetect = videoDetect;
    }
}
