package com.orm;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableTransactionManagement
@EntityScan("com.orm.domain")
@EnableSpringConfigured
@EnableWebMvc
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "com.orm.dao.jpa")
@SpringBootApplication
public class OrmApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(OrmApplication.class).run(args);
    }
}
