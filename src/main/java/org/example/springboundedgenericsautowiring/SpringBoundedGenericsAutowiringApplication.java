package org.example.springboundedgenericsautowiring;

import org.example.springboundedgenericsautowiring.generics.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBoundedGenericsAutowiringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoundedGenericsAutowiringApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(
                                               InjectMultiBoundGenericsListInConstructor injectGenericsListInConstructor,
                                               InjectMultiBoundGenericsInConstructorByTypeFooBarAndName injectGenericsInConstructor,
                                               InjectFewSingleBoundGenericsInConstructorByTypesFooAndBarAndName injectGenericsInConstructor2,
                                               InjectSingleBoundGenericInConstructorByTypeFooAndName injectSingleBoundGenericInConstructorByTypeFooAndName,
                                               InjectListOfSingleBoundGenericInConstructorByTypeBar injectListOfSingleBoundGenericInConstructorByTypeBar,
                                               InjectListOfListOfBoundedTypes injectListOfListOfGenerics) {
        return args -> {
            System.out.println("--------------------------------------");
            injectGenericsListInConstructor.displayMethod();
            injectGenericsInConstructor.displayMethod();
            injectGenericsInConstructor2.displayMethod();
            injectSingleBoundGenericInConstructorByTypeFooAndName.displayMethod();
            injectListOfSingleBoundGenericInConstructorByTypeBar.displayMethod();
            injectListOfListOfGenerics.displayMethod();
            System.out.println("--------------------------------------");
        };
    }
}
