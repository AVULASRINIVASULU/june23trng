import java.util.Scanner; 

class Vowels2 {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String word = inp.nextLine();
    //write your code below
    for(int whatsat = 0; whatsat < word.length(); whatsat++){
      if (word.charAt(whatsat).equals("a")){  //how to declare mutiple letters?
        System.out.print(word.charAt(whatsat));
      }

  }
}
}