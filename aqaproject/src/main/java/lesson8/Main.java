package lesson8;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory pD1 = new PhoneDirectory();
        pD1.add("Shevchenko", "0944274491");
        pD1.add("Shevchenko", "0772103284");
        System.out.println(pD1.get("Shevchenko"));
        pD1.add("Hrymaliuk", "038826449");
        System.out.println(pD1.get("Hrymaliuk"));
    }
}
