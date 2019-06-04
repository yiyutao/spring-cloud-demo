package net.yiyutao.trace1;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * @author masteryi
 * @version 1.0
 **/
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class TraceApplication1 {

    private static Logger logger = Logger.getLogger(TraceApplication1.class);


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/trace-1")
    public String trace() {
        logger.info("=====call trace-1=====");
        return restTemplate().getForEntity("http://trace-2/trace-2", String.class).getBody();
    }

    public static void main(String[] args) {
        SpringApplication.run(TraceApplication1.class, args);
    }
}
