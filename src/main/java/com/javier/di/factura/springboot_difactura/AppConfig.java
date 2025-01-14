package com.javier.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.javier.di.factura.springboot_difactura.models.Item;
import com.javier.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    @Primary
    List<Item> itemsInvoices(){
        Product p1 = new Product("Camara Sony",800);
        Product p2 = new Product("Bicicleta",1500);
        return  Arrays.asList(new Item(p1,2),new Item(p2,4));
        
    }

    @Bean
    List<Item> itemsInvoicesOficce(){
        Product p1 = new Product("Monitor 24 pulgadas",700);
        Product p2 = new Product("Macbook M1",2400);
        Product p3 = new Product("Impresora ",800);
        Product p4 = new Product("Escritorio",300);
        return  Arrays.asList(new Item(p1,4),new Item(p2,6)
        ,new Item(p3,3),new Item(p4,4)
        );
        
    }
}
