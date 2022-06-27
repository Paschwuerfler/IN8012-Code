package Tutorium5.singlylinkedlist.src.main.java;

public interface List<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    void add(E e);
    E get(int i);
    boolean delete(E e);
}
