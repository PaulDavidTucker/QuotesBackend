package com.quotesbackend.quotesbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quotesbackend.quotesbackend.Model.Users;

public interface UsersRepository extends JpaRepository <Users, Integer>{


}
