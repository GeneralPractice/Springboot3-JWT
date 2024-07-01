package com.example.JwtExample3.services;

import com.example.JwtExample3.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Anam Sami","anam.sami@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Alisha Sami","alisha.sami@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Sabiha Sami","sabiha.sami@dev.in"));
        store.add(new User(UUID.randomUUID().toString(),"Athar Sami","athar.sami@dev.in"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
