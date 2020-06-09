package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person me = new Person("Alina",22,1000000.0);
        Person person = new Person("Florentina",42,1330.0);
        Person director = new Person("Andrei",24,109999000.0);
        Collection<Person> persons = new ArrayList<Person>();
        persons.add(me);
        persons.add(person);
        persons.add(director);

        final Iterator<Person> personIterator = persons.iterator();
        while(personIterator.hasNext()){
            Person currentPerson = personIterator.next();
            System.out.println(person);
        }




    }
}
