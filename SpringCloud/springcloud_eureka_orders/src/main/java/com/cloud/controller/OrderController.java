package com.cloud.controller;

import com.cloud.service.MemberService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {
   /* @Resource
    private MemberService memberService;*/
    @Resource
    private RestTemplate restTemplate;
    @RequestMapping("/getOrderByMember")
    @HystrixCommand(fallbackMethod = "getOrderHystrix")
    public String getOrderByMeber(){
        /*   return memberService.getMember();*/
        return restTemplate.getForObject("http://eureka-server/getMember",String.class);
    }
    public String getOrderHystrix(){
        return "服务熔断plus";
    }
    @RequestMapping("/getOrderInfo")
    public String getOrderInfo(){
        return "getOrderInfo";
    }
}
