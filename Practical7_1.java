/*
    Name : Rushit Rabadiya
    ID   : 21CE111
*/
import java.util.*;
class Stud implements Comparable<Stud>
{
    String Name;
    int age;
    int javaMarks;
    Stud() {
        Name = null;
        age = 0;
        javaMarks = 0;
    }
    Stud(String name, int age, int javaMarks) {
        this.Name = name;
        this.age = age;
        this.javaMarks = javaMarks;
    }
    public int compareTo(Stud s) {
        return this.javaMarks - s.javaMarks;
    }
    public String toString() {
        return String.format("[%s, %d]", Name, javaMarks);
    }
}
class Practical7_1 {
    public static void main(String[] args) {
        Stud[] s = new Stud[4];
        s[0] = new Stud("RUSHIT", 18, 35);
        s[1] = new Stud("PARAM", 19, 94);
        s[2] = new Stud("JENIL", 20, 53);
        s[3] = new Stud("DEV", 21, 82);
        System.out.println("--------------------------------------------------");
                System.out.println("Before sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("--------------------------------------------------");
                Arrays.sort(s);
        System.out.println("After sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("--------------------------------------------------");
    }
}
