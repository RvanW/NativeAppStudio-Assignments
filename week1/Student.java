/* Need to import java.io package to use the BufferedReader and
InputStreamReader.
*/
import java.io.*;
class InvalidAgeException extends Exception {
  public InvalidAgeException () {
    super();
  }
  public InvalidAgeException (String m) {
    super(m);
  }
}
public class Student {
  private static BufferedReader stdIn =
          new BufferedReader(new InputStreamReader(System.in));
  private String name;
  private int age;
  public Student () {
    name = "";
    age = 0;
  }
  public void readName () throws IOException {
    System.out.print("Input your name: ");
    name = stdIn.readLine();
  }
  public void printName () {
    System.out.println("Name: " + name);
  }
  public void readAge () {
    boolean ok = false;
    while (!ok) {
      System.out.print("Input your age: ");
      1
      try {
        age = Integer.parseInt(stdIn.readLine());
        if (!(ok = ((age >= 0) && (age <=150))))
          System.out.println("Try again! (range 0 to 150.)");
      }
      catch (IOException e) {
        System.out.println("Something BAD happened!");
        System.exit(0);
      }
      catch (NumberFormatException e) {
        age = -1;
        System.out.println("Try again!");
      }
    }
  }
  public void printAge () {
    System.out.println("Age: " + age);
  }
  public static void main (String[] args) throws IOException {
    Student me = new Student();
    me.readName();
    me.readAge();
    me.printName();
    me.printAge();
  }
}