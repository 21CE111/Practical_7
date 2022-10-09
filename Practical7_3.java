/*
    Name : Kansagara Kush;
    ID   : 21CE051
*/
import java.util.*;
class AccountHolder {
    int age;
    double netincome;
    int exp;
    String citizenship;
    AccountHolder(int age, double netincome, int exp, String citizenship) {
        this.age = age;
        this.netincome = netincome;
        this.exp = exp;
        this.citizenship = citizenship;
    }
    public String eligibility() {
        if (age >= 21 && age <= 60 && netincome >= 15000 && exp >=
                1 && citizenship.equals("Indian")) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
} class Practical7_3 {
    public static void main(String[] args) {
        ArrayList<AccountHolder> obj = new
                ArrayList<AccountHolder>();
        int i = 1;
        while (i < 6) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter following details :-");
            System.out.println("Age :");
            int age = sc.nextInt();
            System.out.println("Net monthly Income :");
            double netincome = sc.nextDouble();
            System.out.println("Total work Experience :");
            int exp = sc.nextInt();
            System.out.println("Citizenship :");
            String citizenship = sc.next();
            obj.add(new AccountHolder(age, netincome, exp, citizenship));
            i++;
        }
        System.out.println("--------------------------------------------------");
        for (int j = 1; j < obj.size() + 1; j++) {
            System.out.println("AccHolder " + j + " is " +
                    obj.get(j - 1).eligibility());
        }
    }
}

