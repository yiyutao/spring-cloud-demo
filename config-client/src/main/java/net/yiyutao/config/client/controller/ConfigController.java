package net.yiyutao.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author masteryi
 * @version 1.0
 **/
@RestController
public class ConfigController {

    @Value("${info.profile}")
    String info;

    @GetMapping("/info")
    public String info(){
        return info;
    }
}
