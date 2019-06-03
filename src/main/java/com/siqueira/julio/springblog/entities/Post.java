package com.siqueira.julio.springblog.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "posts")
public class Post  extends  AbstractEntity<Long>{
    @NotNull
    @Size(min = 5, max = 100)
    private String title;


    @NotNull
    @Size(min = 5)
    private  String content;

    private LocalDate publishDate;

    private LocalDate editDate;

    @OneToMany(mappedBy = "post")
    private List<Comment> comments;

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

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public LocalDate getEditDate() {
        return editDate;
    }

    public void setEditDate(LocalDate editDate) {
        this.editDate = editDate;
    }

    public List<Comment> getComment() {
        return comments;
    }

    public void setComment(List<Comment> comment) {
        this.comments = comment;
    }
}
