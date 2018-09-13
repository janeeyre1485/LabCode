package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.Chapter;
import psi.model.Item;
import psi.service.ChapterService;

import java.util.List;

@RestController
@RequestMapping("/chapters")
public class ChapterController {
    @Autowired
    ChapterService chapterService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Chapter> addChapter(@RequestBody Chapter chapter) {
        chapterService.addChapter(chapter);
        return new ResponseEntity<>(chapter, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ResponseEntity<Chapter> addItemToChapter(@PathVariable String id, @RequestBody Item item) {
        Chapter chapter = chapterService.getChapterById(id);
        chapter.addItem(item);
        chapterService.saveChapter(chapter);
        return new ResponseEntity<>(chapter, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Chapter> deleteChapter(@PathVariable String id) {
        chapterService.deleteChapter(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Chapter> getAllChapters() {
        return chapterService.getChapters();
    }

    @RequestMapping(value = "/{id}/items", method = RequestMethod.DELETE)
    public ResponseEntity<Chapter> deleteItemFromChapter(@PathVariable String id, @RequestBody Item item) {
        System.out.println(item.toString());
        Chapter chapter = chapterService.getChapterById(id);
        chapter.removeItem(item);
        chapterService.saveChapter(chapter);
        return new ResponseEntity<>(chapter, HttpStatus.OK);
    }

}
