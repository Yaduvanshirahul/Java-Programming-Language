// FINDOUT THE CHARACTER IN A STRING AT SPECIFIC INDEX 

public class class5 {

    public static void printCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String str = " my name is rahul  kumar yadav";

        printCharacter(str);
    }

}
