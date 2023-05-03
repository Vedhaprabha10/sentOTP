package com.example.multipartfile.Controller;

import com.example.multipartfile.Entity.User;
import com.example.multipartfile.Service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private ObjectMapper mapper;
    private Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping
    public ResponseEntity<?> addUserInfo(@RequestParam ("file")MultipartFile file,
            @RequestParam("userData")User userData){

        User user = userService.addUser(userData);
        this.logger.info("add user request");
        logger.info("File info {}",file.getOriginalFilename());
        logger.info("user : {}",userData);

        return ResponseEntity.ok("done");
    }

}
