package com.security.demo.anotation.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("def default")
    private String deftName;

    @Value("${mail.host}")
    private String emailHost;

    @Value("${mail.email}")
    private String mailEmail;

    @Value("${mail.pass}")
    private String mailPass;

    @Value("${java.home}")
    private String javaHome;

    @Value("${HOME}")
    private String homDir;

    public String getDefaultName(){
        System.out.println(emailHost+"\n"+mailEmail+"\n"+mailPass);
        System.out.println();
        System.out.println(javaHome+"\n"+homDir);;
        return deftName;
    }


}
