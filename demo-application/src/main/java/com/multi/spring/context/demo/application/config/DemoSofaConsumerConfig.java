package com.multi.spring.context.demo.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath*:spring/demo-service-consumer.xml"})
public class DemoSofaConsumerConfig {
}
