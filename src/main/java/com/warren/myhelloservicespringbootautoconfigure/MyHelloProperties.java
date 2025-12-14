package com.warren.myhelloservicespringbootautoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "my.hello")
public class MyHelloProperties {
    private String prefix = "Hello, ";
    private String suffix = "!";

    // Getters and Setters...
    public String getPrefix() { return prefix; }
    public void setPrefix(String prefix) { this.prefix = prefix; }
    public String getSuffix() { return suffix; }
    public void setSuffix(String suffix) { this.suffix = suffix; }
}