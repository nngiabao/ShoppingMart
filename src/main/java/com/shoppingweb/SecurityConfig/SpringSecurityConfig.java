package com.shoppingweb.SecurityConfig;

/*
// Commented out since Spring Security dependencies are removed
import org.apache.catalina.security.SecurityConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.password.CompromisedPasswordChecker;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.password.HaveIBeenPwnedRestApiPasswordChecker;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfig {
    
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrfConfig -> csrfConfig.disable())
                .authorizeHttpRequests((requests) -> requests
                        // Public endpoints - no authentication required
                        .requestMatchers("/", "/shop", "/shop/**", "/products/**", "/contact", "/error", "/register").permitAll()
                        .requestMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/static/**").permitAll()
                        // Protected endpoints - authentication required
                        .requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated()
                        // All other requests require authentication
                        .anyRequest().authenticated());
        http.httpBasic(withDefaults());
        return http.build();
    }
    
    @Bean
    public CompromisedPasswordChecker compromisedPasswordChecker() {
        return new HaveIBeenPwnedRestApiPasswordChecker();
    }
}
*/
