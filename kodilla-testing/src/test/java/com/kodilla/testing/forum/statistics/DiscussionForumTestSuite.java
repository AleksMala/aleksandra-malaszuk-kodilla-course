package com.kodilla.testing.forum.statistics;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiscussionForumTestSuite {
    private Statistics statistics = mock(Statistics.class);
    private DiscussionForum forum = new DiscussionForum();


    @Before
    public void beforeEveryTest() {
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(usersNamegenerate(100));
    }

    @Test
    public void testGetAvPost(){
        //Given
        //When
        forum.calculateAverage(statistics);
        //Then
        forum.getPostsCount();
        forum.getPostPerUser();
        forum.getCommentPerPost();
        assertEquals(1000, forum.getPostsCount(),0);
        assertEquals(10, forum.getPostPerUser(),0);
        assertEquals(0.1, forum.getCommentPerPost(),1);
    }

    @Test
    public void testGetAvWithZeroPost(){
        //Given
        when(statistics.postsCount()).thenReturn(0);
        //When
        forum.calculateAverage(statistics);
        //Then
        forum.getPostPerUser();
        forum.getPostsCount();
        forum.getCommentPerPost();
        assertEquals(0, forum.getPostPerUser(),0);
        assertEquals(0, forum.getPostsCount(),0);
        assertEquals(0, forum.getCommentPerPost(),0);
    }

    @Test
    public void testGetAvWithZeroComments(){
        //Given
        when(statistics.commentsCount()).thenReturn(0);
        //When
        forum.calculateAverage(statistics);
        //Then
        forum.getCommentPerUser();
        forum.getCommentPerPost();
        forum.getCommentsCount();
        assertEquals(0, forum.getCommentPerUser(),0);
        assertEquals(0, forum.getCommentPerPost(),0);
        assertEquals(0, forum.getCommentsCount(),0);
    }

    @Test
    public void testGetAvWithZeroUsers(){
        //Given
        when(statistics.usersNames()).thenReturn(usersNamegenerate(0));
        //When
        forum.calculateAverage(statistics);
        //Then
        forum.getCommentPerUser();
        forum.getUsersName();
        forum.getPostPerUser();
        assertEquals(0, forum.getCommentPerUser(),0);
        assertEquals(0, forum.getUsersName());
        assertEquals(0, forum.getPostPerUser(),0);
    }

    @Test
    public void testGetAvWithUsers(){
        //Given
        //When
        forum.calculateAverage(statistics);
        //Then
        forum.getCommentPerUser();
        forum.getPostPerUser();
        forum.getUsersName();
        assertEquals(1, forum.getCommentPerUser(),0);
        assertEquals(10, forum.getPostPerUser(),0);
        assertEquals(100, forum.getUsersName());
    }

    @Test
    public void testMoreComments(){
        //Given
        when(statistics.postsCount()).thenReturn(10);
        //When
        forum.calculateAverage(statistics);
        //Then
        forum.getCommentPerPost();
        assertEquals(10, forum.getCommentPerPost(),0);
    }

    @Test
    public void testMorePosts(){
        //Given
        //When
        forum.calculateAverage(statistics);
        //Then
        forum.getCommentPerPost();
        assertEquals(0.1, forum.getCommentPerPost(),0);
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

    public List<String> usersNamegenerate (int number){
    List<String> users = new ArrayList<>();
        for (int i = 0; i<number; i++) {
            users.add("Jacek");
        }
        return users;
    }
}

