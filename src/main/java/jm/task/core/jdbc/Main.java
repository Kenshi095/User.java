package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        // Создание таблицы
        userService.createUsersTable();

        // Добавление 4 пользователей
        userService.saveUser("Иван", "Иванов", (byte) 25);
        userService.saveUser("Петр", "Петров", (byte) 30);
        userService.saveUser("Сергей", "Сергеев", (byte) 35);
        userService.saveUser("Алексей", "Алексеев", (byte) 40);

        // Получение всех пользователей и вывод в консоль
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        // Очистка таблицы
        userService.cleanUsersTable();

        // Удаление таблицы
        userService.dropUsersTable();
    }
}