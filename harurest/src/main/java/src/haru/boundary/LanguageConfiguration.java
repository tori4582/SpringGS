package src.haru.boundary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
    @ComponentScan(packageName):
        set the search package for Spring in order to looking for beans
*/
@Configuration
@ComponentScan("src.haru.boundary.boundary")
public class LanguageConfiguration {
    
    @Bean
    public Language getLanguage() {
        return new French();
    }
}
