package psi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.ArrayList;

public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private String fullName;
    private boolean enabled;
    private ArrayList<Chapter> chapters;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public ArrayList<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(ArrayList<Chapter> chapters) {
        this.chapters = chapters;
    }

    public void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }

    public void updateChapter(Chapter newChapter) {
        chapters.stream()
                .filter(chapter -> chapter.getId().equals(newChapter.getId()))
                .findAny()
                .ifPresent(chapter -> chapters.set(chapters.indexOf(chapter), newChapter));
    }
}
