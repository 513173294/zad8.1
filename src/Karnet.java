import java.util.Objects;

public class Karnet {
    String name;
    int age;

    public Karnet(String name, int months) {
        this.name = name;
        this.age = months;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Karnet karnet = (Karnet) o;
        return age == karnet.age &&
                Objects.equals(name, karnet.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Karnet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
