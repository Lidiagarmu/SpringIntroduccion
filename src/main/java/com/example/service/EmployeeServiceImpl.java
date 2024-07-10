package com.example.service;



import org.springframework.stereotype.Service;

//A - DECLARACION DE BEANS 3 FORMAS (PARA CREAR LAS BEANS)
/*
 * 1. ANOTACIONES sobre las clases (@Component, @Repository, @Service, @Controller, @ RestController
 * 2. ANOTACION  @Bean a nivel de metodo en una clase de configuracion @Configuration
 * 3. Mediante XML utilizando @ImportResource en una clase con @Configuration
 * */


//creamos bean: le indicamos que es un bean con @Component porque es la clase que queremos inyectar a EmployeeController
//@Component
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Override
    public String hello() {
        return "Hola mundo";
    }
}
