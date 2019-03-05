package com.spring.two;

public class Questions {
	String questionId;
	String question;
	String answers;
	
	public Questions() {
		super();
	}

	public Questions(String questionId, String question, String answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}
	
}
