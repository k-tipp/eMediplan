package CHMED16A.builder;

/**
 * Created by kevin on 15.03.17.
 */
public class GenericClass<T> {

    private final Class<T> type;

    public GenericClass(Class<T> type) {
        this.type = type;
    }

    public Class<T> getMyType() {
        return this.type;
    }
}
