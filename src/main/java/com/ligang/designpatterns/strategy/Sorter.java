package com.ligang.designpatterns.strategy;

public class Sorter<T> {

/*    public static void sort(Comparable[] args) {
        for (int i = 0; i < args.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < args.length; j++) {
                minPos=args[j].compareTo(args[minPos])==-1?j:minPos;
            }
            swap(args,i,minPos);
        }
    }*/

    public  void sort(T[] args,Comparator<T> comparator) {
        for (int i = 0; i < args.length-1; i++) {
            int minPos=i;
            for (int j = i+1; j < args.length; j++) {
                minPos=comparator.compare(args[j],args[minPos])==-1?j:minPos;
            }
            swap(args,i,minPos);
        }
    }

    void swap(T[] args, int i, int j) {

        T temp = args[i];
        args[i]=args[j];
        args[j]=temp;

    }

}
