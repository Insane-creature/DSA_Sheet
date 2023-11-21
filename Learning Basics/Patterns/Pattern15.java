import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = 5;
    for(int i=n;i>0;i--){
        for(char a='A';a<'A'+i;a++){
            System.out.print(a);
        }
        System.out.println();
    }
}
}
