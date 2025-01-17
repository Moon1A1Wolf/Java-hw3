import java.util.ArrayList;
import java.util.List;

public class FriendsDemo {
    public static void main(String[] args) {
        List<Human> friends = new ArrayList<>();

        // Додаємо друзів
        friends.add(new Builder("Олександр", 35, 2, "Кам'яна кладка"));
        friends.add(new Sailor("Микола", 40, 3, "Аврора"));
        friends.add(new Pilot("Антон", 32, 1, "Boeing 747"));

        // Виводимо інформацію про всіх друзів
        System.out.println("Друзі:");
        for (Human friend : friends) {
            friend.display();
            System.out.println();
        }

        // Підраховуємо загальну кількість дітей
        int totalChildren = friends.stream().mapToInt(Human::getChildrenCount).sum();
        System.out.println("Загальна кількість дітей усіх друзів: " + totalChildren);
    }
}