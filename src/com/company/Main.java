package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Main {

    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) {
	// write your code here
        List<DIsh> dIshes = new ArrayList<>();
        DIsh D1 = new DIsh(30.0,"Salata Caesar",65.5,4.7,1);
        DIsh D2 = new DIsh(10.0,"omleta",15.5,4.7,2);
        DIsh D3 = new DIsh(10.0,"bruschete",5.5,4.7,2);
        dIshes.add(D1);
        dIshes.add(D2);
        dIshes.add(D3);
        System.out.println(DishFiltering.fastAndCheap(dIshes));
        System.out.println(dIshes);

        System.out.println(DishFiltering.filterFirst(dIshes));
        System.out.println(dIshes);

        AtomicInteger n = new AtomicInteger(0);
        Stream<Integer> myStream = Stream.generate(() -> n.incrementAndGet())
                .limit(100)
                 .filter(x -> x>50);
     //   myStream.forEach(e -> System.out.println(e));
   //     myStream.filter(x -> x>50);
           myStream.forEach(e -> System.out.println(e));


    }
}
//    Double waitingTime;
//    String name;
//    Double price;
//    Double rating;
//    Integer portions;