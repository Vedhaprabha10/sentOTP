package com.example.multipartfile.Repository;

import com.example.multipartfile.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
