package com.multi.spring.context.demo.application.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath*:spring/dubbo.xml"})
public class DubboConfig {
}
