package com.whoisparis.studentprof.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id) {
        super("Could not fount the user with id " + id);
    }
}
