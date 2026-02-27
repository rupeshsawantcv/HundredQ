package forLearning;

public class Entity implements Comparable<Entity> {

    private String name;
    private int age;
    private String add;

    public Entity(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }

    @Override
    public int compareTo(Entity o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Entity [name=" + name + ", age=" + age + ", add=" + add + "]";
    }
}
