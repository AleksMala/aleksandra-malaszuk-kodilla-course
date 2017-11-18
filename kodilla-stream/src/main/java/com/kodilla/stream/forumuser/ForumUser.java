package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String userName;
    private final int uniqueId;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsCount;

    public ForumUser(final String userName, final int uniqueId, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth, final int postsCount) {
        this.userName = userName;
        this.uniqueId = uniqueId;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsCount = postsCount;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public char getSex() {
        return sex;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsCount() {
        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", uniqueId=" + uniqueId +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsCount=" + postsCount +
                '}';
    }
}
