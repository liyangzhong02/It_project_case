package com.marre.cm.domain;

import java.io.Serializable;
import java.util.Objects;
public class LoginUser implements Serializable{

    //登录信息
    private SysUser sysUser;
    //影院ID
    private Long cinemaId;
    //影院名
    private String cinemaName;
    //Token
    private String token;

    public LoginUser(){

    }
}
