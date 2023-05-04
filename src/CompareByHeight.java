import java.util.Comparator;

public class CompareByHeight implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
