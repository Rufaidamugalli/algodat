
public class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }


    public T getFirst() {
        return first;

    }

    public T getSecond() {

        return second;
    }

    public void setFirst(T dt) {
        this.first = dt;
    }

    public void setSecond(T dt) {
        this.second = dt;
    }

    public void swap() {
        T x = this.first;
        this.first = this.second;
        this.second = x;

    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

