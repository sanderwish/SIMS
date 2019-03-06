package com.eversis.spaceagency.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .withUser("admin").password("admin")
                .roles("ADMIN")
                .and()
                .withUser("user").password("user")
                .roles("CUSTOMER");
        //  zamiast .passwordEncoder(...) można do Stringa
        //  password dodać prefix {noop} - .password("{noop}admin") xD
        // ze względów bezpieczeństwa nie stosuje się tego podejścia, zrozumiałe.
    }
    // adresy URL, do których dana rola ma dostęp
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/*").hasAnyRole("CUSTOMER", "ADMIN")
                .antMatchers("/admin/*").hasRole("ADMIN")
                .and()
                .formLogin();
    }
}
