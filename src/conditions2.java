import java.util.Scanner;

public class conditions2 {
    public static void main(String[] args) {
        Scanner cha = new Scanner(System.in);
        System.out.println("enter any letter");
        String input= cha.next().toLowerCase();
        boolean uppercase = input.charAt(0)>=65 && input.charAt(0)>=90;
        boolean loWercase = input.charAt(0)>=97 && input.charAt(0)>=122;
        boolean vowels = input.equals("a")||input.equals("e")||input.equals("i")||input.equals("o")||input.equals("u");
        if (input.length()>1){
            System.out.println("plz enter single letter.");

        }
        else if (!(uppercase||loWercase)){
            System.out.println("is not a letter");
        } else if (vowels) {
            System.out.println(" is a vowel");
        }
        else {
            System.out.println(" is a consonant");
        }


    }
}
