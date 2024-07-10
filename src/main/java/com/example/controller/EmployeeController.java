package com.example.controller;

import com.example.primary.CustomerService;
import com.example.service.EmployeeService;
import com.example2.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {


    //B- INYECCION DE BEANS:
    /*
    * 1. A nivel de campo con @Autowired
    * 2. A nivel de constructor (opcion mas recomendable ya que facilita el testing)
    * 3. A nivel de metodo setter
    * */

    //C - ESCANEO DE BEANS
    /* con esta notacion Spring va a escanear los paquetes y va a encontrar los beans
        @SpringBootApplication
    */


    //INYECCION --> le indicamos a Spring que EmployeeService es un objeto que tiene que inyectar con @Autowired
    //podemos hacerlo a traves de la notacion Autowired, con un constructor o con un setter
   // @Autowired
    private EmployeeService employeeService;

    //supongamos que esta clase tambien depende de CustomerService
    //el problema es que CustomerService tiene dos beans. solucionamos esto asignando la etiqueta @primary a uno de ellos
   // @Autowired
    private CustomerService customerService;

   // @Autowired
    private HelloService helloService;


    /*---@Qualifier --> cuando se va a inyectar el bean se escribe:

    @Qualifier("customerAServiceImpl") --> con esto le decimos que queremos el bean A

     */

    //inyectando mediante constructor


    public EmployeeController(EmployeeService employeeService, CustomerService customerService, HelloService helloService) {
        this.employeeService = employeeService;
        this.customerService = customerService;
        this.helloService = helloService;
    }

    public String helloFromEmployeeService(){
      return  this.employeeService.hello();

    }

    public String helloFromCustomer(){
        return  this.customerService.hello();

    }

}
