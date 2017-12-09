package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean (name = "toDoList")
    public Board getToDoList(){
        return new Board();
    }

    @Bean (name = "inProgressList")
    public Board getInProgressList(){
        return new Board();
    }

    @Bean (name="doneList")
    public Board getDoneList(){
        return new Board();
    }
}
