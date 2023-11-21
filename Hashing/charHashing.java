public class charHashing {
    public static void main(String[] args){
        String s = "anshika";
        // pre compute
        int[] hash = new int[256];
        for(int i = 0; i < s.length();i++){
            hash[s.charAt(i)] +=1;

        }

        int q = 5;
        // Scanner sc = new Scanner(System.in);
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        // String ch = {'a','g','h','b','e'}        //sc.nextLine();
        for(int j = 0; j<q;j++){
            System.out.println(hash[ch[j]-'a']);
        }

    }
}



