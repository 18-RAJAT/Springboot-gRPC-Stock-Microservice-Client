package com.rajat;

import com.rajat.service.StockClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockTradingClientApplication implements CommandLineRunner {

    @Autowired
    private StockClientService stockClientService;

    public static void main(String[] args) {
        SpringApplication.run(StockTradingClientApplication.class, args);
    }

    @Override
    public void run(String... args) {
        var response = stockClientService.getStockPrice("GOOG");
        System.out.println("Result from gRPC Server: " + response);
    }
}
