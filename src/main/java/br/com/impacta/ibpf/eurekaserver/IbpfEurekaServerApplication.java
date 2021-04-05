package br.com.impacta.ibpf.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IbpfEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IbpfEurekaServerApplication.class, args);
    }

}
