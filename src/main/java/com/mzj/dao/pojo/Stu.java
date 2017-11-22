package com.mzj.dao.pojo;

/**
 * Created by Administrator on 2017/11/21.
 */
public class Stu {
    private Integer sid;
    private String sname;
    private String password;

    @Override
    public String toString() {
        return "Stu{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Stu(String sname, String password) {

        this.sname = sname;
        this.password = password;
    }

    public Stu() {

    }

    public Stu(Integer sid, String sname, String password) {

        this.sid = sid;
        this.sname = sname;
        this.password = password;
    }
}
