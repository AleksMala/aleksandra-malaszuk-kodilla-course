package com.kodilla.testing.forum.statistics;

public class DiscussionForum {

    private double commentPerPost;
    private double postPerUser;
    private double commentPerUser;
    private int posts;
    private int comments;
    private int usersNumber;

    public void calculateAverage (Statistics statistics){
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        usersNumber =  statistics.usersNames().size();

        if(usersNumber == 0){
            postPerUser = 0;
        } else {
            postPerUser = (double) posts / usersNumber;
        }

        if(usersNumber == 0){
            commentPerUser = 0;
        } else {
            commentPerUser = (double) comments / usersNumber;
        }

        if(posts == 0){
            commentPerUser = 0;
        } else {
            commentPerPost = (double) comments / posts;
        }

    }

    public double getPostPerUser() {
            return postPerUser;
    }

    public double getCommentPerUser(){
        return commentPerUser;
    }

    public double getCommentPerPost(){
        return commentPerPost;
    }

    public int getPostsCount(){
        return posts;
    }

    public int getCommentsCount(){
        return comments;
    }

    public int getUsersName(){
        return usersNumber;
    }

    public Statistics ShowStatistics(Statistics statistics){
        return statistics;
    }
}
