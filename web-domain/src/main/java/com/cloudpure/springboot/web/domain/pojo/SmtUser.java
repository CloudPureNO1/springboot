package com.cloudpure.springboot.web.domain.pojo;

/**
 * Created by CloudPure on 2017/11/24.
 */
public class SmtUser implements  java.io.Serializable{
   private String userid;//	varchar2(32)			用户id
    private String passwd;// passwd;//	varchar2(64)	y		密码
    private String loginname;//	varchar2(50)	y		登录名
    private String dept;//	varchar2(32)	y		部门
    private String description;//	varchar2(500)	y		描述
    private String iplist;//	varchar2(255)	y		iplist
    private String  checkip;//	varchar2(1)	y		是否检查ip 1是，0否
   private String  useful;//	varchar2(1)		1	用户是否有效 1有效，0无效
   private String  isleader;//	varchar2(1)	y		是否领导 1是，0不是
   private String  regionid;//	varchar2(32)	y		区域代码
   private String username;//	varchar2(32)	y		用户名称
    private String owner;//	varchar2(32)	y		创建者
   private String  rate;//	varchar2(8)	y		保留2
   private String  empid;//	varchar2(32)	y		保留1
   private String  macaddr;//	varchar2(300)	y		网卡地址
   private String  usertype;//	varchar2(2)	y		用户类别 0超级管理员，1管理员，2普通用户
   private String  otherinfo;//	varchar2(2000)	y		其它信息
   private String  createdate;//	date	y		创建时间
   private String hashcode;//	varchar2(64)	y		散列值

    public SmtUser(String userid, String passwd, String loginname, String dept, String description, String iplist, String checkip, String useful, String isleader, String regionid, String username, String owner, String rate, String empid, String macaddr, String usertype, String otherinfo, String createdate, String hashcode) {
        this.userid = userid;
        this.passwd = passwd;
        this.loginname = loginname;
        this.dept = dept;
        this.description = description;
        this.iplist = iplist;
        this.checkip = checkip;
        this.useful = useful;
        this.isleader = isleader;
        this.regionid = regionid;
        this.username = username;
        this.owner = owner;
        this.rate = rate;
        this.empid = empid;
        this.macaddr = macaddr;
        this.usertype = usertype;
        this.otherinfo = otherinfo;
        this.createdate = createdate;
        this.hashcode = hashcode;
    }

    public SmtUser() {
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIplist() {
        return iplist;
    }

    public void setIplist(String iplist) {
        this.iplist = iplist;
    }

    public String getCheckip() {
        return checkip;
    }

    public void setCheckip(String checkip) {
        this.checkip = checkip;
    }

    public String getUseful() {
        return useful;
    }

    public void setUseful(String useful) {
        this.useful = useful;
    }

    public String getIsleader() {
        return isleader;
    }

    public void setIsleader(String isleader) {
        this.isleader = isleader;
    }

    public String getRegionid() {
        return regionid;
    }

    public void setRegionid(String regionid) {
        this.regionid = regionid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getMacaddr() {
        return macaddr;
    }

    public void setMacaddr(String macaddr) {
        this.macaddr = macaddr;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(String otherinfo) {
        this.otherinfo = otherinfo;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getHashcode() {
        return hashcode;
    }

    public void setHashcode(String hashcode) {
        this.hashcode = hashcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SmtUser)) return false;

        SmtUser smtUser = (SmtUser) o;

        if (getUserid() != null ? !getUserid().equals(smtUser.getUserid()) : smtUser.getUserid() != null) return false;
        if (getPasswd() != null ? !getPasswd().equals(smtUser.getPasswd()) : smtUser.getPasswd() != null) return false;
        if (getLoginname() != null ? !getLoginname().equals(smtUser.getLoginname()) : smtUser.getLoginname() != null)
            return false;
        if (getDept() != null ? !getDept().equals(smtUser.getDept()) : smtUser.getDept() != null) return false;
        if (getDescription() != null ? !getDescription().equals(smtUser.getDescription()) : smtUser.getDescription() != null)
            return false;
        if (getIplist() != null ? !getIplist().equals(smtUser.getIplist()) : smtUser.getIplist() != null) return false;
        if (getCheckip() != null ? !getCheckip().equals(smtUser.getCheckip()) : smtUser.getCheckip() != null)
            return false;
        if (getUseful() != null ? !getUseful().equals(smtUser.getUseful()) : smtUser.getUseful() != null) return false;
        if (getIsleader() != null ? !getIsleader().equals(smtUser.getIsleader()) : smtUser.getIsleader() != null)
            return false;
        if (getRegionid() != null ? !getRegionid().equals(smtUser.getRegionid()) : smtUser.getRegionid() != null)
            return false;
        if (getUsername() != null ? !getUsername().equals(smtUser.getUsername()) : smtUser.getUsername() != null)
            return false;
        if (getOwner() != null ? !getOwner().equals(smtUser.getOwner()) : smtUser.getOwner() != null) return false;
        if (getRate() != null ? !getRate().equals(smtUser.getRate()) : smtUser.getRate() != null) return false;
        if (getEmpid() != null ? !getEmpid().equals(smtUser.getEmpid()) : smtUser.getEmpid() != null) return false;
        if (getMacaddr() != null ? !getMacaddr().equals(smtUser.getMacaddr()) : smtUser.getMacaddr() != null)
            return false;
        if (getUsertype() != null ? !getUsertype().equals(smtUser.getUsertype()) : smtUser.getUsertype() != null)
            return false;
        if (getOtherinfo() != null ? !getOtherinfo().equals(smtUser.getOtherinfo()) : smtUser.getOtherinfo() != null)
            return false;
        if (getCreatedate() != null ? !getCreatedate().equals(smtUser.getCreatedate()) : smtUser.getCreatedate() != null)
            return false;
        return getHashcode() != null ? getHashcode().equals(smtUser.getHashcode()) : smtUser.getHashcode() == null;
    }

    @Override
    public int hashCode() {
        int result = getUserid() != null ? getUserid().hashCode() : 0;
        result = 31 * result + (getPasswd() != null ? getPasswd().hashCode() : 0);
        result = 31 * result + (getLoginname() != null ? getLoginname().hashCode() : 0);
        result = 31 * result + (getDept() != null ? getDept().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getIplist() != null ? getIplist().hashCode() : 0);
        result = 31 * result + (getCheckip() != null ? getCheckip().hashCode() : 0);
        result = 31 * result + (getUseful() != null ? getUseful().hashCode() : 0);
        result = 31 * result + (getIsleader() != null ? getIsleader().hashCode() : 0);
        result = 31 * result + (getRegionid() != null ? getRegionid().hashCode() : 0);
        result = 31 * result + (getUsername() != null ? getUsername().hashCode() : 0);
        result = 31 * result + (getOwner() != null ? getOwner().hashCode() : 0);
        result = 31 * result + (getRate() != null ? getRate().hashCode() : 0);
        result = 31 * result + (getEmpid() != null ? getEmpid().hashCode() : 0);
        result = 31 * result + (getMacaddr() != null ? getMacaddr().hashCode() : 0);
        result = 31 * result + (getUsertype() != null ? getUsertype().hashCode() : 0);
        result = 31 * result + (getOtherinfo() != null ? getOtherinfo().hashCode() : 0);
        result = 31 * result + (getCreatedate() != null ? getCreatedate().hashCode() : 0);
        result = 31 * result + (getHashcode() != null ? getHashcode().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SmtUser{" +
                "userid='" + userid + '\'' +
                ", passwd='" + passwd + '\'' +
                ", loginname='" + loginname + '\'' +
                ", dept='" + dept + '\'' +
                ", description='" + description + '\'' +
                ", iplist='" + iplist + '\'' +
                ", checkip='" + checkip + '\'' +
                ", useful='" + useful + '\'' +
                ", isleader='" + isleader + '\'' +
                ", regionid='" + regionid + '\'' +
                ", username='" + username + '\'' +
                ", owner='" + owner + '\'' +
                ", rate='" + rate + '\'' +
                ", empid='" + empid + '\'' +
                ", macaddr='" + macaddr + '\'' +
                ", usertype='" + usertype + '\'' +
                ", otherinfo='" + otherinfo + '\'' +
                ", createdate='" + createdate + '\'' +
                ", hashcode='" + hashcode + '\'' +
                '}';
    }
}
