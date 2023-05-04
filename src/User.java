
public class User implements Comparable<User> {

    private String name;
    private int age;
    private int height;
    private int weight;

    public User(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", height=").append(height);
        sb.append(", weight=").append(weight);
        sb.append(", hashCode=").append(Integer.toHexString(hashCode()));
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public int compareTo(User u) {
        if (height - u.height == 0) {
            if (weight - u.weight == 0) {
                if (name.compareTo(u.name) == 0) {
                    if (age - u.age == 0){
                       return hashCode() - u.hashCode();
                    }
                    else return age - u.age;
                }
                else return name.compareTo(u.name);
            }
            else return weight - u.weight;
        }
        else return height - u.height;
    }

}
