package com.eversis.spaceagency.configuration;

import com.sun.deploy.net.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableWebSecurity
public class MvcConfiguration implements WebMvcConfigurer {

//    private static final String INDEX_FILE = "/index.html";
//    private static final List<String> NAVIGATION_PATTERNS = Arrays.asList(
//            "/",
//            "/main",
//            "/tests");
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        if (!registry.hasMappingForPattern("/**")) {
//            registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/");
//        }
//    }
//
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index");
//        NAVIGATION_PATTERNS.forEach(nP -> registry.addViewController(nP).setViewName(INDEX_FILE));
    }


//    CredentialsProvider provider = new BasicCredentialsProvider();
//    UsernamePasswordCredentials credentials
//            = new UsernamePasswordCredentials("admin", "admin");

//provider.setCredentials(AuthScope.ANY, credentials);

//    HttpClient client = HttpClientBuilder.create()
//            .setDefaultCredentialsProvider(provider)
//            .build();
//
//    HttpResponse response = client.execute(
//            new HttpGet(URL_SECURED_BY_BASIC_AUTHENTICATION));
//    int statusCode = response.getStatusLine()
//            .getStatusCode();
//
//    assertThat(statusCode, equalTo(HttpStatus.SC_OK));

//    @Bean
//    public Docket SwaggerApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors.any())
//                .paths(PathSelectors.any())
//                .build();
//    }
}
