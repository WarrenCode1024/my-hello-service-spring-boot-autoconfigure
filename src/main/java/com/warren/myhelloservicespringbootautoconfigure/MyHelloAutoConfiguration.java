package com.warren.myhelloservicespringbootautoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 1. 启用配置属性绑定
@EnableConfigurationProperties(MyHelloProperties.class)
// 2. 只有当 MyHelloService 类存在于类路径上时，配置才生效
@ConditionalOnClass(MyHelloService.class)
public class MyHelloAutoConfiguration {

    // 3. 只有当用户没有自己定义 MyHelloService Bean 时，才创建默认 Bean
    @Bean
    @ConditionalOnMissingBean
    public MyHelloService myHelloService(MyHelloProperties properties) {
        return new MyHelloService(properties.getPrefix(), properties.getSuffix());
    }
}
