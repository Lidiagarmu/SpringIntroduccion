package com.example.config;

import com.example.primary.CustomerAServiceImpl;
import com.example.primary.CustomerService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
// podria ser otra opcion -->@
@ImportResource("classpath:beans.xml") //forma mas antigua
public class BeansConfig {

    //desde aqui normalmente se configura la conexion a una base de datos, la configuracion de una cache, de un cliente web..

    //esta opcion se va a utilizar para configurar clases que provienen de frameworks externos

   /* @Bean
    public CustomerService customerService(){
        return new CustomerAServiceImpl();
    }

    */

}
