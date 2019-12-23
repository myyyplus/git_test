package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaServer //eureka服务注册中心
public class ServerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ServerApp.class,args);
    }
}
