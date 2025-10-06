package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        DoubleLinked dll=new DoubleLinked();

        dll.insertValue(9,0);
        dll.insertValue(10,1);
        dll.insertValue(11,2);
        dll.insertValue(12,3);
        dll.insertValue(13,4);
        System.out.println(dll.tail.value);
        System.out.println(dll.head.value);
    dll.traverse();
//        dll.reverse();
//        dll.searchValue(7);
//        dll.deleteValue(1);
//        dll.traverse();
//        dll.deleteDLL();
//        dll.traverse();
    }
}