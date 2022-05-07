package genericity;

import java.util.ArrayList;

public class MyArrayList <E>{
    private ArrayList list = new ArrayList();
    public void add(E e){
        list.add(e);
    }

    public void remove(E e){
        list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
