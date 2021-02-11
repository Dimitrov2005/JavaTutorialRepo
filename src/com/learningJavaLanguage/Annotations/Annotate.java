package com.learningJavaLanguage.Annotations;

import java.io.Serializable;

public class Annotate {
    @java.lang.annotation.Repeatable(enhancementReqOne.class) //Make class repeatable

    public @interface enhancementReq1 {}

    public @interface enhancementReqOne {
        enhancementReq1[] value();
    }

    public Object doSomethingStupid(Object obj){
        Serializable object = (Serializable) obj;
        obj = 10;
        return obj;
    }

    public @interface enhancmentReq{
        int id();
        String synopsis();
        String engineer()  default "[unassigned]";
        String date() default "[unknown]";
    }

    @enhancmentReq(
            id = 1,
            synopsis = "i"
    )
    public void enha(){}
}
