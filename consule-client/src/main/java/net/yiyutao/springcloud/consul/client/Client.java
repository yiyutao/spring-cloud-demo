package net.yiyutao.springcloud.consul.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author masteryi
 * @version 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class Client {

    public static void main(String[] args) {
        SpringApplication.run(Client.class, args);
    }
}
