package com.siqueira.julio.springblog.entities;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "comments")
public class Comment extends  AbstractEntity<Long> {

    @NotNull
    @Size(min = 5, max = 100)
    String title;


    @NotNull
    @Column(columnDefinition="LONGTEXT")
    String content;

    @NotNull
    @Size(min = 5, max = 100)
    String author;
    LocalDate publishDate;

    Long postId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }
}
