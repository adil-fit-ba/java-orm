package helper;

public class FK<T extends IEntity>
{
    private T value;
    private int id;

    public void set(T value) {
        this.value = value;
    }

    public void set(int id) {
        this.id = id;
    }
}
