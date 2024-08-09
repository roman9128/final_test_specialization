package model.animals;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator implements Iterator<Animal> {

    private int i;
    private List<Animal> animalList;

    public AnimalIterator(List<Animal> animalList) {
            this.animalList = animalList;
        }

    @Override
    public boolean hasNext() {
        return animalList.size() > i;
    }

    @Override
    public Animal next() {
        return animalList.get(i++);
    }
}