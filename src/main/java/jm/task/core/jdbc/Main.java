package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Катя", "Пак", (byte) 19);
        userService.saveUser("Саша", "Иванов", (byte) 13);
        userService.saveUser("Алина", "Блинова", (byte) 17);
        userService.saveUser("Артем", "Тюльпанов", (byte) 19);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
