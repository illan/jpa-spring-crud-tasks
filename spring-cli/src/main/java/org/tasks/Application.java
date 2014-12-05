package org.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
/*    
   @Bean
   public JacksonRepositoryPopulatorFactoryBean repositoryPopulator() {

    Resource sourceData = new ClassPathResource("test-data.json");

    JacksonRepositoryPopulatorFactoryBean factory = new JacksonRepositoryPopulatorFactoryBean();
    // Set a custom ObjectMapper if Jackson customization is needed
    //factory.setObjectMapper(…);
    factory.setResources(new Resource[] { sourceData });
    return factory;
  }
 */ 
}
