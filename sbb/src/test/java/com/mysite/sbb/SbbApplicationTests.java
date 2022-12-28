package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SbbApplicationTests {
	
	@Autowired
	private QuestionRepository questionRepository;
	
	 @Autowired
	    private AnswerRepository answerRepository;
	
	@Test
	void testJpa() {
		/*
		 * Question q1 = new Question(); q1.setSubject("sbb가 무엇인가용?");
		 * q1.setContent("sbb에 대해서 알고싶여용"); q1.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q1);
		 * 
		 * Question q2 = new Question(); q2.setSubject("스부 모델 질문입니당");
		 * q2.setContent("id는 자동생성되나용"); q2.setCreateDate(LocalDateTime.now());
		 * this.questionRepository.save(q2);
		 */
		/*
		 * List<Question> all = this.questionRepository.findAll(); assertEquals(2,
		 * all.size());
		 * 
		 * Question q = all.get(0); assertEquals("sbb가 무엇인가용?", q.getSubject());
		 */
		/*
		 * Optional<Question> oq = this.questionRepository.findById(1);
		 * if(oq.isPresent()) { Question q =oq.get(); assertEquals("sbb가 무엇인가용?",
		 * q.getSubject()); }
		 */
		/*
		 * Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
		 * assertEquals(1, q.getId());
		 */
		/*
		 * Question q = this.questionRepository.findBySubjectAndContent("sbb가 무엇인가용?",
		 * "sbb에 대해서 알고싶여용"); assertEquals(1, q.getId());
		 */
		/*
		 * List<Question> qList = this.questionRepository.findBySubjectLike("%sbb%");
		 * Question q = qList.get(0); assertEquals("sbb가 무엇인가용?",q.getSubject());
		 */
		/*
		 * Optional<Question> oq = this.questionRepository.findById(1);
		 * assertTrue(oq.isPresent()); Question q = oq.get(); q.setSubject("수정된 제목");
		 * this.questionRepository.save(q);
		 */
		/*
		 * assertEquals(2, this.questionRepository.count()); Optional<Question> oq =
		 * this.questionRepository.findById(1); assertTrue(oq.isPresent()); Question q =
		 * oq.get(); this.questionRepository.delete(q); assertEquals(1,
		 * this.questionRepository.count());
		 */
		/*
		 * Optional<Question> oq = this.questionRepository.findById(2);
		 * assertTrue(oq.isPresent()); Question q = oq.get();
		 * 
		 * Anser a = new Anser(); a.setContent("네 자동으로 생성됩니다."); a.setQuestion(q); // 어떤
		 * 질문의 답변인지 알기위해서 Question 객체가 필요하다. a.setCreateDate(LocalDateTime.now());
		 * this.answerRepository.save(a);
		 */
		 Optional<Question> oq = this.questionRepository.findById(2);
		 assertTrue(oq.isPresent());
	     Question q = oq.get();
	     
	     List<Anser> anserList = q.getAnswerList();
	     
	     assertEquals(1, anserList.size());
	     assertEquals("네 자동으로 생성됩니다.", anserList.get(0).getContent());
     
	        
	}
}
