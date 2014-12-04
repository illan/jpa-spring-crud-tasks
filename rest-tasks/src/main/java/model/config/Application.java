package model.config;
import org.springframework.data.jpa.repository.query.*;
import java.util.List;
import model.ApplicationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import model.domain.*;
import model.repositories.*;


// @Configuration
// @ComponentScan
// @EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

     System.out.println("-------------------------------");
     System.out.println("SETUP CONTEXT");
     System.out.println("-------------------------------");
//        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
      ConfigurableApplicationContext context = SpringApplication.run(ApplicationConfig.class);


        OperarioRepository repository = context.getBean(OperarioRepository.class);
        TareaRepository tareaRepository = context.getBean(TareaRepository.class);

        // save a couple of Operarios

        repository.save(new Operario("Chloe"));
        repository.save(new Operario("Bauer"));


        Operario o = new Operario("Jack");
        repository.save(o);        
        Tarea t=new Tarea("Tarea asignada a Jack");
        t.setAsignado(o);
        Ejecucion e=new Ejecucion(t,o,Tarea.Estado.COMPLETADA);
        
        context.getBean(EjecucionRepository.class).save(e);
        tareaRepository.save(t);
        
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

        context.close();
    

    }
    


}

