package LinkedList_Exercises;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.*;

class Exercise1 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();

        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        l_list.add("Yellow");

        System.out.println("The linked list: " + l_list);
    }
}

class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");

        for (String element : l_list) {
            System.out.println(element);
        }
    }
}

class Exercise3 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");

        Iterator p = l_list.listIterator(1);
        while (p.hasNext()) {
            System.out.println(p.next());
        }
    }
}

class Exercise4 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("Original linked list:" + l_list);
        Iterator it = l_list.descendingIterator();

        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}

class Exercise5 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("original linked list: ");
        System.out.println("let add the Yellow color after Red Color: " + l_list);
        l_list.add(1, "Yellow");
        System.out.println("The linked list: " + l_list);
    }
}

class Exercise6 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" +  l_list);
        l_list.addFirst("White");
        l_list.addLast("Pink");
        System.out.println("Final linked list: " + l_list);

    }
}

class Exercise7 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list:" + l_list);
        l_list.offerFirst("Pink");
        System.out.println("Final linked list: " + l_list);

    }
}

class Exercise8 {
    public static void main(String[] args) {
        LinkedList<String> l_list =  new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        System.out.println("Original linked list" + l_list);
        l_list.offerLast("Pink");
        System.out.println("Final linked list:" +  l_list);
    }
}

class Exercise9 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");

        System.out.println("Original linked list:" + l_list);

        LinkedList<String> new_l_list = new LinkedList<String>();
        new_l_list.add("White");
        new_l_list.add("Pink");

        l_list.addAll(1, new_l_list);
        System.out.println("LinkedList: " + l_list);

    }
}

class Exercise10 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        System.out.println("Original linked list:" + l_list);
        Object first_element = l_list.getFirst();
        System.out.println("First Element is: "+first_element);

        Object last_element = l_list.getLast();
        System.out.println("Last Element is: "+last_element);
    }
}

class Exercise11 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        System.out.println("Original linked list:" + l_list);
        for (int p = 0; p < l_list.size(); p++) {
            System.out.println("Element at index " + p + ": " + l_list.get(p));
        }
    }
}
class Exercise12 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        System.out.println("The Original linked list:" + l_list);
        l_list.remove(2);
        System.out.println("The New linked list: " + l_list);

    }
}

class Exercise13 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        System.out.println("The Original linked list: " + l_list);

        Object firstElement = l_list.removeFirst();
        System.out.println("Element removed: " + firstElement);

        Object lastElement = l_list.removeLast();
        System.out.println("Element removed: " + lastElement);
        System.out.println("The New linked list: " + l_list);

    }
}

class Exercise14 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        System.out.println("The Original linked list: " + l_list);
        l_list.clear();
        System.out.println("The new linked list: " + l_list);
    }
}

class Exercise15 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        System.out.println("The Original linked list: " + l_list);
        Collections.swap(l_list,0,2);
        System.out.println("The new linked list after swap: " + l_list);

    }
}

class Exercise16 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");

        System.out.println("Linked list before shuffling: " + l_list);
        Collections.shuffle(l_list);
        System.out.println("Linked list afrer shuffling: " + l_list);

    }
}

class Exercise17 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("List of first linked list: " + c1);
        LinkedList<String> c2 = new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second linked list: " + c2);

        LinkedList<String> a = new LinkedList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New linked list: " + a);
    }
}

class Exercise18 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        LinkedList<String> newc1 = new LinkedList<String>();
        newc1 = (LinkedList)c1.clone();
        System.out.println("Cloned linked list: " + newc1);
    }
}

class Exercise19 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        System.out.println("Removed element: " + c1.pop());
        System.out.println("Linked list after pop operation: " + c1);

    }
}

class Exercise20 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        String x = c1.peekFirst();
        System.out.println("First element in the list " + x);
        System.out.println("Original linked list: " + c1);

    }
}

class Exercise21 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        String x = c1.peekLast();
        System.out.println("Lost element in the list: " + x);
        System.out.println("Original linked list: " + c1);
    }
}

class Exercise22 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        if(c1.contains("Green")) {
            System.out.println("Color green is present in the linked list");
        } else {
            System.out.println("Color Green is not present in the linked list");
        }
    }
}

class Exercise23 {
    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<String>();
        linked_list.add("Red");
        linked_list.add("Green");
        linked_list.add("Black");
        linked_list.add("White");
        linked_list.add("Pink");
        System.out.println("Original linked list: " + linked_list);

        List<String> list = new ArrayList<String>(linked_list);

        for(String str:list) {
            System.out.println(str);
        }
    }
}

class Exercise24 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2 = new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "yes" : "no");
        System.out.println(c3);

    }
}

class Exercise25 {
    public static void main(String[] args) {
        LinkedList<String> c1 = new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original linked list: " + c1);
        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Linked list after remove all elements "+c1);
        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());

    }
 }

 class Exercise26 {
     public static void main(String[] args) {
         LinkedList<String> c1 = new LinkedList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         System.out.println("Original linked list: " + c1);
         c1.set(1, "Orange");
         System.out.println("the value of second element changed");
         System.out.println("New linked list: " + c1);

     }
 }