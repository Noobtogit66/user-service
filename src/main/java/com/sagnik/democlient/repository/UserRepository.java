package com.sagnik.democlient.repository;

import com.sagnik.democlient.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>
{

}