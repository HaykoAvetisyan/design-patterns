package solid.open_closed;

public interface Specification <T>{

    boolean isSatisfied(T item);
}
