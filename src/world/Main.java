package world;

public class Main {

  public static void main(String[] args) {
    for (int i = 'Я'; i >= 'А'; i--) {
      System.out.print(" " +(char) i);
    }
      System.out.print(("\n Я Ю Э Ь Ы Ъ Щ Ш Ч Ц Х Ф У Т С Р П "
                        + "О Н М Л К Й И З Ж Е Д Г В Б А ").toLowerCase());
  }
}

