import java.util.Scanner;

public class Data_Type {
    public static int dataTypes(String type) {
        // Write your code here
        if(type.equals("Integer")|| type.equals("Float"))

        return 4;

        else if (type.equals("Long")|| type.equals("Double"))

        return 8;

        else if(type.equals("Character"))

        return 1;

        else

        return-1;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(dataTypes(input));


    }

    
}

