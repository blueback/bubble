package com.antsoft.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by timch on 2016/8/23.
 */
@Component
@ConfigurationProperties(prefix = "user")
public class User {

    private @Value("${name:lkl}") String name;

    private @Value("${age}") Integer age;

    private @Value("${remark}") String remark;

    private String address;

    private Address detailAddress;

    private List<Address> allAddress = new ArrayList<>();

    public List<Address> getAllAddress() {
        return allAddress;
    }

    public void setAllAddress(List<Address> allAddress) {
        this.allAddress = allAddress;
    }

    public Address getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(Address detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
