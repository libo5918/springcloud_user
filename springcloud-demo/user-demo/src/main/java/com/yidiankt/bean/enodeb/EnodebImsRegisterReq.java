package com.yidiankt.bean.enodeb;

import com.yidiankt.bean.basicBean.UeInfo;

/*VoLTE注册servicems参数*/
public class EnodebImsRegisterReq extends EnodebCommonReq {
    private UeInfo ueInfo;                            //手机用户信息(Object对象ueInfo)
    private String      psbcIp;                            //指定PSBC的IP地址
    private Long        psbcPort=5060L;                    //指定PSBC的端口号

    public UeInfo getUeInfo() {
        return ueInfo;
    }

    public void setUeInfo(UeInfo ueInfo) {
        this.ueInfo = ueInfo;
    }

    public String getPsbcIp() {
        return psbcIp;
    }

    public void setPsbcIp(String psbcIp) {
        this.psbcIp = psbcIp;
    }

    public Long getPsbcPort() {
        return psbcPort;
    }

    public void setPsbcPort(Long psbcPort) {
        this.psbcPort = psbcPort;
    }
}
