package homework;

public class User{
    private final String name;

    public User(String name){
        // Инициализируем имя пользователя
        this.name = name;
    }

    public String getName(){
        // Возвращаем имя пользователя
        return name;
    }

    public void report(){
        // Выводим отчет о пользователе
        System.out.println("Report for user: " + name);
    }
}
