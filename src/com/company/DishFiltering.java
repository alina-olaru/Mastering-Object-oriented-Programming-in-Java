package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class DishFiltering {

    public static Stream<DIsh> filterFirst(List<DIsh> dishes){
        return dishes.stream().filter(DIsh::fast)
                .filter(DIsh::isBest)
                .filter(DIsh::ShareDish);

              // .min(Comparator.comparing(dish -> dish.portions>3))
               // .get();

    }
    public static DIsh fastAndCheap(List<DIsh> dishes){
       return dishes.stream().filter(DIsh::fast)
                .min(Comparator.comparing(dish -> dish.price<20))
                .get();
    }
}
