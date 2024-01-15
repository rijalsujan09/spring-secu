package com.security.demo.anotation.propertysource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:/custom/mail.properties")
//@PropertySource("classpath:/custom/messages.properties")
@PropertySources({
        @PropertySource("classpath:/custom/mail.properties"),
        @PropertySource("classpath:/custom/messages.properties")
})
public class SpringConfig {
}
