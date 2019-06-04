package net.yiyutao.trace2;


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
public class TraceApplication2 {

    private static Logger log = Logger.getLogger(TraceApplication2.class);


    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @RequestMapping("/trace-2")
    public String trace() {
        log.info("=====call trace-2=====");
        return "Trace";
    }

    public static void main(String[] args) {
        SpringApplication.run(TraceApplication2.class, args);
    }
}
