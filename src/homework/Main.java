package homework;

public class Main{
    public static void main(String[] args){
        // Создаем пользователя
        User user = new User("Bob");
        // Выводим отчет о пользователе
        user.report();
        // Создаем экземпляр Persister с передачей пользователя и сохраняем данные через Persister
        Persister persister = new Persister(user);
        persister.save();
    }
}
