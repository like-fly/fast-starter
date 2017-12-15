package com.twowin.admin.entity;

import lombok.Data;

/**
 * 系统用户
 * Created by ckl on 2017/12/15.
 */
@Data
public class SysUser {
    private int uid;
    private String uemail;
    private String uname;
    private String upasswd;
    private int ugender;
}
