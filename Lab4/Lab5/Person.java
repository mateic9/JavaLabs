

import java.util.HashSet;
import java.util.Set;

/**
 * This is the person record
 * @param id This is the id of the person
 * @param name This is the name of the person
 */
record Person(int id, String name){
    public static Set<Person> allEmploys = new HashSet<Person>();

    /**
     * Here we compare the objects
     * @param o   the reference object with which to compare.
     * @return Here we get the result of the comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this.getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }
}