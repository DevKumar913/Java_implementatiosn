package com.kumar.Optional2Throw;

import java.util.Optional;

public class Optional_throw {public static void main(String[] args) {
    int userId = 42; 
    Optional<User> optionalUser = findUserById(userId);
    User user = optionalUser.orElseThrow(() -> new UserNotFoundException("User not found"));

    System.out.println("User found: " + user.getName());
}

public static Optional<User> findUserById(int userId) {
    if (userId == 42) {
        return Optional.of(new User(42, "Alice"));
    } else {
        return Optional.empty();
    }
}
}
