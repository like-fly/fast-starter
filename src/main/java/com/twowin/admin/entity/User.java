package com.twowin.admin.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by ckl on 2017/12/1.
 */
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

}
