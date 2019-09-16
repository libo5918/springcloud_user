package com.yidiankt.controller;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.yidiankt.bean.basicBean.*;
import com.yidiankt.bean.enodeb.response.*;
import com.yidiankt.controller.GenEnodeb.GenEnodebBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;

@RestController
public class EnodebAttachController {

    @Autowired
    private Gson gson;

    @RequestMapping(value = "4.0/stackms_enodeb_attach",method = RequestMethod.POST)
    public String attach(@RequestBody String gsonStr, @RequestHeader(value = "route")String route) throws InterruptedException {
        System.out.println("route = " + route);
        System.out.println("gsonStr:"+gsonStr);
//        Enodeb_attach fromJson = gson.fromJson(gsonStr,Enodeb_attach.class);
//        System.out.println("fromJson = " + fromJson.getFatherSpanId());
        /*模拟协议栈附着返回的结果*/
        EnodebAttachResp attach_result = GenEnodebBean.getEnodeb();
        String resultAttach = gson.toJson(attach_result);
        //System.out.println(1/0);
        Thread.sleep(1000);
        System.out.println("resultAttach = " + resultAttach);
        return resultAttach;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_detach",method = RequestMethod.POST)
    public String detach(@RequestBody String gsonStr, @RequestHeader(value = "route")String route) throws InterruptedException {
        System.out.println("route = " + route);
        System.out.println("gsonStr:"+gsonStr);
//        Enodeb_attach fromJson = gson.fromJson(gsonStr,Enodeb_attach.class);
//        System.out.println("fromJson = " + fromJson.getFatherSpanId());
        /*模拟协议栈去附着返回的结果*/
        EnodebDetachResp enodebDetachResp = GenEnodebBean.getDetach();
        String resultDetach = gson.toJson(enodebDetachResp);
        System.out.println("resultDetach = " + resultDetach);
//        System.out.println(1/0);
        Thread.sleep(1000);
        return resultDetach;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_data_http",method = RequestMethod.POST)
    public String dataHttp(@RequestBody String  gsonStr,@RequestHeader(value = "route")String route) throws InterruptedException{
        System.out.println("route = " + route);
        System.out.println("gsonStr:"+gsonStr);
        EnodebDataHttpResp enodebDataHttpResp = GenEnodebBean.getDataHttp();
        String resultDataHttp = gson.toJson(enodebDataHttpResp);
        System.out.println("resultDataHttp = " + resultDataHttp);
        Thread.sleep(1000);
        return resultDataHttp;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_tau",method = RequestMethod.POST)
    public String tau(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebTauResp enodebTauResp = GenEnodebBean.getTau();
        String result = gson.toJson(enodebTauResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_pdn_connectivity",method = RequestMethod.POST)
    public String pdn(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsPdnConnResp enodebImsPdnConnResp = GenEnodebBean.getPdn();
        String result = gson.toJson(enodebImsPdnConnResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_register",method = RequestMethod.POST)
    public String register(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsRegisterResp enodebImsRegisterResp = GenEnodebBean.getRegister();
        String result = gson.toJson(enodebImsRegisterResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_repeat_register",method = RequestMethod.POST)
    public String repeatReg(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsRepeatRegResp repRegister = GenEnodebBean.getRepRegister();
        String result = gson.toJson(repRegister);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_repeat_registe",method = RequestMethod.POST)
    public String repRegister(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsRepeatRegResp enodebImsRepeatRegResp = GenEnodebBean.getRepRegister();
        String result = gson.toJson(enodebImsRepeatRegResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_deregister",method = RequestMethod.POST)
    public String deRegister(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsDeregisterResp enodebImsDeregisterResp = GenEnodebBean.getDegister();
        String result = gson.toJson(enodebImsDeregisterResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_send_voicecall",method = RequestMethod.POST)
    public String sendVoicecall(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsSendVoicecallResp enodebImsSendVoicecallResp = GenEnodebBean.getSendVoice();
        String result = gson.toJson(enodebImsSendVoicecallResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_send_videocall",method = RequestMethod.POST)
    public String sendVideocall(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsSendVideocallResp enodebImsSendVideocallResp = GenEnodebBean.getSendVideo();
        String result = gson.toJson(enodebImsSendVideocallResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_receive_voicecall",method = RequestMethod.POST)
    public String receiveVoicecall(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsReceiveVoicecallResp enodebImsReceiveVoicecallResp = GenEnodebBean.getReceiveVoice();
        String result = gson.toJson(enodebImsReceiveVoicecallResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_receive_videocall",method = RequestMethod.POST)
    public String receiveVideocall(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsReceiveVideocallResp enodebImsReceiveVideocallResp = GenEnodebBean.getReceiveVideo();
        String result = gson.toJson(enodebImsReceiveVideocallResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_subscribe_event",method = RequestMethod.POST)
    public String SubScirbe(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebSubscribeEventResp enodebSubscribeEventResp=GenEnodebBean.getSub();
        String result = gson.toJson(enodebSubscribeEventResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }


    @RequestMapping(value = "4.0/stackms_enodeb_lte_send_sms",method = RequestMethod.POST)
    public String lteSend(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebLteSendSmsResp enodebLteSendSmsResp=GenEnodebBean.getLteSend();
        String result = gson.toJson(enodebLteSendSmsResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_send_sms",method = RequestMethod.POST)
    public String imsSend(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsSendSmsResp enodebImsSendSmsResp=GenEnodebBean.getImsSend();
        String result = gson.toJson(enodebImsSendSmsResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_lte_receive_sms",method = RequestMethod.POST)
    public String lteReceive(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebLteReceiveSmsResp enodebLteReceiveSmsResp=GenEnodebBean.getLteReceive();
        String result = gson.toJson(enodebLteReceiveSmsResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_ims_receive_sms",method = RequestMethod.POST)
    public String imsReceive(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebImsReceiveSmsResp enodebImsReceiveSmsResp=GenEnodebBean.getImsReceive();
        String result = gson.toJson(enodebImsReceiveSmsResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_data_ut_set_callforwarding",method = RequestMethod.POST)
    public String dataUtSet(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebDataUtSetCallResp enodebImsSendVoicecallResp=GenEnodebBean.getDataUtSet();
        String result = gson.toJson(enodebImsSendVoicecallResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_data_ut_reset_callforwarding",method = RequestMethod.POST)
    public String dataUtReset(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebDataUtResetCallResp enodebImsSendVoicecallResp=GenEnodebBean.getDataUtReset();
        String result = gson.toJson(enodebImsSendVoicecallResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }

    @RequestMapping(value = "4.0/stackms_enodeb_data_ping",method = RequestMethod.POST)
    public String sendViocecall(@RequestBody String  gsonStr) throws InterruptedException{
        System.out.println("gsonStr:"+gsonStr);
        EnodebDataPingResp enodebDataPingResp = GenEnodebBean.getPing();
        String result = gson.toJson(enodebDataPingResp);
        System.out.println("result = " + result);
        Thread.sleep(1000);
        return result;
    }



}