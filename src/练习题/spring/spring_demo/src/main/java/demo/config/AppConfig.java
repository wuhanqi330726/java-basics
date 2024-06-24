package demo.config;

import demo.User;
//import com.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "demo")
@Configuration
public class AppConfig {

    @Bean
    public User user(){
        return new User();
    }

}
