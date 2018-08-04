package psi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import psi.model.Chapter;
import psi.persistence.ChapterRepository;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ChapterServiceImpl implements  ChapterService {

    @Autowired
    ChapterRepository chapterRepository;

    @Override
    public void save(Chapter chapter) {
        chapterRepository.save(chapter);
    }

    @Override
    public Chapter findChapterById(String id) {
        return chapterRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException());
    }

    @Override
    public Chapter createChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    @Override
    public void deleteChapter(String id) {
        Chapter chapter = findChapterById(id);
        chapterRepository.delete(chapter);
    }

    @Override
    public List<Chapter> getChapters() {
        return chapterRepository.findAll();
    }


}
