

public class Karnet {
    String name;
    int months;

    public Karnet(String name, int months) {
        this.name = name;
        this.months = months;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
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
        if (name != other.name)
            return false;
        if (months != other.months)
            return false;
        return true;

    }
    int i = 0;
    @Override
    public String toString() {
        return name +", "+months;
    }
}
