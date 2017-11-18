package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumTestSuite {
    private Statistics statistics = mock(Statistics.class);
    private DiscussionForum forum = new DiscussionForum(statistics);

    @Before
    public void beforeEveryTest() {
    }

    @Test
    public void testGetAvPost(){
        //Given
        int post = 1000;
        List<String> user = new ArrayList<>();
        user.add("Jacek");
        user.add("Tomek");
        when(statistics.postsCount()).thenReturn(post);
        when(statistics.usersNames()).thenReturn(user);
        //When
        double result = forum.getPostPerUser();
        //Then
        assertEquals(500, result,1);
    }

    @Test
    public void testGetAvWithZeroPost(){
        //Given
        int post = 0;
        List<String> user = new ArrayList<>();
        user.add("Jacek");
        user.add("Tomek");
        when(statistics.postsCount()).thenReturn(post);
        when(statistics.usersNames()).thenReturn(user);
        //When
        double result = forum.getPostPerUser();
        //Then
        assertEquals(0, result,1);
    }

    @Test
    public void testGetAvWithZeroComments(){
        //Given
        int comments = 0;
        List<String> users = new ArrayList<>();
        users.add("Jacek");
        users.add("Tomek");
        when(statistics.commentsCount()).thenReturn(comments);
        when(statistics.usersNames()).thenReturn(users);
        //When
        double result = forum.getCommentPerUser();
        //Then
        assertEquals(0, result,1);
    }

    @Test
    public void testGetAvWithZeroUsers(){
        //Given
        int comments = 10;
        List<String> users = new ArrayList<>();
        when(statistics.commentsCount()).thenReturn(comments);
        when(statistics.usersNames()).thenReturn(users);
        //When
        double result = forum.getCommentPerUser();
        //Then
        assertEquals(0, result,1);
    }

    @Test
    public void testGetAvWithUsers(){
        //Given
        int comments = 10;
        List<String> users = new ArrayList<>();
        for (int i = 0; i<100; i++){
            users.add("Jacek");
        }
        when(statistics.commentsCount()).thenReturn(comments);
        when(statistics.usersNames()).thenReturn(users);
        //When
        double result = forum.getCommentPerUser();
        //Then
        assertEquals(1, result,1);
    }

    @Test
    public void testMoreComments(){
        //Given
        int comments = 10;
        int post = 1;
        when(statistics.postsCount()).thenReturn(post);
        when(statistics.commentsCount()).thenReturn(comments);
        //When
        double result = forum.getCommentPerPost();
        //Then
        assertEquals(10, result,1);
    }

    @Test
    public void testMorePosts(){
        //Given
        int comments = 10;
        int post = 100;
        when(statistics.postsCount()).thenReturn(post);
        when(statistics.commentsCount()).thenReturn(comments);
        //When
        double result = forum.getCommentPerPost();
        //Then
        assertEquals(0.1, result, 1);
    }

    @Test
    public void testShowStatistics(){
        //Given
        int comments = 10;
        int post = 100;
        List<String> users = new ArrayList<>();
        users.add("Jacek");
        //When
        when(statistics.usersNames()).thenReturn(users);
        when(statistics.postsCount()).thenReturn(post);
        when(statistics.commentsCount()).thenReturn(comments);
        Statistics stat = forum.ShowStatistics(statistics);
        //Then
        assertEquals(statistics, stat);
    }

}

