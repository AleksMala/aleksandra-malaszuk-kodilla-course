package com.kodilla.testing.forum.statistics;

import java.util.List;

public class DiscussionForum {

    private Statistics statistics;
    private double commentPerPost;
    private double postPerUser;
    private double commentPerUser;
    private int posts ;
    private int comments;
    private List<String> users;

    public DiscussionForum(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAverage (Statistics statistics){
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        users =  statistics.usersNames();
        postPerUser = posts/users.size();
        commentPerUser = comments/users.size();
        commentPerPost = comments/posts;
    }

    public double getPostPerUser(){
        return postPerUser;
    }

    public double getCommentPerUser(){
        return commentPerUser;
    }

    public double getCommentPerPost(){
        return commentPerPost;
    }

    private int getPostsCount(){
        return posts;
    }

    public int getCommentsCount(){
        return comments;
    }

    public List<String> getUsersName(){
        return users;
    }

    public Statistics ShowStatistics(Statistics statistics){
        return statistics;
    }
}
