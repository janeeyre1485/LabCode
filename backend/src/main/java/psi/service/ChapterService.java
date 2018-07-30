package psi.service;

import psi.model.Chapter;

public interface ChapterService {

    void save(Chapter chapter);

    Chapter findChapterById(String id);

    Chapter createChapter(Chapter chapter);

    void deleteChapter(String id);


}
