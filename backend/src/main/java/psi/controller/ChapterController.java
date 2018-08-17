package psi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import psi.model.Chapter;
import psi.service.ChapterService;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteChapter(@PathVariable String id) {
        chapterService.deleteChapter(id);
    }
}
