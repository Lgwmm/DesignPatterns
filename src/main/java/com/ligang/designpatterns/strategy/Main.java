package com.ligang.designpatterns.strategy;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a={9,8,6,4,5,7,2,1};
        Sorter<Cat> catSorter = new Sorter<>();
        Cat[] cats={new Cat(1,1),new Cat(5,5),new Cat(3,3)};
//        sorter.sort(a);
        CatWeightComparator catWeightComparator = new CatWeightComparator();
        CatHeightComparator heightComparator  = new CatHeightComparator();
        /**
         * 策略模式 可扩展性更高，只要实现Comparator接口，重新册罗方法，就可按照不同策略完成不同的业务
         */
//        catSorter.sort(cats, catWeightComparator);
        catSorter.sort(cats, heightComparator);
        System.out.println(Arrays.toString(cats));
    }

}
