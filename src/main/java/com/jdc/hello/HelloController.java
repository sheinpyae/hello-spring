package com.jdc.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

        @Autowired
        private HelloRepository repo;

        @GetMapping
        public List<Hello> getAll() {
            return repo.findAll();
        }

        @PostMapping
        public Hello create(@RequestBody Hello hello) {
                repo.save(hello);
                return hello;
        }

}
