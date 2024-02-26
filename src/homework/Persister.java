package homework;

public class Persister{
    private final User user;

    public Persister(User user){
        // Передаем пользователя в конструктор Persister
        this.user = user;
    }

    public void save(){
        // Выводим сообщение о сохранении пользователя
        System.out.println("Save user: " + user.getName());
    }
}
