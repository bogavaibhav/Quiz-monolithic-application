package com.project.quizapp.controller;

import com.project.quizapp.model.Question;
import com.project.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
    @PutMapping("update/{id}")
    public ResponseEntity<String> updateQuestion(@RequestBody Question question,@PathVariable Integer id){
        return questionService.updateQuestion(question,id);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Integer id){
        return questionService.deleteQuestion(id);
    }

}
