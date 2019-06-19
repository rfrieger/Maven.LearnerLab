package io.zipcoder.interfaces;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class People<E extends  Person>  implements Iterable<E>  {
    List<E> peopleList = new ArrayList<E>();

    public void add(E person) {
        peopleList.add(person);
    }

    public E findById(Long id) {
        for (E p : peopleList) {
            if( p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }


    public Boolean contains(E person) {
        for (E p : peopleList) {
            if((p).equals(person)) {
                return true;
            }
        }
        return false;
    }

    public void remove(E person) {
        peopleList.remove(person);
    }


    public void remove(Long id) {
        peopleList.remove(this.findById(id));
    }

    public void removeAll(){
        peopleList.clear();
    }

    public Integer count() {
        return peopleList.size();
    }

    abstract E[] toArray();

    public Iterator<E> iterator() {
       return peopleList.iterator();
    }


}


