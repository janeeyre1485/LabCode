package psi.service;

import psi.model.Chapter;

import java.util.List;

public interface ChapterService {

    List<Chapter> getChapters();

    void addChapter(Chapter chapter);

    void deleteChapter(String id);

}
