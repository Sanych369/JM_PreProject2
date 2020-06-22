package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Lol", "Lolych", (byte) 30);
        userService.saveUser("Lal", "Lalych", (byte) 27);
        userService.saveUser("Рак", "Раковальский", (byte) 18);
        userService.saveUser("Crabby", "Crab", (byte) 5);

        userService.getAllUsers();
        userService.dropUsersTable();
    }
}
