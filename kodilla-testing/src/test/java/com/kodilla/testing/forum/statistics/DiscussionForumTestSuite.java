package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumTestSuite {
    private Statistics statistics = mock(Statistics.class);
    private DiscussionForum forum = new DiscussionForum(statistics);

    @Test
    public void testCalculateAdvStatisticsZeroPosts() {
        //Given
        int numberOfPosts = 0;
        List<String> user = new ArrayList<>();
        user.add("Jacek");
        user.add("Iwona");
        when(statistics.usersNames()).thenReturn(user);
        when(statistics.postsCount()).thenReturn(numberOfPosts);
        //When
        double result = forum.getPostPerUser();
        //Then
        assertTrue(result == 0);
    }


    @Test
    public void testCalculateAdvStatisticsThousandPosts(){
        //Given
        int numberOfPosts = 1000;
        List<String> user = new ArrayList<>();
        user.add("Jacek");
        user.add("Iwona");
        when(statistics.usersNames()).thenReturn(user);
        when(statistics.postsCount()).thenReturn(numberOfPosts);
        //When
        double result = forum.getPostPerUser();
        //Then
        assertEquals(500, result,0);
    }

    @Test
    public void testCalculateAdvStatisticsZeroComments(){
        //Given
        int numberOfComments = 0;
        int numberOfPosts = 10;
        when(statistics.commentsCount()).thenReturn(numberOfComments);
        when(statistics.postsCount()).thenReturn(numberOfPosts);
        //When
        double result = forum.getCommentsPerPost();
        //Then
        assertTrue(result == 0);
    }

    @Test
    public void testCalculateAdvStatisticsZeroUsers(){
        //Given
        List<String> users = new ArrayList<>();
        int numberOfComments = 2;
        when(statistics.commentsCount()).thenReturn(numberOfComments);
        when(statistics.usersNames()).thenReturn(users);
        //When
        double result = forum.getCommentsPerUser();
        //Then
        assertTrue(result == 0);
    }
    @Test
    public void testCalculateAdvStatisticsHundredUsers() {
        //Given
        int user = 100;
        int numberOfComments = 2;
        when(statistics.commentsCount()).thenReturn(numberOfComments);
        when(statistics.usersNames().size()).thenReturn(user);
        //When
        double result = forum.getPostPerUser();
        //Then
        assertEquals(50, result,0);
        }

        @Test
    public void testShowStatistics(){
        //Given
        //When
        Statistics result = forum.ShowStatistics(statistics);
        //Then
        assertEquals(statistics, result);
        }
    }

