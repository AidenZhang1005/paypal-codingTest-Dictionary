package dictionary;

public class MainTest {

  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();
    dictionary.put("test");
    dictionary.put("dictionary");
    dictionary.put("english");
    dictionary.put("testing");
    System.out.println(dictionary.get("test"));
    System.out.println(dictionary.delete("test"));
    System.out.println(dictionary.get("testing"));
    System.out.println(dictionary.get("test"));
  }
}
