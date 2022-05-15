package com.almasjss.StolikWebCRUD.controller;


import com.almasjss.StolikWebCRUD.model.User;
import com.almasjss.StolikWebCRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user) {
    return  ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(user));
    }

    @GetMapping
    public ResponseEntity<Page<User>> getAllUser(
            @RequestParam(required = false,defaultValue = "0") Integer page,
            @RequestParam(required = false,defaultValue = "10") Integer size,
            @RequestParam(required = false,defaultValue = "false") Boolean enablePagination){
        return ResponseEntity.ok(userService.getAllUser(page,size,enablePagination));
    }

@DeleteMapping(value = "/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        ResponseEntity.ok(!userService.existById(id));
}

@GetMapping(value = "/{id}")
public ResponseEntity<Optional<User>> findStudentById(@PathVariable ("id") Long id){
       return ResponseEntity.status(HttpStatus.OK).body(userService.findById(id));


}
@PutMapping
    public ResponseEntity<User> editUser(@RequestBody User user){
        return null;
}
}
