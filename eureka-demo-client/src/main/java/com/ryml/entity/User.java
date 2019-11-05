package com.ryml.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * description:
 *
 * @author 刘一博
 * @version V1.0
 * @date 2019/11/5 10:58
 */
@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private String context;

    private String age;

}
