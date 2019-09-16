package com.yidiankt.bean.enodeb;

import com.yidiankt.bean.basicBean.*;

/*VoLTE接收语音呼叫参数*/
public class EnodebImsReceiveVoicecallReq extends EnodebCommonReq {
    private Long                timeout;                           //等待呼入呼叫的超时时间
    private String              caller;                            //主叫来显号码
    private String              imsi;                              //国际移动用户识别码
    private String              callerCheckFlag="FullMatching";    //主叫来显检查标志（默认全匹配）
    private String              acceptFlag="Accept";               //呼叫接收标志（默认接受呼叫）
    private String              pickupFlag="Yes";                  //摘机标志（默认为Yes）
    private Long                callDuration;                      //呼叫持续时间 秒
    private PlayMediaFiles playVoice;                         //放语音参数
    private RecordMediaFiles recordVoice;                       //录语音参数
    private SendDTMF sendDTMF;                          //发DTMF参数
    private ReceiveDTMF receiveDTMF;                       //收DTMF参数
    private SendRTP sendRTP;                           //发RTP参数
    private ReceiveRTP          receiveRTP;                        //收RTP参数
    private MediaDetect         voiceDetect;                       //语音检测参数

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getCallerCheckFlag() {
        return callerCheckFlag;
    }

    public void setCallerCheckFlag(String callerCheckFlag) {
        this.callerCheckFlag = callerCheckFlag;
    }

    public String getAcceptFlag() {
        return acceptFlag;
    }

    public void setAcceptFlag(String acceptFlag) {
        this.acceptFlag = acceptFlag;
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
}
