package be.codesandnotes.swns;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/notifications/**")
//                .allowedOrigins("http://localhost:4200", "http://127.0.0.1:4200")
//                .allowedMethods("GET", "POST", "PUT", "DELETE")
//                .allowedHeaders("Accept","Authorization","Content-Type","Origin","X-Requested-With")
//                ;
    }
}
