package com.slokam.zullserver;
/*
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServer extends ResourceServerConfigurerAdapter 

{
    @Override
    public void configure(HttpSecurity http) throws Exception {
    swagger-ui-standalone-preset.js:1 Failed to load resource: net::ERR_FILE_NOT_FOUND
        http
            .authorizeRequests()
            
            //.antMatchers("/*///v2//api-docs//",
                    // "/*/configuration/ui/**",
                    // "/*/swagger-resources/**",
                    // "/*/configuration/security/**",
                    // "/*/swagger-ui.html",
                    // "/*/webjars/**").permitAll()
            //.antMatchers("/**").authenticated();
           
        
            
   // }
    
    
//}
