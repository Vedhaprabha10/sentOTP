package com.example.multipartfile.Service;

import com.example.multipartfile.Entity.User;
import com.example.multipartfile.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;


    public User addUser(User user1){
        User user = new User();
        user.setId(user1.getId());
        user.setName(user1.getName());
        user.setCity(user1.getCity());
        User save = userRepo.save(user);
        return save;
    }
}
