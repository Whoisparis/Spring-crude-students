package com.whoisparis.studentprof.contoller;

import com.whoisparis.studentprof.exception.UserNotFoundException;
import com.whoisparis.studentprof.model.User;
import com.whoisparis.studentprof.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserContoller {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
       return userRepository.save(newUser);
    }

    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    User getUserById(@PathVariable Long id) {
        return userRepository.findById(id)
                .orElseThrow(()-> new UserNotFoundException(id));
    }


    @PutMapping("/user/{id}")
    User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setGroupp(newUser.getGroupp());
                    user.setName(newUser.getName());
                    user.setProfBuro(newUser.getProfBuro());
                    user.setDate(newUser.getDate());
                    user.setGrade(newUser.getGrade());
                    user.setProfStatus(newUser.getProfStatus());
                    user.setProfTicket(newUser.getProfTicket());
                    user.setComment(newUser.getComment());
                    return userRepository.save(user);
                }).orElseThrow(() -> new UserNotFoundException(id));
    }

    @DeleteMapping("/user/{id}")
    String deleteUser(@PathVariable Long id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException(id);
        }
        userRepository.deleteById(id);
        return "User with id " + id + " succeful deleted.";
    }

}
