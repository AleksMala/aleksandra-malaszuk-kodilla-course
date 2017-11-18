package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

        public static void main(String[] args) {

            PoemBeautifier poemBeautifier = new PoemBeautifier();
            poemBeautifier.beautify("",(text)->"John".toLowerCase());
            poemBeautifier.beautify("",(text)->"John".toUpperCase());
            poemBeautifier.beautify("",(text)->"John".substring(1,3));
            poemBeautifier.beautify("",(text)->"John".replaceFirst("J", "D"));

            Forum forum = new Forum();
            Map<Integer, ForumUser> theResultMapOfUsers = forum.getList().stream()
                    .filter(ForumUser -> ForumUser.getSex() == 'M')
                    .filter(ForumUser -> ForumUser.getBirthDate().getDayOfYear() < 1997)
                    .filter(ForumUser -> ForumUser.getPostsCount() > 0)
                    .collect(Collectors.toMap(ForumUser::getUniqueId, ForumUser->ForumUser));


            System.out.println("# elements: " + theResultMapOfUsers.size());
            theResultMapOfUsers.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);
        }
}
