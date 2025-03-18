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
            InjectFewSingleBoundGenericsByTypesFooAndBarAndName injectFewSingleBoundGenericsByTypesFooAndBarAndName,
            InjectSingleBoundGenericInConstructorByTypeFooAndName injectSingleBoundGenericInConstructorByTypeFooAndName,
            InjectListOfSingleBoundGenericInConstructorByTypeBar injectListOfSingleBoundGenericInConstructorByTypeBar,
            InjectListOfListOfBoundedTypes injectListOfListOfGenerics, InjectBeanViaUnboundedGenericConstructorByNameOnly injectBeanViaUnboundedGenericConstructorByNameOnly) {
        return args -> {
            System.out.println("--------------------------------------");
            injectGenericsListInConstructor.displayMethod();
            injectGenericsInConstructor.displayMethod();
            injectFewSingleBoundGenericsByTypesFooAndBarAndName.displayMethod();
            injectSingleBoundGenericInConstructorByTypeFooAndName.displayMethod();
            injectListOfSingleBoundGenericInConstructorByTypeBar.displayMethod();
            injectListOfListOfGenerics.displayMethod();
            injectBeanViaUnboundedGenericConstructorByNameOnly.displayMethod();
            System.out.println("--------------------------------------");
        };
    }
}
