package com.kodilla.testing.forum.statistics;

public class DiscussionForum {

    private Statistics statistics;

    public DiscussionForum(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getAvPost(){
        return statistics.postsCount()/statistics.usersNames().size();
    }
    public double getAvComPerUser(){
        return statistics.commentsCount()/statistics.usersNames().size();
    }
    public double getAvComPerPost(){
        return  statistics.commentsCount()/statistics.postsCount();
    }

    public double calculateAverage (Statistics statistics){
        if(statistics.postsCount()>0 && statistics.commentsCount()>0) {
            return getAvComPerPost();
        }
        if(statistics.usersNames().size()>0 && statistics.postsCount()>0){
            return getAvPost();
        }
        if (statistics.usersNames().size()>0 && statistics.commentsCount()>0){
            return getAvComPerUser();
        }
        return 0;
    }

    public Statistics ShowStatistics(Statistics statistics){
        return statistics;
    }

}
