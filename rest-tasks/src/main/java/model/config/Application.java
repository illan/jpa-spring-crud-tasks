package model.config;
import org.springframework.data.jpa.repository.query.*;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import model.domain.*;
import model.repositories.*;


@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        OperarioRepository repository = context.getBean(OperarioRepository.class);

        // save a couple of Operarios
        repository.save(new Operario("Jack"));
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

        context.close();
    }

}

/*

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.data.jpa.repository.query.*;

@Configuration
@EnableJpaRepositories
//@EnableTransactionManagement
@Import(RepositoryRestMvcConfiguration.class)
class Application {

  @Bean
  public DataSource dataSource() {

    EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
    return builder.setType(EmbeddedDatabaseType.HSQL).build();
  }

  @Bean
  public EntityManagerFactory entityManagerFactory() {

    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    vendorAdapter.setGenerateDdl(true);

    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
    factory.setJpaVendorAdapter(vendorAdapter);
    factory.setPackagesToScan("model.domain");
    factory.setDataSource(dataSource());
    factory.afterPropertiesSet();

    return factory.getObject();
  }

  @Bean
  public PlatformTransactionManager transactionManager() {

    JpaTransactionManager txManager = new JpaTransactionManager();
    txManager.setEntityManagerFactory(entityManagerFactory());
    return txManager;
  }
}
*/