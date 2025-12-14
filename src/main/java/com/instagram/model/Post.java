package com.instagram.model;

import jakarta.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caption;
    private String imageUrl;

    @ManyToOne
    private User user;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCaption() { return caption; }
    public void setCaption(String caption) { this.caption = caption; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
