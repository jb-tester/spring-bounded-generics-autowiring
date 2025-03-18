package org.example.springboundedgenericsautowiring.generics;

import org.springframework.stereotype.Component;

@Component
public class InjectBeanViaUnboundedGenericConstructorByNameOnly {
    private final Object obj;

    // navigates to AnnotationMBeanExporter, not to 'foo1' - ok!!!
    public <T> InjectBeanViaUnboundedGenericConstructorByNameOnly(T foo1) {
        this.obj =foo1;
    }

    public void displayMethod() {
        System.out.println("============ inject bean via generic constructor of no specific type: ==========");
        System.out.println(obj.getClass().getSimpleName());
    }
}