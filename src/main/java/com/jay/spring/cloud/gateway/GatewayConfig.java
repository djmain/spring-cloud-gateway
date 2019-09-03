package com.jay.spring.cloud.gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by Jay on 2019/9/3
 */
@Configuration
public class GatewayConfig
{
    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
