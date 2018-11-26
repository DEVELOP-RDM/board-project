package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "POST")
public class Post {

  @Id
  @GeneratedValue
  private Integer id;

  private String title;

  private String writer;

  private String contents;

  public Post() {

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) { this.writer = writer; }

  public String getContents() {
    return contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public Post(String title, String writer, String contents) {
    this.title = title;
    this.writer = writer;
    this.contents = contents;
  }
}
