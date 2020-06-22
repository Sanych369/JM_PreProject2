package jm.task.core.jdbc;

//import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
//        реализуйте алгоритм здесь
//        UserServiceImpl userService = new UserServiceImpl();
        UserServiceImpl userService = UserServiceImpl.getInstance();
        userService.createUsersTable();
        userService.saveUser("Lol", "Lolych", (byte) 30);
        userService.saveUser("Lal", "Lalych", (byte) 27);
        userService.saveUser("Рак", "Раковальский", (byte) 18);
        userService.saveUser("Crabby", "Crab", (byte) 5);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
