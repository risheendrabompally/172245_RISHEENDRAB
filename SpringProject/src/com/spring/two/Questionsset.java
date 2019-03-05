package com.spring.two;

import java.util.Set;

public class Questionsset {
	
	private int questionId;
	private String question;
	private Set<String> answers;
	
	public Questionsset() {
		super();
	}

	public Questionsset(int questionId, String question, Set<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Set<String> getAnswers() {
		return answers;
	}

	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	
	public void display() {
		System.out.println("Question:" +getQuestion());
		System.out.println("Answer:" +getAnswers());
	}

}
