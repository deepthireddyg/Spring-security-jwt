package com.deepthi.Springsecurityjwt;

import com.deepthi.Springsecurityjwt.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

public class SecurityConfigurer extends WebSecurityConfiguration {
    @Autowired
    private MyUserDetailsService myUserDetailsService;
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService);
    }
}
