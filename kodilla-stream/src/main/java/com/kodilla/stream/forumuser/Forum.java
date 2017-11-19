package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> user = new ArrayList<>();

    public Forum() {
        user.add(new ForumUser("Iwona",1,'F',1993, 12, 23,12));
        user.add(new ForumUser("Zbyszek",2,'M',1980, 9, 1,12));
        user.add(new ForumUser("Alicja",3,'F',1983, 3, 3,1));
        user.add(new ForumUser("Jacek",4,'M',1967,7,27,0));
        user.add(new ForumUser("Karolina",5,'F',1998, 6, 18,29));
        user.add(new ForumUser("Michał",6,'M',1973,1,1, 12));
        user.add(new ForumUser("Maciek",7,'M',1999,5,30,16));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(user);
    }
}
