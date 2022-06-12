package Kirill.Localhost.StudyingJava.Models;

import Kirill.Localhost.StudyingJava.Entities.PostEntity;

public class Post {
    private Long id;
    private String title;
    private String annotation;
    private String full_text;

    public static Post toModel(PostEntity entity) {
        Post model = new Post();
        model.setId(entity.getId());
        model.setTitle(entity.getTitle());
        model.setAnnotation(entity.getAnnotation());
        model.setFull_text(entity.getFull_text());
        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }
}
