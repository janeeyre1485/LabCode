package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.Chapter;
import psi.model.User;
import psi.service.ChapterService;
import psi.service.UserService;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    UserService userService;

    @Autowired
    ChapterService chapterService;

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public ResponseEntity<User> createAccount(@RequestBody User user) {
        user.setChapters((ArrayList<Chapter>)chapterService.getChapters());
        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteAccount(@RequestBody String email) {
        userService.deleteUser(email);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public User doLogin(Principal principal) {
        User currentUser = userService.getUserByEmail(principal.getName());
        return currentUser;
    }



}
