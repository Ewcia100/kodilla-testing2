package com.kodilla.patterns.strategy.social;

public class User {
    final String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String sharePost(){
        return socialPublisher.share();
    }

    public void setPublishStrategy(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
