{"filter":false,"title":"Application.java","tooltip":"/src/main/java/Application.java","undoManager":{"mark":2,"position":2,"stack":[[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":18,"column":1},"action":"insert","lines":["package hello;","","import org.springframework.boot.SpringApplication;","import org.springframework.boot.autoconfigure.EnableAutoConfiguration;","import org.springframework.context.annotation.Configuration;","import org.springframework.context.annotation.Import;","import org.springframework.data.jpa.repository.config.EnableJpaRepositories;","import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;","","@Configuration","@EnableJpaRepositories","@Import(RepositoryRestMvcConfiguration.class)","@EnableAutoConfiguration","public class Application {","","\tpublic static void main(String[] args) {","\t\tSpringApplication.run(Application.class, args);","\t}","}"]}]}],[{"group":"doc","deltas":[{"start":{"row":0,"column":0},"end":{"row":0,"column":1},"action":"insert","lines":["/"]}]}],[{"group":"doc","deltas":[{"start":{"row":0,"column":1},"end":{"row":0,"column":2},"action":"insert","lines":["/"]}]}]]},"ace":{"folds":[],"scrolltop":0,"scrollleft":0,"selection":{"start":{"row":0,"column":2},"end":{"row":0,"column":2},"isBackwards":true},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":0},"timestamp":1417642554138,"hash":"07d9dc70f177934558c884560286956823751a39"}