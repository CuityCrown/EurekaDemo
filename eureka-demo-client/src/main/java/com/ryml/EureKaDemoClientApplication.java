package com.ryml;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * description:
 *
 * @author 刘一博
 * @version V1.0
 * @date 2019/11/5 11:00
 */
@EnableFeignClients
@SpringCloudApplication
public class EureKaDemoClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureKaDemoClientApplication.class,args);
    }

}
