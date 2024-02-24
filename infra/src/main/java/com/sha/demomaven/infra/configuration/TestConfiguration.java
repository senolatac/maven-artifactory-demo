package com.sha.demomaven.infra.configuration;

import com.sha.demomaven.infra.controller.TestController;
import com.sha.demomaven.infra.entity.Test;
import com.sha.demomaven.infra.repository.ITestRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {TestController.class, Test.class, ITestRepository.class})
public class TestConfiguration {
}
