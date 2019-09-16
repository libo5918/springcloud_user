package com.yidiankt.controller.GenEnodeb;


import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.yidiankt.bean.basicBean.BearerInfo;
import com.yidiankt.bean.basicBean.FailureInfo;
import com.yidiankt.bean.basicBean.IpAddr;
import com.yidiankt.bean.basicBean.ProcessResult;
import com.yidiankt.bean.enodeb.response.*;
import org.springframework.beans.factory.annotation.Autowired;

public class GenEnodebBean {

    @Autowired
    private static Gson gson;

    public static EnodebAttachResp getEnodeb(){
        ProcessResult attachResult=new ProcessResult();
            attachResult.setStartTime("2019-05-18 08:05:49.010");
            attachResult.setEndTime("2019-05-18 08:05:49.210");
            attachResult.setDelay(3178L);
            attachResult.setResult("Success");
        ProcessResult ueAuthResult=new ProcessResult();
            ueAuthResult.setStartTime("2019-05-18 08:05:49.010");
            ueAuthResult.setEndTime("2019-05-18 08:05:49.210");
            ueAuthResult.setDelay(1668L);
            ueAuthResult.setResult("Success");
        ProcessResult ueSecModeResult=new ProcessResult();
            ueSecModeResult.setStartTime("2019-05-18 08:05:49.010");
            ueSecModeResult.setEndTime("2019-05-18 08:05:49.210");
            ueSecModeResult.setDelay(32L);
            ueSecModeResult.setResult("success");
        ProcessResult pdpResult=new ProcessResult();
            pdpResult.setStartTime("2019-05-18 08:05:49.010");
            pdpResult.setEndTime("2019-05-18 08:05:49.210");
            pdpResult.setDelay(338L);
            pdpResult.setResult("Success");
        IpAddr ipAddr=new IpAddr();
            ipAddr.setIpv4Addr("10.68.40.202");
            ipAddr.setIpv6Addr("");
        BearerInfo bearerIndo=new BearerInfo();
            bearerIndo.setBearerQci(9L);
            bearerIndo.setQosDelayClass(1L);
            bearerIndo.setQosReliabilityClass(2L);
            bearerIndo.setQosPeakThroughput(21312L);
            bearerIndo.setQosPrecedenceClass(1L);
            bearerIndo.setLocalIp("10.233.1.23");
            bearerIndo.setLocalTeid(124903);
            bearerIndo.setRemoteIp("2409:8888:1234:0:0:0:0:1");
            bearerIndo.setRemoteTeid(138765);
        FailureInfo failureInfo=new FailureInfo();
            failureInfo.setCode(1L);
            failureInfo.setDesc("附着失败");
            failureInfo.setSignal("Attach Reject");
            failureInfo.setSignalReason("unknownSubscriber");
        EnodebAttachResp result= new EnodebAttachResp();
        result.setInvokerId("1209");
        result.setSpanId("10039827676344");
        result.setMsisdn("13912345678");
        result.setImsi("460005712345678");
        result.setReturnResult("Success");
        result.setAttachResult(attachResult);
        result.setUeAuthResult(ueAuthResult);
        result.setUeSecModeResult(ueSecModeResult);
        result.setPdpResult(pdpResult);
        result.setUeIpAddr(ipAddr);
        result.setBearerInfo(bearerIndo);
        result.setSignalFlow("2::46::0::2019-05-17 08:34:18.259::eNodeB附着::9$9::47::1::2019-05-17 08:34:20.974::eNodeB附着响应（成功）::2");
        result.setFailureInfo(null);
        return result;
    }

    public static EnodebDetachResp getDetach(){
        ProcessResult detachResult=new ProcessResult();
            detachResult.setStartTime("2019-05-18 08:05:49.010");
            detachResult.setEndTime("2019-05-18 08:05:49.210");
            detachResult.setDelay(3178L);
            detachResult.setResult("Success");
        ProcessResult relPdpResult=new ProcessResult();
            relPdpResult.setStartTime("2019-05-18 08:05:49.010");
            relPdpResult.setEndTime("2019-05-18 08:05:49.210");
            relPdpResult.setDelay(32L);
            relPdpResult.setResult("Success");
        FailureInfo failureInfo=new FailureInfo();
            failureInfo.setCode(1l);
            failureInfo.setDesc("去附着失败");
            failureInfo.setSignal("Detach Reject");
            failureInfo.setSignalReason("unknown");
        EnodebDetachResp enodebDetachResp=new EnodebDetachResp();
        enodebDetachResp.setInvokerId("1309");
        enodebDetachResp.setSpanId("44567687888");
        enodebDetachResp.setMsisdn("13912345678");
        enodebDetachResp.setImsi("460005712345678");
        enodebDetachResp.setReturnResult("Success");
        enodebDetachResp.setDetachResult(detachResult);
        enodebDetachResp.setRelPdpResult(relPdpResult);
        enodebDetachResp.setSignalFlow("");
        enodebDetachResp.setFailureInfo(failureInfo);
        return enodebDetachResp;
    }

    public static EnodebDataHttpResp getDataHttp(){
        ProcessResult dnsResult=new ProcessResult();
        dnsResult.setStartTime("2019-05-18 08:05:49.010");
        dnsResult.setEndTime("2019-05-18 08:05:49.210");
        dnsResult.setDelay(32L);
        dnsResult.setResult("Success");
        ProcessResult tcpResult=new ProcessResult();
        tcpResult.setStartTime("2019-05-18 08:05:49.010");
        tcpResult.setEndTime("2019-05-18 08:05:49.210");
        tcpResult.setDelay(32L);
        tcpResult.setResult("Success");
        ProcessResult httpResult=new ProcessResult();
        httpResult.setStartTime("2019-05-18 08:05:49.010");
        httpResult.setEndTime("2019-05-18 08:05:49.210");
        httpResult.setDelay(32L);
        httpResult.setResult("success");
        FailureInfo failureInfo=new FailureInfo();
        failureInfo.setCode(1L);
        EnodebDataHttpResp enodebDataHttpResp=new EnodebDataHttpResp();
        enodebDataHttpResp.setInvokerId("1309");
        enodebDataHttpResp.setSpanId("12446576889");
        enodebDataHttpResp.setMsisdn("13912345678");
        enodebDataHttpResp.setImsi("460005712345678");
        enodebDataHttpResp.setReturnResult("10001 Timeout");
        enodebDataHttpResp.setUeIp("10.211.109.12");
        enodebDataHttpResp.setDnsResult(dnsResult);
        enodebDataHttpResp.setTcpResult(tcpResult);
        enodebDataHttpResp.setHttpResult(httpResult);
        enodebDataHttpResp.setWebpageSize(389102L);
        enodebDataHttpResp.setDownloadSpeed(340L);
        enodebDataHttpResp.setFirstResponse(23L);
        enodebDataHttpResp.setPacketLoss(0L);
        enodebDataHttpResp.setPacketDisorder(0L);
        enodebDataHttpResp.setPacketRetransmit(0L);
        enodebDataHttpResp.setTargetIp("122.12.3.191");
        enodebDataHttpResp.setSignalFlow("");
        enodebDataHttpResp.setFailureInfo(failureInfo);
        return enodebDataHttpResp;
    }

    public static EnodebTauResp getTau(){
        ProcessResult tauResult=new ProcessResult();
            tauResult.setStartTime("2019-05-18 08:05:49.010");
            tauResult.setEndTime("2019-05-18 08:05:49.210");
            tauResult.setDelay(32L);
            tauResult.setResult("Success");
        IpAddr ueIpAddr=new IpAddr();
            ueIpAddr.setIpv4Addr("10.68.40.202");
            ueIpAddr.setIpv6Addr("");
        EnodebTauResp enodebTauResp=new EnodebTauResp();
        enodebTauResp.setInvokerId("1209");
        enodebTauResp.setSpanId("12446576889");
        enodebTauResp.setMsisdn("13912345678");
        enodebTauResp.setImsi("460005712345678");
        enodebTauResp.setReturnResult("10001 Timeout");
        enodebTauResp.setTauResult(tauResult);
        enodebTauResp.setUeIpAddr(ueIpAddr);
        enodebTauResp.setFailureInfo(null);
        enodebTauResp.setSignalFlow("signalFlow");
        return enodebTauResp;
    }

    public static EnodebImsPdnConnResp getPdn(){
        BearerInfo bearerIndo=new BearerInfo();
        bearerIndo.setBearerQci(9L);
        bearerIndo.setQosDelayClass(1L);
        bearerIndo.setQosReliabilityClass(2L);
        bearerIndo.setQosPeakThroughput(21312L);
        bearerIndo.setQosPrecedenceClass(1L);
        bearerIndo.setLocalIp("10.233.1.23");
        bearerIndo.setLocalTeid(124903);
        bearerIndo.setRemoteIp("2409:8888:1234:0:0:0:0:1");
        bearerIndo.setRemoteTeid(138765);
        EnodebImsPdnConnResp enodebImsPdnConnResp=new EnodebImsPdnConnResp();
        enodebImsPdnConnResp.setInvokerId("1209");
        enodebImsPdnConnResp.setSpanId("12446576889");
        enodebImsPdnConnResp.setMsisdn("13912345678");
        enodebImsPdnConnResp.setImsi("460005712345678");
        enodebImsPdnConnResp.setReturnResult("Success");
        enodebImsPdnConnResp.setActivedIpList(new String[]{"2904:123:234::0001"});
        enodebImsPdnConnResp.setPrimaryDns("10.213.34.19");
        enodebImsPdnConnResp.setSecondaryDns("10.213.34.19");
        enodebImsPdnConnResp.setApn("ims");
        enodebImsPdnConnResp.setPcscfIpList(new String[]{"2409:123:234::1001","2409:123:234:1002","2409:123:234:1003"});
        enodebImsPdnConnResp.setFailureInfo(null);
        enodebImsPdnConnResp.setSignalFlow("signalFlow");
        return enodebImsPdnConnResp;
    }

    public static EnodebImsRegisterResp getRegister(){
        ProcessResult registerResult=new ProcessResult();
            registerResult.setStartTime("2019-05-18 08:05:49.010");
            registerResult.setEndTime("2019-05-18 08:05:49.210");
            registerResult.setDelay(3178L);
            registerResult.setResult("Success");
        ProcessResult ueAuthResult=new ProcessResult();
            ueAuthResult.setStartTime("2019-05-18 08:05:49.010");
            ueAuthResult.setEndTime("2019-05-18 08:05:49.210");
            ueAuthResult.setDelay(3178L);
            ueAuthResult.setResult("Success");
        EnodebImsRegisterResp enodebImsRegisterResp=new EnodebImsRegisterResp();
        enodebImsRegisterResp.setInvokerId("1209");
        enodebImsRegisterResp.setSpanId("12446576889");
        enodebImsRegisterResp.setMsisdn("13912345678");
        enodebImsRegisterResp.setImsi("460005712345678");
        enodebImsRegisterResp.setReturnResult("Success");
        enodebImsRegisterResp.setRegisterResult(registerResult);
        enodebImsRegisterResp.setUeAuthResult(ueAuthResult);
        enodebImsRegisterResp.setFailureInfo(null);
        enodebImsRegisterResp.setSignalFlow("signalFlow");
        return enodebImsRegisterResp;
    }

    public static EnodebImsRepeatRegResp getRepRegister() {
        ProcessResult registerResult=new ProcessResult();
            registerResult.setStartTime("2019-05-18 08:05:49.010");
            registerResult.setEndTime("2019-05-18 08:05:49.210");
            registerResult.setDelay(3178L);
            registerResult.setResult("Success");
        EnodebImsRepeatRegResp enodebImsRepeatRegResp=new EnodebImsRepeatRegResp();
        enodebImsRepeatRegResp.setInvokerId("1209");
        enodebImsRepeatRegResp.setSpanId("12446576889");
        enodebImsRepeatRegResp.setMsisdn("13912345678");
        enodebImsRepeatRegResp.setImsi("460005712345678");
        enodebImsRepeatRegResp.setReturnResult("Success");
        enodebImsRepeatRegResp.setRegisterResult(registerResult);
        enodebImsRepeatRegResp.setFailureInfo(null);
        enodebImsRepeatRegResp.setSignalFlow("signalFlow");
        return enodebImsRepeatRegResp;
    }

    public static EnodebImsDeregisterResp getDegister() {
        ProcessResult deregisterResult=new ProcessResult();
            deregisterResult.setStartTime("2019-05-18 08:05:49.010");
            deregisterResult.setEndTime("2019-05-18 08:05:49.210");
            deregisterResult.setDelay(3178L);
            deregisterResult.setResult("Success");
        EnodebImsDeregisterResp enodebImsDeregisterResp=new EnodebImsDeregisterResp();
        enodebImsDeregisterResp.setInvokerId("1209");
        enodebImsDeregisterResp.setSpanId("12446576889");
        enodebImsDeregisterResp.setMsisdn("13912345678");
        enodebImsDeregisterResp.setImsi("460005712345678");
        enodebImsDeregisterResp.setReturnResult("Success");
        enodebImsDeregisterResp.setDeregisterResult(deregisterResult);
        enodebImsDeregisterResp.setFailureInfo(null);
        enodebImsDeregisterResp.setSignalFlow("signalFlow");
        return enodebImsDeregisterResp;
    }

    public static EnodebImsSendVoicecallResp getSendVoice() {
        ProcessResult deregisterResult=new ProcessResult();
            deregisterResult.setStartTime("2019-05-18 08:05:49.010");
            deregisterResult.setEndTime("2019-05-18 08:05:49.210");
            deregisterResult.setDelay(3178L);
            deregisterResult.setResult("Success");
        BearerInfo bearerIndo=new BearerInfo();
            bearerIndo.setBearerQci(9L);
            bearerIndo.setQosDelayClass(1L);
            bearerIndo.setQosReliabilityClass(2L);
            bearerIndo.setQosPeakThroughput(21312L);
            bearerIndo.setQosPrecedenceClass(1L);
            bearerIndo.setLocalIp("10.233.1.23");
            bearerIndo.setLocalTeid(124903);
            bearerIndo.setRemoteIp("2409:8888:1234:0:0:0:0:1");
            bearerIndo.setRemoteTeid(138765);
        EnodebImsSendVoicecallResp enodebImsSendVoicecallResp=new EnodebImsSendVoicecallResp();
        enodebImsSendVoicecallResp.setInvokerId("1209");
        enodebImsSendVoicecallResp.setSpanId("12446576889");
        enodebImsSendVoicecallResp.setMsisdn("13912345678");
        enodebImsSendVoicecallResp.setImsi("460005712345678");
        enodebImsSendVoicecallResp.setReturnResult("Success");
        enodebImsSendVoicecallResp.setVoiceDedicatedBearerResult(deregisterResult);
        enodebImsSendVoicecallResp.setCallsetupResult(deregisterResult);
        enodebImsSendVoicecallResp.setPreconditionResult(deregisterResult);
        enodebImsSendVoicecallResp.setPickupResult(deregisterResult);
        enodebImsSendVoicecallResp.setHangupResult(deregisterResult);
        enodebImsSendVoicecallResp.setCallDuration(10L);
        enodebImsSendVoicecallResp.setLocalVoiceIp("2409::1234::1002");
        enodebImsSendVoicecallResp.setLocalVoicePort(10002L);
        enodebImsSendVoicecallResp.setRemoteVoiceIp("2409::2012::2001");
        enodebImsSendVoicecallResp.setRemoteVoicePort(28901L);
        enodebImsSendVoicecallResp.setVoiceCodec("amr");
        enodebImsSendVoicecallResp.setVoiceDedicatedBearerInfo(bearerIndo);
        enodebImsSendVoicecallResp.setSentDtmfs("C123C123C123");
        enodebImsSendVoicecallResp.setReceivedDtmfs("D123D123D123");
        enodebImsSendVoicecallResp.setVoiceFile("12242_4545.wav");
        enodebImsSendVoicecallResp.setVoiceDetectResult("yes");
        enodebImsSendVoicecallResp.setFailureInfo(null);
        enodebImsSendVoicecallResp.setSignalFlow("signalFlow");
        return enodebImsSendVoicecallResp;
    }

    public static EnodebImsSendVideocallResp getSendVideo() {
        ProcessResult deregisterResult = new ProcessResult();
            deregisterResult.setStartTime("2019-05-18 08:05:49.010");
            deregisterResult.setEndTime("2019-05-18 08:05:49.210");
            deregisterResult.setDelay(3178L);
            deregisterResult.setResult("Success");
        BearerInfo bearerIndo = new BearerInfo();
            bearerIndo.setBearerQci(9L);
            bearerIndo.setQosDelayClass(1L);
            bearerIndo.setQosReliabilityClass(2L);
            bearerIndo.setQosPeakThroughput(21312L);
            bearerIndo.setQosPrecedenceClass(1L);
            bearerIndo.setLocalIp("10.233.1.23");
            bearerIndo.setLocalTeid(124903);
            bearerIndo.setRemoteIp("2409:8888:1234:0:0:0:0:1");
            bearerIndo.setRemoteTeid(138765);
        EnodebImsSendVideocallResp enodebImsSendVideocallResp = new EnodebImsSendVideocallResp();
        enodebImsSendVideocallResp.setInvokerId("1209");
        enodebImsSendVideocallResp.setSpanId("12446576889");
        enodebImsSendVideocallResp.setMsisdn("13912345678");
        enodebImsSendVideocallResp.setImsi("460005712345678");
        enodebImsSendVideocallResp.setReturnResult("Success");
        enodebImsSendVideocallResp.setVoiceDedicatedBearerResult(deregisterResult);
        enodebImsSendVideocallResp.setVideoDedicatedBearerResult(deregisterResult);
        enodebImsSendVideocallResp.setCallsetupResult(deregisterResult);
        enodebImsSendVideocallResp.setPreconditionResult(deregisterResult);
        enodebImsSendVideocallResp.setPickupResult(deregisterResult);
        enodebImsSendVideocallResp.setHangupResult(deregisterResult);
        enodebImsSendVideocallResp.setCallDuration(20L);
        enodebImsSendVideocallResp.setLocalVoiceIp("2409::1234::1002");
        enodebImsSendVideocallResp.setLocalVoicePort(10002L);
        enodebImsSendVideocallResp.setRemoteVoiceIp("2409::2012::2001");
        enodebImsSendVideocallResp.setRemoteVoicePort(28901L);
        enodebImsSendVideocallResp.setVoiceCodec("amr");
        enodebImsSendVideocallResp.setLocalVideoIp("2409::1234::1002");
        enodebImsSendVideocallResp.setLocalVideoPort(10002L);
        enodebImsSendVideocallResp.setRemoteVideoIp("2409::2012::2001");
        enodebImsSendVideocallResp.setRemoteVideoPort(28901L);
        enodebImsSendVideocallResp.setVideoCodec("h264");
        enodebImsSendVideocallResp.setVoiceDedicatedBearerInfo(bearerIndo);
        enodebImsSendVideocallResp.setVideoDedicatedBearerInfo(bearerIndo);
        enodebImsSendVideocallResp.setSentDtmfs("C123C123C123");
        enodebImsSendVideocallResp.setReceivedDtmfs("D123D123D123");
        enodebImsSendVideocallResp.setVoiceFile("12242_4545.wav");
        enodebImsSendVideocallResp.setVideoFile("12242_4545.3gp");
        enodebImsSendVideocallResp.setVoiceDetectResult("yes");
        enodebImsSendVideocallResp.setVideoDetectResult("yes");
        enodebImsSendVideocallResp.setFailureInfo(null);
        enodebImsSendVideocallResp.setSignalFlow("signalFlow");
        return enodebImsSendVideocallResp;
    }

    public static EnodebImsReceiveVoicecallResp getReceiveVoice() {
        ProcessResult deregisterResult=new ProcessResult();
            deregisterResult.setStartTime("2019-05-18 08:05:49.010");
            deregisterResult.setEndTime("2019-05-18 08:05:49.210");
            deregisterResult.setDelay(3178L);
            deregisterResult.setResult("Success");
        BearerInfo bearerIndo=new BearerInfo();
            bearerIndo.setBearerQci(9L);
            bearerIndo.setQosDelayClass(1L);
            bearerIndo.setQosReliabilityClass(2L);
            bearerIndo.setQosPeakThroughput(21312L);
            bearerIndo.setQosPrecedenceClass(1L);
            bearerIndo.setLocalIp("10.233.1.23");
            bearerIndo.setLocalTeid(124903);
            bearerIndo.setRemoteIp("2409:8888:1234:0:0:0:0:1");
            bearerIndo.setRemoteTeid(138765);
        EnodebImsReceiveVoicecallResp enodebImsReceiveVoicecallResp=new EnodebImsReceiveVoicecallResp();
        enodebImsReceiveVoicecallResp.setInvokerId("1209");
        enodebImsReceiveVoicecallResp.setSpanId("12446576889");
        enodebImsReceiveVoicecallResp.setMsisdn("13912345678");
        enodebImsReceiveVoicecallResp.setImsi("460005712345678");
        enodebImsReceiveVoicecallResp.setReturnResult("Success");
        enodebImsReceiveVoicecallResp.setCaller("123465789");
        enodebImsReceiveVoicecallResp.setVoiceDedicatedBearerResult(deregisterResult);
        enodebImsReceiveVoicecallResp.setCallsetupResult(deregisterResult);
        enodebImsReceiveVoicecallResp.setPreconditionResult(deregisterResult);
        enodebImsReceiveVoicecallResp.setPickupResult(deregisterResult);
        enodebImsReceiveVoicecallResp.setHangupResult(deregisterResult);
        enodebImsReceiveVoicecallResp.setCallDuration(10L);
        enodebImsReceiveVoicecallResp.setLocalVoiceIp("2409::1234::1002");
        enodebImsReceiveVoicecallResp.setLocalVoicePort(10002L);
        enodebImsReceiveVoicecallResp.setRemoteVoiceIp("2409::2012::2001");
        enodebImsReceiveVoicecallResp.setRemoteVoicePort(28901L);
        enodebImsReceiveVoicecallResp.setVoiceCodec("amr");
        enodebImsReceiveVoicecallResp.setVoiceDedicatedBearerInfo(bearerIndo);
        enodebImsReceiveVoicecallResp.setSentDtmfs("C123C123C123");
        enodebImsReceiveVoicecallResp.setReceivedDtmfs("D123D123D123");
        enodebImsReceiveVoicecallResp.setVoiceFile("12242_4545.wav");
        enodebImsReceiveVoicecallResp.setVoiceDetectResult("yes");
        enodebImsReceiveVoicecallResp.setFailureInfo(null);
        enodebImsReceiveVoicecallResp.setSignalFlow("signalFlow");
        return enodebImsReceiveVoicecallResp;
    }

    public static EnodebImsReceiveVideocallResp getReceiveVideo() {
        ProcessResult deregisterResult = new ProcessResult();
            deregisterResult.setStartTime("2019-05-18 08:05:49.010");
            deregisterResult.setEndTime("2019-05-18 08:05:49.210");
            deregisterResult.setDelay(3178L);
            deregisterResult.setResult("Success");
        BearerInfo bearerIndo = new BearerInfo();
            bearerIndo.setBearerQci(9L);
            bearerIndo.setQosDelayClass(1L);
            bearerIndo.setQosReliabilityClass(2L);
            bearerIndo.setQosPeakThroughput(21312L);
            bearerIndo.setQosPrecedenceClass(1L);
            bearerIndo.setLocalIp("10.233.1.23");
            bearerIndo.setLocalTeid(124903);
            bearerIndo.setRemoteIp("2409:8888:1234:0:0:0:0:1");
            bearerIndo.setRemoteTeid(138765);
        EnodebImsReceiveVideocallResp enodebImsReceiveVideocallResp = new EnodebImsReceiveVideocallResp();
        enodebImsReceiveVideocallResp.setInvokerId("1209");
        enodebImsReceiveVideocallResp.setSpanId("12446576889");
        enodebImsReceiveVideocallResp.setMsisdn("13912345678");
        enodebImsReceiveVideocallResp.setImsi("460005712345678");
        enodebImsReceiveVideocallResp.setReturnResult("Success");
        enodebImsReceiveVideocallResp.setVoiceDedicatedBearerResult(deregisterResult);
        enodebImsReceiveVideocallResp.setVideoDedicatedBearerResult(deregisterResult);
        enodebImsReceiveVideocallResp.setCallsetupResult(deregisterResult);
        enodebImsReceiveVideocallResp.setPreconditionResult(deregisterResult);
        enodebImsReceiveVideocallResp.setPickupResult(deregisterResult);
        enodebImsReceiveVideocallResp.setHangupResult(deregisterResult);
        enodebImsReceiveVideocallResp.setCallDuration(20L);
        enodebImsReceiveVideocallResp.setLocalVoiceIp("2409::1234::1002");
        enodebImsReceiveVideocallResp.setLocalVoicePort(10002L);
        enodebImsReceiveVideocallResp.setRemoteVoiceIp("2409::2012::2001");
        enodebImsReceiveVideocallResp.setRemoteVoicePort(28901L);
        enodebImsReceiveVideocallResp.setVoiceCodec("amr");
        enodebImsReceiveVideocallResp.setLocalVideoIp("2409::1234::1002");
        enodebImsReceiveVideocallResp.setLocalVideoPort(10002L);
        enodebImsReceiveVideocallResp.setRemoteVideoIp("2409::2012::2001");
        enodebImsReceiveVideocallResp.setRemoteVideoPort(28901L);
        enodebImsReceiveVideocallResp.setVideoCodec("h264");
        enodebImsReceiveVideocallResp.setVoiceDedicatedBearerInfo(bearerIndo);
        enodebImsReceiveVideocallResp.setVideoDedicatedBearerInfo(bearerIndo);
        enodebImsReceiveVideocallResp.setSentDtmfs("C123C123C123");
        enodebImsReceiveVideocallResp.setReceivedDtmfs("D123D123D123");
        enodebImsReceiveVideocallResp.setVoiceFile("12242_4545.wav");
        enodebImsReceiveVideocallResp.setVideoFile("12242_4545.3gp");
        enodebImsReceiveVideocallResp.setVoiceDetectResult("yes");
        enodebImsReceiveVideocallResp.setVideoDetectResult("yes");
        enodebImsReceiveVideocallResp.setFailureInfo(null);
        enodebImsReceiveVideocallResp.setSignalFlow("signalFlow");
        return enodebImsReceiveVideocallResp;
    }

    public static EnodebSubscribeEventResp getSub(){
        ProcessResult cfdResult=new ProcessResult();
        cfdResult.setStartTime("2019-05-18 08:05:49.010");
        cfdResult.setEndTime("2019-05-18 08:05:49.010");
        cfdResult.setDelay(32L);
        cfdResult.setResult("Success");
        ProcessResult pingResult=new ProcessResult();
        pingResult.setStartTime("2019-05-18 08:05:49.010");
        pingResult.setEndTime("2019-05-18 08:05:49.010");
        pingResult.setDelay(32L);
        pingResult.setResult("Success");
        EnodebSubscribeEventResp enodebSubscribeEventResp=new EnodebSubscribeEventResp();
        enodebSubscribeEventResp.setInvokerId("1309");
        enodebSubscribeEventResp.setMsisdn("13912345678");
        enodebSubscribeEventResp.setImsi("460005712345678");
        enodebSubscribeEventResp.setEvent("CallConnected");
        enodebSubscribeEventResp.setReturnResult("Success");
        return enodebSubscribeEventResp;
    }

    public static EnodebLteSendSmsResp getLteSend() {
        ProcessResult mosmsResult=new ProcessResult();
        mosmsResult.setStartTime("2019-05-18 08:05:49.010");
        mosmsResult.setEndTime("2019-05-18 08:05:49.010");
        mosmsResult.setDelay(32L);
        mosmsResult.setResult("Success");
        ProcessResult reportResult=new ProcessResult();
        reportResult.setStartTime("2019-05-18 08:05:49.010");
        reportResult.setEndTime("2019-05-18 08:05:49.010");
        reportResult.setDelay(32L);
        reportResult.setResult("Success");
        EnodebLteSendSmsResp enodebLteSendSmsResp=new EnodebLteSendSmsResp();
        enodebLteSendSmsResp.setInvokerId("1309");
        enodebLteSendSmsResp.setSpanId("23453465657");
        enodebLteSendSmsResp.setMsisdn("13912345678");
        enodebLteSendSmsResp.setImsi("460005712345678");
        enodebLteSendSmsResp.setReturnResult("Success");
        enodebLteSendSmsResp.setMosmsResult(mosmsResult);
        enodebLteSendSmsResp.setReportResult(reportResult);
        enodebLteSendSmsResp.setSignalFlow("signalFlow");
        enodebLteSendSmsResp.setFailureInfo(null);
        return enodebLteSendSmsResp;
    }

    public static EnodebImsSendSmsResp getImsSend() {
        ProcessResult mosmsResult=new ProcessResult();
            mosmsResult.setStartTime("2019-05-18 08:05:49.010");
            mosmsResult.setEndTime("2019-05-18 08:05:49.010");
            mosmsResult.setDelay(32L);
            mosmsResult.setResult("Success");
        ProcessResult reportResult=new ProcessResult();
            reportResult.setStartTime("2019-05-18 08:05:49.010");
            reportResult.setEndTime("2019-05-18 08:05:49.010");
            reportResult.setDelay(32L);
            reportResult.setResult("Success");
        EnodebImsSendSmsResp enodebImsSendSmsResp=new EnodebImsSendSmsResp();
        enodebImsSendSmsResp.setInvokerId("1309");
        enodebImsSendSmsResp.setSpanId("23453465657");
        enodebImsSendSmsResp.setMsisdn("13912345678");
        enodebImsSendSmsResp.setImsi("460005712345678");
        enodebImsSendSmsResp.setReturnResult("Success");
        enodebImsSendSmsResp.setMosmsResult(mosmsResult);
        enodebImsSendSmsResp.setReportResult(reportResult);
        enodebImsSendSmsResp.setSignalFlow("signalFlow");
        enodebImsSendSmsResp.setFailureInfo(null);
        return enodebImsSendSmsResp;
    }

    public static EnodebLteReceiveSmsResp getLteReceive() {
        ProcessResult mtsmsResult=new ProcessResult();
        mtsmsResult.setStartTime("2019-05-18 08:05:49.010");
        mtsmsResult.setEndTime("2019-05-18 08:05:49.010");
        mtsmsResult.setDelay(32L);
        mtsmsResult.setResult("Success");
        ProcessResult pingResult=new ProcessResult();
        pingResult.setStartTime("2019-05-18 08:05:49.010");
        pingResult.setEndTime("2019-05-18 08:05:49.010");
        pingResult.setDelay(32L);
        pingResult.setResult("Success");
        EnodebLteReceiveSmsResp enodebLteReceiveSmsResp=new EnodebLteReceiveSmsResp();
        enodebLteReceiveSmsResp.setInvokerId("1309");
        enodebLteReceiveSmsResp.setSpanId("23453465657");
        enodebLteReceiveSmsResp.setMsisdn("13912345678");
        enodebLteReceiveSmsResp.setImsi("460005712345678");
        enodebLteReceiveSmsResp.setReturnResult("Success");
        enodebLteReceiveSmsResp.setMtsmsResult(mtsmsResult);
        enodebLteReceiveSmsResp.setSms("您本月余额为 XXX 元。");
        enodebLteReceiveSmsResp.setSignalFlow("signalFlow");
        enodebLteReceiveSmsResp.setFailureInfo(null);
        return enodebLteReceiveSmsResp;
    }

    public static EnodebImsReceiveSmsResp getImsReceive() {
        ProcessResult mtsmsResult=new ProcessResult();
            mtsmsResult.setStartTime("2019-05-18 08:05:49.010");
            mtsmsResult.setEndTime("2019-05-18 08:05:49.010");
            mtsmsResult.setDelay(32L);
            mtsmsResult.setResult("Success");
        ProcessResult pingResult=new ProcessResult();
        pingResult.setStartTime("2019-05-18 08:05:49.010");
        pingResult.setEndTime("2019-05-18 08:05:49.010");
        pingResult.setDelay(32L);
        pingResult.setResult("Success");
        EnodebImsReceiveSmsResp enodebImsReceiveSmsResp=new EnodebImsReceiveSmsResp();
        enodebImsReceiveSmsResp.setInvokerId("1309");
        enodebImsReceiveSmsResp.setSpanId("23453465657");
        enodebImsReceiveSmsResp.setMsisdn("13912345678");
        enodebImsReceiveSmsResp.setImsi("460005712345678");
        enodebImsReceiveSmsResp.setReturnResult("Success");
        enodebImsReceiveSmsResp.setMtsmsResult(mtsmsResult);
        enodebImsReceiveSmsResp.setSms("您本月余额为 XXX 元。");
        enodebImsReceiveSmsResp.setSignalFlow("signalFlow");
        enodebImsReceiveSmsResp.setFailureInfo(null);
        return enodebImsReceiveSmsResp;
    }

    public static EnodebDataUtSetCallResp getDataUtSet() {
        ProcessResult cfdResult=new ProcessResult();
        cfdResult.setStartTime("2019-05-18 08:05:49.010");
        cfdResult.setEndTime("2019-05-18 08:05:49.010");
        cfdResult.setDelay(32L);
        cfdResult.setResult("Success");
        ProcessResult pingResult=new ProcessResult();
        pingResult.setStartTime("2019-05-18 08:05:49.010");
        pingResult.setEndTime("2019-05-18 08:05:49.010");
        pingResult.setDelay(32L);
        pingResult.setResult("Success");
        EnodebDataUtSetCallResp enodebDataUtSetCallResp=new EnodebDataUtSetCallResp();
        enodebDataUtSetCallResp.setInvokerId("1309");
        enodebDataUtSetCallResp.setSpanId("23453465657");
        enodebDataUtSetCallResp.setMsisdn("13912345678");
        enodebDataUtSetCallResp.setImsi("460005712345678");
        enodebDataUtSetCallResp.setReturnResult("Success");
        enodebDataUtSetCallResp.setUeIp("10.211.109.12");
        enodebDataUtSetCallResp.setCfdSetResult(cfdResult);
        enodebDataUtSetCallResp.setSignalFlow("signalFlow");
        enodebDataUtSetCallResp.setFailureInfo(null);
        return enodebDataUtSetCallResp;
    }

    public static EnodebDataUtResetCallResp getDataUtReset() {
        ProcessResult cfdResult=new ProcessResult();
        cfdResult.setStartTime("2019-05-18 08:05:49.010");
        cfdResult.setEndTime("2019-05-18 08:05:49.010");
        cfdResult.setDelay(32L);
        cfdResult.setResult("Success");
        ProcessResult pingResult=new ProcessResult();
        pingResult.setStartTime("2019-05-18 08:05:49.010");
        pingResult.setEndTime("2019-05-18 08:05:49.010");
        pingResult.setDelay(32L);
        pingResult.setResult("Success");
        EnodebDataUtResetCallResp enodebDataUtResetCallResp=new EnodebDataUtResetCallResp();
        enodebDataUtResetCallResp.setInvokerId("1309");
        enodebDataUtResetCallResp.setSpanId("23453465657");
        enodebDataUtResetCallResp.setMsisdn("13912345678");
        enodebDataUtResetCallResp.setImsi("460005712345678");
        enodebDataUtResetCallResp.setReturnResult("Success");
        enodebDataUtResetCallResp.setUeIp("10.211.109.12");
        enodebDataUtResetCallResp.setCfdSetResult(cfdResult);
        enodebDataUtResetCallResp.setSignalFlow("signalFlow");
        enodebDataUtResetCallResp.setFailureInfo(null);
        return enodebDataUtResetCallResp;
    }

    public static EnodebDataPingResp getPing() {
        ProcessResult dnsResult=new ProcessResult();
            dnsResult.setStartTime("2019-05-18 08:05:49.010");
            dnsResult.setEndTime("2019-05-18 08:05:49.010");
            dnsResult.setDelay(32L);
            dnsResult.setResult("Success");
        ProcessResult pingResult=new ProcessResult();
            pingResult.setStartTime("2019-05-18 08:05:49.010");
            pingResult.setEndTime("2019-05-18 08:05:49.010");
            pingResult.setDelay(32L);
            pingResult.setResult("Success");
        EnodebDataPingResp enodebDataPingResp=new EnodebDataPingResp();
        enodebDataPingResp.setInvokerId("1309");
        enodebDataPingResp.setSpanId("23453465657");
        enodebDataPingResp.setMsisdn("13912345678");
        enodebDataPingResp.setImsi("460005712345678");
        enodebDataPingResp.setReturnResult("Success");
        enodebDataPingResp.setUeIp("10.211.109.12");
        enodebDataPingResp.setDnsIp("10.119.209.123");
        enodebDataPingResp.setDnsResult(dnsResult);
        enodebDataPingResp.setPingResult(pingResult);
        enodebDataPingResp.setPacketLoss(0l);
        enodebDataPingResp.setPacketJitter(6l);
        enodebDataPingResp.setPacketDelay(12l);
        enodebDataPingResp.setSignalFlow("signalFlow");
        enodebDataPingResp.setFailureInfo(null);
        return enodebDataPingResp;
    }


}
