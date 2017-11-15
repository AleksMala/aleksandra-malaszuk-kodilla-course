package com.kodilla.testing.forum.statistics;

public class DiscussionForum {

    private Statistics statistics;

    public DiscussionForum(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getPostPerUser(){
        return statistics.postsCount() / statistics.usersNames().size();
    }

    public double getCommentsPerUser(){
        return statistics.commentsCount() / statistics.usersNames().size();
    }

    public double getCommentsPerPost(){
        return statistics.commentsCount() / statistics.postsCount();
    }

    public Statistics ShowStatistics(Statistics statistics){
        return statistics;
    }

}
