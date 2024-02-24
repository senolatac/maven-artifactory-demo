package com.sha.demomaven.infra.configuration;

import com.sha.demomaven.infra.controller.TestController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = TestController.class)
public class TestConfiguration {
}
