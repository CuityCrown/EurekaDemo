package com.ryml;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * description:
 *
 * @author 刘一博
 * @version V1.0
 * @date 2019/10/17 18:05
 */
@EnableFeignClients
@SpringCloudApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }

}
