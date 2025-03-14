package org.example.springboundedgenericsautowiring.generics;

import org.springframework.stereotype.Component;


// no injection points detected - AutowiredIn list is empty, NavigateToAutowiredCandidates does nothing
@Component
public class Foo2 implements ServiceFoo {


    @Override
    public String foo() {
       return "fooOnly from Foo2";
    }
}
