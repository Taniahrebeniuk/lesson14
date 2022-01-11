package Arraylist_Exercises;
import java.util.*;

public class ArrayList_Exercises {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Blue");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Grey");
        System.out.println(list_Strings);

    }
}

class Exercise2 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        for (String element : list_Strings) {
            System.out.println(element);
        }
    }
}

 class Exercise3 {
    public static void main(String[] args) {
        // Creae a list and add some colors to the list
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        // Print the list
        System.out.println(list_Strings);
        // Now insert a color at the first and last position of the list
        list_Strings.add(0, "Pink");
        list_Strings.add(Integer.parseInt(""), "Yellow");
        // Print the list
        System.out.println(list_Strings);
    }
}

class Exercise4 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Pink");
        list_Strings.add("Red");
        list_Strings.add("Black");
        list_Strings.add("White");
        list_Strings.add("Grey");

        System.out.println(list_Strings);

        String element = list_Strings.get(0);
        System.out.println("First element: " + element);
        element  = list_Strings.get(2);
        System.out.println("Third element " + element);
    }
}

class Exercise5 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        System.out.println(list_Strings);
        list_Strings.set(2, "Pink");
        System.out.println(list_Strings);
    }
}

class Exercise6 {
    public static void main(String[] args) {
       List<String> list_Strings = new ArrayList<String>();
       list_Strings.add("Red");
       list_Strings.add("Green");
       list_Strings.add("Orange");
       list_Strings.add("White");

       System.out.println(list_Strings);
       list_Strings.remove(2);
       System.out.println("After removing third element from the list:\n" + list_Strings);

    }
}

class Exercise7 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        if (list_Strings.contains("Red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }
    }
}

class Exercise8 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before sort: "+list_Strings);
        Collections.sort(list_Strings);
        System.out.println("List after sort: "+list_Strings);
    }
}

class Exercise9 {
    public static void main(String[] args) {
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        System.out.println("List1: " + List1);
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");
        System.out.println("List2: " + List2);

        Collections.copy(List1, List2);
        System.out.println("Copy List to List2, After copy:");
        System.out.println("List1: " + List1);
        System.out.println("List2: " + List2);
    }

}

class Exercise10 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before shuffling:" + list_Strings);
        Collections.shuffle(list_Strings);
        System.out.println("List after shuffling:" + list_Strings);

    }
}

class Exercise11 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before reversing :" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :" + list_Strings);
    }
}

class Exercise12 {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("Original list: " + list_Strings);
        List<String> sub_list = list_Strings.subList(0, 3);
        System.out.println("List of first three elements: " + sub_list);

    }
}

class Exercise13{
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        ArrayList<String> c3 = new ArrayList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}

class Exercise14 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Array list before Swap:");
        for (String a : c1) {
            System.out.println(a);
        }
        //Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(c1, 0, 2);
        System.out.println("Array list after swap:");
        for (String b : c1) {
            System.out.println(b);
        }
    }
}

class Exercise15 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second array: " + c2);

        ArrayList<String> a = new ArrayList<String>();
        a.addAll(c1);
        a.addAll(c2);
        System.out.println("New array: " + a);

    }
}

class Exercise16 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        ArrayList<String> newc1 = (ArrayList<String>) c1.clone();
        System.out.println("Cloned array list: " + newc1);

    }
}

class Exercise17 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements "+ c1);


    }
}

class  Exercise18 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not " +c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements " + c1);
        System.out.println("Checking the above array list is empty on not " +c1.isEmpty());
    }
}

class Exercise19 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        System.out.println("Orignal array list: " +c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
    }
}

class Exercise20 {
    public static void main(String[] args) {
        ArrayList<String> c1 =  new ArrayList<String>(3);
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        System.out.println("Original array list: " + c1);
        //Increase capacity to 6
        c1.ensureCapacity(6);
        c1.add("White");
        c1.add("Pink");
        c1.add("Yellow");
        System.out.println("New array list: " + c1);

    }
}

class Exercise21 {
    public static void main(String[] args) {
      ArrayList<String> color = new ArrayList<String>();

      color.add("Red");
      color.add("Green");

        System.out.println("Original array list: " + color);
        String new_color = "White";
        color.set(1,new_color);

        int num=color.size();
        System.out.println("Replace second element with 'White'.");
        for(int i=0;i<num;i++)
            System.out.println(color.get(i));
    }
}

class Exercise22 {
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<String >();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Print using index of an element: ");
        int no_of_elements = c1.size();
        for (int index = 0; index < no_of_elements; index++)
            System.out.println(c1.get(index));
    }

}