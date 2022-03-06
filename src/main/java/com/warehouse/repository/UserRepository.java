package com.warehouse.repository;

import com.warehouse.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
