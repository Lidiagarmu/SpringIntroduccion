package com.example.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/*
* @Qualifier es otra opcion. veamosla en el archivo EmployeeController
* */

//@Primary nos indicaria que es el bean que normalmente se va a inyectar
@Primary
@Service
public class CustomerAServiceImpl implements CustomerService{
    @Override
    public String hello() {
        return "Hello from Customer A";
    }
}
