package com.kodilla.good.patterns.challengetwo;

public class OrderInformation implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println(user.toString());
    }
}
