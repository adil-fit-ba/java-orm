package helper;

import model.Opstina;

public class FKNull<T extends IEntity>
{
    private T value;
    private Integer id;
    private boolean lazyLoading;

    public FKNull(boolean lazyLoading) {
        this.lazyLoading = lazyLoading;
    }

    public void set(T value) {
        this.value = value;
        if (value == null) {
            id = null;
        } else {
            id = value.getId();
        }
    }

    public void set(Integer id) {
        this.id = id;
        if (id == null)
        {
            value = null;
        }
        else
        {
            //select * from T t where t.Id = id
        }
    }

    public Integer getId() {
        return id;
    }


    public T getValue() {
        return value;
    }
}
