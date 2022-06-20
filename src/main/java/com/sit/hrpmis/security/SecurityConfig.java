package com.sit.hrpmis.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.session.HttpSessionEventPublisher;


@EnableWebSecurity
@Configuration

@ComponentScan("com.cybernetic.cnerp.services")
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests().antMatchers( "/security/login").permitAll();
        http.authorizeRequests().antMatchers( "/hrmis/rest-api/**").permitAll();
        http.authorizeRequests()
                .antMatchers("/**")
                .access("isAuthenticated()");

        http.authorizeRequests()
                .and()
                .formLogin()
                .loginProcessingUrl("/j_spring_security_check")
                .loginPage("/security/login")
                .defaultSuccessUrl("/dashboard", true)
                .failureUrl("/security/login?error=true")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
                .logout()
                .logoutUrl("/security/logout")
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/security/login?logout=true")
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
                .maximumSessions(10)
                .expiredUrl("/security/login?expired=true")  ;
    }

    @Bean
    public HttpSessionEventPublisher httpSessionEventPublisher() {
        return new HttpSessionEventPublisher();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/theme/**",
                        "/build/**",
                        "/plugin.css/**",
                        "/favicon.ico",
                        "/jquery-confirm-custom.js",
                        "/css/**",
                        "/js/**",
                        "/images/**",
                        "/uploads/**",
                        "/public-files/**",
                        "/error/**");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
