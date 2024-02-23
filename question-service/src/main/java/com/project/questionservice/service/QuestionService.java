package com.project.quizapp.service;

import com.project.quizapp.model.Question;
import com.project.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<List<Question>> getQuestionsByCategory(String category) {
        try{
            return new ResponseEntity<>(questionDao.findByCategory(category),HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Question>> getAllQuestions() {
        try{
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> addQuestion(Question question) {
        try {
            questionDao.save(question);
            return new ResponseEntity<>("Success", HttpStatus.CREATED);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(" Question not Added", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<String> updateQuestion(Question question,Integer id) {
        try {
            question.setId(id);
            questionDao.save(question);
            return new ResponseEntity<>("Update Successful", HttpStatus.ACCEPTED);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Update Unsuccessful", HttpStatus.NOT_MODIFIED);
    }

    public ResponseEntity<String> deleteQuestion(Integer id){
        try {
            questionDao.deleteById(id);
            return new ResponseEntity<>("Deletion Successful", HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>("Deletion Unsuccessful", HttpStatus.BAD_REQUEST);
    }
}
