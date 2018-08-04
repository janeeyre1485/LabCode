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
@CrossOrigin(origins = "http://localhost:4200")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<Chapter>> getChapters() {
        return new ResponseEntity<>(chapterService.getChapters(),HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Chapter> getChapter(@PathVariable String id) {
        System.out.println("Calling controller wit id: " + id);
        return new ResponseEntity<>(chapterService.findChapterById(id),HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}/add-item", method = RequestMethod.POST)
    public ResponseEntity<Chapter> addItemToChapter(@PathVariable String id, @RequestBody Item item) {
        Chapter chapter = chapterService.findChapterById(id);
        chapter.addItem(item);
        chapterService.save(chapter);
        return new ResponseEntity<>(chapter, HttpStatus.OK);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Chapter> createChapter(@RequestBody Chapter chapter) {
        chapterService.save(chapter);
        return new ResponseEntity<>(chapter, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteChapter(@PathVariable String id) {
        chapterService.deleteChapter(id);

    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity<Chapter> saveChapter(@RequestBody Chapter chapter) {
        chapterService.save(chapter);
        return new ResponseEntity<>(chapter, HttpStatus.OK);
    }

}
