// Add Classes

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * The SimplePersonQueue class have some methods for creating a queue and
 * Do some simple work with that
 * *
 *
 * @author Erfan
 * @version 1
 * @since 3/18/2018
 */
public class SimplePersonQueue extends PersonQueue {


    //WRITE YOUR OWN IMPLEMENTATION --> Any fields?! HOW ABOUT AN "ARRAYLIST"?

    // Fields //

    // An Array List from Person objects with the people name
    private ArrayList<Person> people = new ArrayList<Person>();

    /**
     * TODO
     * Returns the number of elements in this collection.  If this collection
     * contains more than {@code Integer.MAX_VALUE} elements, returns
     * {@code Integer.MAX_VALUE}.
     *
     * @return the number of elements in this collection
     */
    @Override
    public int size() {
        //WRITE YOUR OWN IMPLEMENTATION
        return people.size();
    }

    /**
     * TODO
     * Returns {@code true} if this collection contains no elements.
     *
     * @return {@code true} if this collection contains no elements
     */
    @Override
    public boolean isEmpty() {
        //WRITE YOUR OWN IMPLEMENTATION
        return people.isEmpty();
    }

    /**
     * TODO
     * Retrieves, but does not remove, the head of this queue.  This method
     * differs from {@link #peek peek} only in that it throws an exception
     * if this queue is empty.
     *
     * @return the head of this queue
     */
    @Override
    public Person element() {
        //WRITE YOUR OWN IMPLEMENTATION
        return people.get(0);
    }

    /**
     * TODO
     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    @Override
    public Person peek() {
        //WRITE YOUR OWN IMPLEMENTATION
        if (isEmpty()) {
            return null;
        } else {
            return people.get(0);
        }
    }

    /**
     * TODO
     * Returns {@code true} if this collection contains the specified element.
     * More formally, returns {@code true} if and only if this collection
     * contains at least one element {@code e} such that
     * {@code Objects.equals(o, e)}.
     *
     * @param o element whose presence in this collection is to be tested
     * @return {@code true} if this collection contains the specified
     * element
     */
    @Override
    public boolean contains(Object o) {
        Person p = (Person) o;
        //WRITE YOUR OWN IMPLEMENTATION
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).equals(p)) {
                return true;
            }
        }
        return false;
    }

    /**
     * TODO
     * Inserts the specified element into this queue if it is possible to do so
     * immediately without violating capacity restrictions, returning
     * {@code true} upon success and throwing an {@code IllegalStateException}
     * if no space is currently available.
     *
     * @param person the element to add
     * @return {@code true} (as specified by {@link Collection#add})
     */
    @Override
    public boolean add(Person person) {
        //WRITE YOUR OWN IMPLEMENTATION
        return people.add(person);
    }

    /**
     * TODO
     * Removes a single instance of the specified element from this
     * collection, if it is present (optional operation).  More formally,
     * removes an element {@code e} such that
     * {@code Objects.equals(o, e)}, if
     * this collection contains one or more such elements.  Returns
     * {@code true} if this collection contained the specified element (or
     * equivalently, if this collection changed as a result of the call).
     *
     * @param o element to be removed from this collection, if present
     * @return {@code true} if an element was removed as a result of this call
     */
    @Override
    public boolean remove(Object o) {
        Person p = (Person) o;
        //WRITE YOUR OWN IMPLEMENTATION
        Iterator<Person> it = people.iterator();
        while (it.hasNext()) {
            if (it.next().equals(p)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * TODO
     * Retrieves and removes the head of this queue.  This method differs
     * from {@link #poll poll} only in that it throws an exception if this
     * queue is empty.
     *
     * @return the head of this queue
     */
    @Override
    public Person remove() {
        Person p;
        //WRITE YOUR OWN IMPLEMENTATION
        Iterator<Person> it = people.iterator();
        p = it.next();
        it.remove();
        return p;
    }

    /**
     * TODO
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    @Override
    public Person poll() {
        Person p;
        //WRITE YOUR OWN IMPLEMENTATION
        if (people.isEmpty()) {
            return null;
        } else {
            Iterator<Person> it = people.iterator();
            p = it.next();
            it.remove();
            return p;
        }
    }

    /**
     * TODO
     * Removes all of the elements from this collection (optional operation).
     * The collection will be empty after this method returns.
     */
    @Override
    public void clear() {
        //WRITE YOUR OWN IMPLEMENTATION
        for (int i = people.size() - 1; i >= 0; i--) {
            remove();
        }
    }

}
