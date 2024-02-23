package com.project.quizservice.dao;

import com.project.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
