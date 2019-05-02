package net.yiyutao.springcloud.consul.client.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author masteryi
 * @version 1.0
 **/
@RestController
public class DcController {

    private final DiscoveryClient discoveryClient;

    public DcController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    @GetMapping("/dc")
    public String get() {
        List<String> services = discoveryClient.getServices();
        System.out.println(services.toString());
        return services.toString();
    }
}
