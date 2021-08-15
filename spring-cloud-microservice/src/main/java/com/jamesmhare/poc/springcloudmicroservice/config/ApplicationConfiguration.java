package com.jamesmhare.poc.springcloudmicroservice.config;

import com.jamesmhare.poc.springcloudmicroservice.config.properties.ApplicationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ApplicationProperties.class)
public class ApplicationConfiguration {

}
