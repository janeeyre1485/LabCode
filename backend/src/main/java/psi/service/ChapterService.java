package psi.service;

import psi.model.Chapter;

import java.util.List;

public interface ChapterService {

    void save(Chapter chapter);

    Chapter findChapterById(String id);

    Chapter createChapter(Chapter chapter);

    void deleteChapter(String id);

    List<Chapter> getChapters();


}
