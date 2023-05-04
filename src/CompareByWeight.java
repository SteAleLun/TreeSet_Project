import java.util.Comparator;

public class CompareByWeight implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getWeight() - o2.getWeight();
    }
}
