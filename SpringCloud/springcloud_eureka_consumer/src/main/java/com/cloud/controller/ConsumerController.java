package com.cloud.controller;

import com.cloud.service.IDoSomeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerController {
 /*   @Resource
    private RestTemplate restTemplate;
*/
    @Resource
    private IDoSomeService iDoSomeService;

    @RequestMapping("/doSome")
    public String doSome(){
        System.out.println("ConsumerController");
       /* return restTemplate.getForObject("http://eureka-provider/doSome",String.class);*/
        return iDoSomeService.doSome();
    }
}
