package learn.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
                http
                        .authorizeRequests()
                        .anyRequest().authenticated()
                .and().httpBasic();
        return (SecurityFilterChain)http.build();
    }
}
