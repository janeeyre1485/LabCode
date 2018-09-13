package psi.service;

import psi.model.Chapter;

import java.util.List;

public interface ChapterService {

    List<Chapter> getChapters();

    void addChapter(Chapter chapter);

    void deleteChapter(String id);

    Chapter getChapterById(String id);

    void saveChapter(Chapter chapter);



}
