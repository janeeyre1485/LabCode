package psi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psi.model.Chapter;
import psi.persistence.ChapterRepository;

import java.util.List;

@Service
public class ChapterServiceImpl implements  ChapterService {

    @Autowired
    ChapterRepository chapterRepository;

    @Override
    public List<Chapter> getChapters() {
        return chapterRepository.findAll();
    }

    @Override
    public void addChapter(Chapter chapter) {
        chapterRepository.save(chapter);
    }

    @Override
    public void deleteChapter(String id) {
        Chapter chapter = chapterRepository.findById(id).get();
        chapterRepository.delete(chapter);
    }

    @Override
    public Chapter getChapterById(String id) {
        return chapterRepository.findById(id).get();
    }

    @Override
    public void saveChapter(Chapter chapter) {
        chapterRepository.save(chapter);
    }


}
