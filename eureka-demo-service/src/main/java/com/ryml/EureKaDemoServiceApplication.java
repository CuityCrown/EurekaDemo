package com.ryml;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * description:
 *
 * @author 刘一博
 * @version V1.0
 * @date 2019/11/5 11:00
 */
@SpringCloudApplication
@EnableEurekaServer
public class EureKaDemoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureKaDemoServiceApplication.class,args);
    }

}
