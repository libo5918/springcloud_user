package com.yidiankt.bean.basicBean;

/*手机用户激活分配到的IP地址信息。*/
public class IpAddr {
    private String          ipv4Addr;                         //手机IPv4激活地址
    private String          ipv6Addr;                         //手机IPv6激活地址。

    public String getIpv4Addr() {
        return ipv4Addr;
    }

    public void setIpv4Addr(String ipv4Addr) {
        this.ipv4Addr = ipv4Addr;
    }

    public String getIpv6Addr() {
        return ipv6Addr;
    }

    public void setIpv6Addr(String ipv6Addr) {
        this.ipv6Addr = ipv6Addr;
    }
}
