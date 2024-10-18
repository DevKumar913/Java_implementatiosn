package javaTestTest;

//
//final class ImmutableClass {
//    private final int id;  // Immutable instance field
//    private final String name;  // Immutable instance field
//
//    // Static member
//    private static String company = "Tech Solutions";
//
//    public ImmutableClass(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    // Getter methods to access the immutable fields
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    // Static method to access the static field
//    public static String getCompany() {
//        return company;
//    }
//
//    // Static method to change the static field (not bound to immutability rules)
//    public static void setCompany(String newCompany) {
//        company = newCompany;
//    }
//
//    @Override
//    public String toString() {
//        return "ImmutableClass [id=" + id + ", name=" + name + "]";
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
////        ImmutableClass obj = new ImmutableClass(1, "Harish");
////
////        // Accessing immutable fields
////        System.out.println(obj.getId());
////        System.out.println(obj.getName());
////
////        // Accessing static field
////        System.out.println(ImmutableClass.getCompany());
////
////        // Changing static field (allowed because it's static)
////        ImmutableClass.setCompany("NewTech");
////        System.out.println(ImmutableClass.getCompany());
//        
//        
//        Integer i10_1 = 10;
//        Integer i10_2=10;
//        
//        Integer i_big_1=109876;
//        Integer i_big_2=109876;
//        
//        
//        System.out.println(i10_1==i10_2);
//        System.out.println(i10_1.equals(i10_2));
//        
//        System.out.println(i_big_1==i_big_2);
//        System.out.println(i_big_1.equals(i_big_2));
//        
//        String one="Harish";
//        String two="Harish";
//        
//        System.out.println();
//        System.out.println(one==two);
//        System.out.println(one.equals(two));
//        
//        String three="Akshitha";
//        String four=new String("Akshitha");
//        
//        String five=four;
//        
//        
//        System.out.println();
//        System.out.println(three==four);
//        System.out.println(three.equals(four));
//        
//        System.out.println();
//        System.out.println(five==four);
//        System.out.println(five.equals(four));
//        
//        
//        
//        
//    }
//}


import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        String[] arr = new String[] {"if", "it" ,"is", "to", "be", "it", "is", "up", "to", "me", "to", "delegate"};
        // Initialize frequency table from command line
        for (String a : arr) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}