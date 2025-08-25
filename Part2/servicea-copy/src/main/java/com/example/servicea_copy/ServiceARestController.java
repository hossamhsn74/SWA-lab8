package com.example.servicea_copy;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceARestController {

	@GetMapping("/product/{id}")
    public Map<String, Object> getProductById(@PathVariable int id) {
        return Map.of(
            "id", id,
            "instock", false,
            "quantity", 333
        );
    }

}