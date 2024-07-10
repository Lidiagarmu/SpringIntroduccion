package com.example;

import com.example.controller.EmployeeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//con esta notacion Spring va a escanear los paquetes y va a encontrar los beans
//esta notacion va a escanear los paquetes contiguos a com.example , los que queden fuera no los leera
//@SpringBootApplication --> lo suyo es dejar este por defecto y tener las clases en diferentes paquetes al alcance todos del main
@ComponentScan({"com.example","com.example2"}) //para que esdanee tambien paquetes que esten fuera de la clase App. @SpringBootAplication seria redundante
public class App {

    public static void main(String[] args) {
       ApplicationContext context =  SpringApplication.run(App.class, args);

        //le pedimos que nos de el bean EmployeeController y lo guardamos en EmployeeController controller -->   EmployeeController controller = context.getBean(EmployeeController.class);
        // o se puede guardar con la diferencia de tipos var employeeController = ...
        var employeeController = context.getBean(EmployeeController.class);
        System.out.println(employeeController.helloFromEmployeeService());
        System.out.println(employeeController.helloFromCustomer());
    }


}
