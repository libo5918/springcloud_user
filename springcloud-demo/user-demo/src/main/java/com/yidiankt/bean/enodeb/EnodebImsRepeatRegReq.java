package com.yidiankt.bean.enodeb;


import com.yidiankt.bean.basicBean.UeInfo;

/*VoLTE重注册servicems参数*/
public class EnodebImsRepeatRegReq extends EnodebCommonReq {
    private UeInfo ueInfo;                            //手机用户信息(Object对象ueInfo)

    public UeInfo getUeInfo() {
        return ueInfo;
    }

    public void setUeInfo(UeInfo ueInfo) {
        this.ueInfo = ueInfo;
    }
}
