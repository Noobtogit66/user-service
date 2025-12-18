package com.sagnik.democlient.controller;

import com.sagnik.democlient.model.User;
import com.sagnik.democlient.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController("/user-service")
public class UserController {
@Autowired
private UserService userService;

@GetMapping("/getUser/{userId}")
    public ResponseEntity getUser(@PathVariable String userId)
{
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getUserById(userId));
}

@GetMapping("/getUserList")
    public ResponseEntity getUserList()
{
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.getAllUser());
}

@PostMapping("/addUser")
    public ResponseEntity addUser(@RequestBody User user)
{
    log.info(user.toString());
    return ResponseEntity.status(HttpStatus.OK).body(userService.addUser(user));
}
@DeleteMapping("/deleteUser/{userId}")
public ResponseEntity deleteUser(@PathVariable String userId)
{
    userService.deleteUser(userId);
    return ResponseEntity.status(HttpStatus.OK).body(null);
}

}

