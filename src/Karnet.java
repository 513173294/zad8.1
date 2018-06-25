

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
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Karnet))
            return false;
        Karnet other = (Karnet) obj;
        if (name != other.name)
            return false;
        if (age != other.age)
            return false;
//        if (name != other.name)
//            return false;
        return true;

    }
    int i = 0;
    @Override
    public String toString() {
        return name +", "+ age +"\n";
    }
}
