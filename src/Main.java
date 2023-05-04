import java.util.Objects;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        /////////////////////// проверка Comparator ////////////////////////////////
        TreeSet<User> checkComparator = new TreeSet<>(new CompareByHeight()
                .thenComparing(new CompareByWeight())
                .thenComparing(new CompareByName())
                .thenComparing(new CompareByAge())
                // не понимаю что конкретно значит действие в скобках "Objects::hashCode", но работает
                // моя цель была сравнить объекты по IdentityHashCode
                .thenComparing(Objects::hashCode));

        checkComparator.add(new User("Витя", 29, 180, 75));
        checkComparator.add(new User("BBB", 38, 175, 70));
        checkComparator.add(new User("Катя", 24, 165, 50));
        checkComparator.add(new User("BBB", 38, 175, 70));
        checkComparator.add(new User("Маша", 17, 150, 45));

        System.out.println(checkComparator.toString());
        ////////////////////////////////////////////////////////////////////////////

        System.out.println();

        /////////////////////// проверка Comparable ////////////////////////////////
        TreeSet<User> checkComparable = new TreeSet<>();

        checkComparable.add(new User("Витя", 29, 180, 75));
        checkComparable.add(new User("BBB", 38, 175, 70));
        checkComparable.add(new User("Катя", 24, 165, 50));
        checkComparable.add(new User("BBB", 38, 175, 70));
        checkComparable.add(new User("Маша", 17, 150, 45));

        System.out.println(checkComparable.toString());
        ////////////////////////////////////////////////////////////////////////////
    }
}
