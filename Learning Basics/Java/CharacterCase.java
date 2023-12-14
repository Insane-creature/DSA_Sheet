import java.util.*;
class Simple{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        int result = x>=97 && x<=122?0:x>=65 && x<=90 ? 1 : -1 ;
        System.out.println(result);

        // A-Z : 65-90
        // a-z : 97-122

    }

}