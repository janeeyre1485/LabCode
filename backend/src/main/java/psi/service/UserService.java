package psi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import psi.model.Chapter;
import psi.model.User;
import psi.persistence.UserRepository;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User updateUserContent(User user) {
        return userRepository.save(user);
    }

    public User findFirstByUsername(String email) {
        return userRepository.findFirstByUsername(email);
    }

    public List<Chapter> getAllChaptersForUser(String id) {
        User user = userRepository.findById(id).get();
        return user.getChapters();
    }

    public User getUserByEmail(String email) {
        return userRepository.findFirstByUsername(email);
    }

    public User findUserById(String id) {
        return userRepository.findById(id).get();
    }

    public void deleteUser(String email) {
        User user = userRepository.findFirstByUsername(email);
        userRepository.delete(user);
    }

    public void saveChapterToUser(User user, Chapter newChapter) {
        user.updateChapter(newChapter);
        userRepository.save(user);
    }

    public Chapter getChapter(String userId, String chapterId) {
        User user = userRepository.findById(userId).get();
        List<Chapter> chapters = user.getChapters();

        for (Chapter chapter : chapters) {
            if (chapter.getId().equals(chapterId)) {
                return chapter;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
