package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
  public static void main(String[] args) {
    //
    Obj obj1 = new Obj("AB", false);
    Obj obj2 = new Obj("CD", false);
    Obj obj3 = new Obj("EF", false);
    Obj obj4 = new Obj("GH", false);
    Obj obj5 = new Obj("IJ", false);
    Obj obj6 = new Obj("KL", true);

    List<Obj> list1 = new ArrayList<>();
    list1.add(obj1);
    list1.add(obj2);
    list1.add(obj3);

    List<Obj> list2 = new ArrayList<>();
    list2.add(obj4);
    list2.add(obj5);
    list2.add(obj6);

    List<Obj> list3 = new ArrayList<>();

    list3.addAll(list1);
    list3.addAll(list2);
    list3.forEach(obj -> System.out.println(obj.name));
    boolean res = list3.stream().noneMatch(obj -> obj.active);
    System.out.println("RES: " + res);
  }
}
