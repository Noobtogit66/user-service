package com.sagnik.democlient.repository;

import com.sagnik.democlient.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String>
{

}