package second;

public class FoundTheNumber {

  public static void main(String[] args){
    String str = "Найди";
    char letter = 'Н';
    System.out.println(findNumber(str, letter));
  }

  private static int findNumber(String str, char letter){
    int counter = str.indexOf(letter);
    if (counter == -1) {
      return counter;
    }
    else return counter + 1;
  }
}


