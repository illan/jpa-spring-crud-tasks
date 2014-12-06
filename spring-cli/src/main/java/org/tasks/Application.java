package org.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.tasks.model.domain.*;
import org.tasks.model.repositories.*;
import java.util.List;

@Configuration
@ComponentScan
@EnableAutoConfiguration
//@Import(RepositoryRestMvcConfiguration.class)
public class Application {

    public static void main(String[] args) {
         ApplicationContext context = SpringApplication.run(Application.class, args);
         
         
        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = context.getBeanDefinitionNames();
        java.util.Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        
     System.out.println("-------------------------------");
     System.out.println("SETUP CONTEXT");
     System.out.println("-------------------------------");


        OperarioRepository repository = context.getBean(OperarioRepository.class);
        TareaRepository tareaRepository = context.getBean(TareaRepository.class);

        // save a couple of Operarios

  
        Operario o = new Operario("Jack");
        repository.save(o);
        
        Direccion d = new Direccion("Direccion Tarea 1");
        
        context.getBean(DireccionRepository.class).save(d);
        
        Tarea t=new Tarea("Tarea asignada a Jack");
        t.setDireccion(d);
        t.setAsignado(o);

        tareaRepository.save(t);

        Ejecucion e=new Ejecucion(t,o,Tarea.Estado.COMPLETADA);
        context.getBean(EjecucionRepository.class).save(e);

        tareaRepository.save(t);
        repository.save(o);
        
        repository.save(new Operario("Chloe"));
        repository.save(new Operario("Bauer"));

      
        // fetch all customers
        Iterable<Operario> customers = repository.findAll();
        System.out.println("Operarios found with findAll():");
        System.out.println("-------------------------------");
        for (Operario customer : customers) {
            System.out.println(customer);
        }
        System.out.println();

        // fetch an individual customer by ID
        Operario operario = repository.findOne(1L);
        System.out.println("Operario found with findOne(1L):");
        System.out.println("--------------------------------");
        System.out.println(operario);
        System.out.println();

        // fetch Operarios by last name
        List<Operario> bauers = repository.findByNombre("Bauer");
        System.out.println("Operario found with findByLastName('Bauer'):");
        System.out.println("--------------------------------------------");
        for (Operario bauer : bauers) {
            System.out.println(bauer);
        }

       // context.close();
 
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
