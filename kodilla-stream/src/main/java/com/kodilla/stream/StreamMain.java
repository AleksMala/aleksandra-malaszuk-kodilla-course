package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("STONE", string -> string.toLowerCase());
        poemBeautifier.beautify( "john", string-> string.toUpperCase());
        poemBeautifier.beautify("Noon", string -> string.substring(1, 3));
        poemBeautifier.beautify("Work", string-> string.replaceFirst("k", "th"));

            Forum forum = new Forum();
            Map<Integer, String> theResultMapOfUsers = forum.getList().stream()
                    .filter(ForumUser -> ForumUser.getSex() == 'M')
                    .filter(ForumUser -> ForumUser.getPostsCount() > 0)
                    .filter(f -> f.getBirthDate().plusYears(20).compareTo(LocalDate.now())<0)
                    .collect(Collectors.toMap(ForumUser::getUniqueId, ForumUser::toString));


            System.out.println("# elements: " + theResultMapOfUsers.size());
            theResultMapOfUsers.entrySet().stream()
                    .map(entry -> entry.getKey() + ": " + entry.getValue())
                    .forEach(System.out::println);
        }
}
