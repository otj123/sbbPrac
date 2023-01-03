package com.mysite.sbb.answer;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.mysite.sbb.question.Question;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class Answerservice {
	
	private final AnswerRepository aR;
	
	public void create(Question question, String content) {
		Anser answer = new Anser();
		answer.setContent(content);
		answer.setCreateDate(LocalDateTime.now());
		answer.setQuestion(question);
		this.aR.save(answer);
	}
}
