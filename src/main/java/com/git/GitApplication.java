package com.git;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
@Slf4j
public class GitApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(GitApplication.class);
        ConfigurableEnvironment env = app.run(args).getEnvironment();
        log.warn("服务启动成功,地址：http://localhost:" + env.getProperty("server.port"));
    }
}
