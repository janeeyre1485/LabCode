package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.Chapter;
import psi.model.User;
import psi.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{userId}/chapters", method = RequestMethod.GET)
    public ResponseEntity<List<Chapter>> getChaptersForUser(@PathVariable String userId) {
        return new ResponseEntity<>(userService.getAllChaptersForUser(userId), HttpStatus.OK);
    }

    @RequestMapping(value = "/{userId}/chapters/{chapterId}", method = RequestMethod.GET)
    public ResponseEntity<Chapter> getChapterForUser(@PathVariable String userId, @PathVariable String chapterId) {
        return new ResponseEntity<>(userService.getChapter(userId, chapterId), HttpStatus.OK);
    }

    @RequestMapping(value = "/{userId}/chapters", method = RequestMethod.PUT)
    public ResponseEntity<Chapter> saveChapterToUser(@PathVariable String userId, @RequestBody Chapter chapter) {

        User user = userService.findUserById(userId);
        userService.saveChapterToUser(user, chapter);
        return new ResponseEntity<>(chapter, HttpStatus.OK);

    }

    @RequestMapping(value = "/{username}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable String username) {

        userService.deleteUser(username);
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
