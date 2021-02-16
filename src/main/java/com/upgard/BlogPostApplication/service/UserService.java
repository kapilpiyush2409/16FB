package com.upgard.BlogPostApplication.service;

import com.upgard.BlogPostApplication.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // Contain all the business logic and communicate to db
    public boolean login(User user) {
        if(user.getUsername().equals("piyush_kapil") && user.getPassword().equals("1234"))
            return true;
        else
            return false;
    }
}
