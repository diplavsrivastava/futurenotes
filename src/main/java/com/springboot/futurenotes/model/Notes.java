package com.springboot.futurenotes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table
public class Notes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "question")
	private String question;
	
	@Column(name = "input")
	private String input;
	
	@Column(name = "output_explaination")
	private String outputExplaination;
	
	@Column(name = "ituition")
	private String ituition;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "category")
	private Long category;
	
	@CreationTimestamp
	private Date createDate;
	
	@CreationTimestamp
	private Date updateDate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	public String getOutputExplaination() {
		return outputExplaination;
	}
	public void setOutputExplaination(String outputExplaination) {
		this.outputExplaination = outputExplaination;
	}
	public String getItuition() {
		return ituition;
	}
	public void setItuition(String ituition) {
		this.ituition = ituition;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getCategory() {
		return category;
	}
	public void setCategory(Long category) {
		this.category = category;
	}
	
	
}
