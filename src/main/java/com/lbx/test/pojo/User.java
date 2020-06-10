package com.lbx.test.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * (User)实体类
 * USER :lvbingxing
 * TIME :Created in 2020/6/7 20:25
 * NOTE:
 */
@Entity
public class User {
    @GeneratedValue
    @Id
    Integer u_id;
    String u_name;
    Integer u_age;

    public User(Integer u_id, String u_name, Integer u_age) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.u_age = u_age;
    }

    public User() {
    }

    public Integer getU_id() {
        return u_id;
    }

    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public Integer getU_age() {
        return u_age;
    }

    public void setU_age(Integer u_age) {
        this.u_age = u_age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("u_id=").append(u_id);
        sb.append(", u_name='").append(u_name).append('\'');
        sb.append(", u_age=").append(u_age);
        sb.append('}');
        return sb.toString();
    }
}
