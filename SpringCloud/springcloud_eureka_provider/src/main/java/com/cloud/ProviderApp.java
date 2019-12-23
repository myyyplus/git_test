package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer  //eureka服务注册中心
//c

public class ProviderApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderApp.class,args);
        System.out.println("provider");
    }
}
