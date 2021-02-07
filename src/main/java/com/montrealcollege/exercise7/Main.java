package com.montrealcollege.exercise7;

import com.montrealcollege.exercise7.config.JavaConfig;
import com.montrealcollege.exercise7.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Employee emp1 = context.getBean("employee1", Employee.class);
        Employee emp2 = context.getBean("employee2", Employee.class);

        System.out.println(emp1);
        System.out.println(emp2);
    }
}
