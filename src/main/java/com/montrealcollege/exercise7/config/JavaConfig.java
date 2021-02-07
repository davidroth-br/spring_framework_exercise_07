package com.montrealcollege.exercise7.config;

import com.montrealcollege.exercise7.entities.Department;
import com.montrealcollege.exercise7.entities.Employee;
import com.montrealcollege.exercise7.entities.GenericDepartment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfig {

    @Bean(name = "Programming")
    public Department department1() {
        return new GenericDepartment("Programming");
    }

    @Bean(name = "QA")
    @Primary
    public Department department2() {
        return new GenericDepartment("Quality Assurance");
    }

    @Bean(name = "Mgm")
    public Department department3() {
        return new GenericDepartment("Management");
    }

    @Bean
    public Employee employee1() {
        Employee e = new Employee();
        e.setFullName("Darth Vader");
        return e;
    }

    @Bean
    public Employee employee2() {
        Employee e = new Employee();
        e.setFullName("Luke Skywalker");
        return e;
    }
}
