package collections;

import org.bouncycastle.util.Arrays;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionIterate {
    @Test
    public void loop(){

        int [] number = {45,67,78,10,67};
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<number.length;i++){
            ll.add(number[i]);
        }
        System.out.println(ll);
        //Through iterator
        Iterator<Integer> i1 = ll.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
        //Filter
        ArrayList<String> al = new ArrayList<>();
        al.add("Dinesh");
        al.add("Manoj");
        al.stream().filter((s -> s != "Manoj")).forEach(s -> System.out.println(s));
        ll.stream().filter((s -> s != 10)).forEach(s -> System.out.println(s));
        ll.stream().forEach(s -> System.out.println(s));
    }
    @Test
    public void arrayList(){

        /*ArrayList is a dynamic array to store the elements and also it grows
        the size automatically if it reaching its threshold value.
        1.Collecting database records into ArrayList,
        2.Returning List of transactions for Credit Card
        3.Use anywhere no removal and insertions in the middle
        */

        ArrayList<String> al = new ArrayList<>();
        al.add("Dinesh");
        al.add("Manoj");}
    @Test
    public void LinkedList(){
        /*A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.
        The elements in a linked list are linked using pointers
        Image viewer – Previous and next images are linked and can be accessed by the next and previous buttons.
        Previous and next page in a web browser – We can access the previous and next URL searched in a web browser by pressing the back and next buttons since they are linked as a linked list.
        Music Player – Songs in the music player are linked to the previous and next songs. So you can play songs either from starting or ending of the list.
        A Doubly linked list node contains three fields:
       Left   pointer,
       Information and
       Right pointer
        */
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<5;i++){
            ll.add(i);
        }
        ll.add(55);
        System.out.println(ll);
        ll.set(2,5);
        ll.removeLast();
        System.out.println(ll);
        ll.stream().forEach(s -> System.out.println(s));
        ll.get(4);}

    @Test
    public void HashMap(){
        /*Java HashMap is similar to HashTable, but it is unsynchronized. It allows to store the null keys as well,
        but there should be only one null key object and there can be any number of null values. */








    }
}
