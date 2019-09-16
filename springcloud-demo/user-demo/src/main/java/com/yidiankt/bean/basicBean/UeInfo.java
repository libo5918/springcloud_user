package com.yidiankt.bean.basicBean;

/*手机用户信息*/
public class UeInfo {
    private String          imsi;              //国际移动用户识别码
    private String          network;           //用户归属网络（如2G/3G/4G/5G等）
    private String          simType;           //SIM卡类型（实体卡，虚拟卡）
    //以下参数在虚拟卡时是必选参数
    private String          opc;               //SIM卡OPC值（虚拟卡时为必选参数）
    private String          ki;                //SIM卡Ki值（虚拟卡时为必选参数）
    //以下参数不是必选
    private String          impi;              //号码私有身份标识
    private String          domain;            //用户归属域
    private String          username;          //用户名称
    private String          password;          //用户密码

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getSimType() {
        return simType;
    }

    public void setSimType(String simType) {
        this.simType = simType;
    }

    public String getOpc() {
        return opc;
    }

    public void setOpc(String opc) {
        this.opc = opc;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    public String getImpi() {
        return impi;
    }

    public void setImpi(String impi) {
        this.impi = impi;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
