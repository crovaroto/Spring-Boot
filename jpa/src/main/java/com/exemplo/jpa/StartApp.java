package com.exemplo.jpa;

import com.exemplo.jpa.model.User;
import com.exemplo.jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Cássio");
        user.setUsername("crovaroto");
        user.setPassword("123456abc");

        repository.save(user);

        for (User u: repository.findAll()) {
            System.out.println(u);
        }
    }
}
