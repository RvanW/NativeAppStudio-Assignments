class Person {

   // Properties of the class...
   private String name;
   private int    age;
   private String gender;

    
   // Constructor of the class...
   public Person(String aName, int anAge, String aGender) {
      name = aName;
      age  = anAge;
      gender = aGender;
   }

   // Methods of the class...
   public void talk() {
      System.out.println("Hi, my name's " + name);
      System.out.println("I'm a " + age + " year old " + gender);
      commentAboutAge();
      System.out.println();
   }
   public void commentAboutAge() {
      if (age < 5) {
         System.out.println("baby");
      }
      if (age == 5) {
         System.out.println("time to start school");
      }
      if (age > 60) {
         System.out.println("old person");
      }
   }

   // Adds an age to a person
   public void growOlder() {
      age += 1;
   }
   // Adds X ages to a person
   public void growOlderBy(int years) {
      age += years;
   }

   // Adds the title 'Sir' to a name
   public void giveKnighthood() {
      name = "Sir " + name;
   }
}

class PersonTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {

      // This gives an error since the person has no properties set..
      // Person ls = new Person();
      // Person wp = new Person();

      Person ls = new Person("Luke Skywalker",34,"male");
      Person wp = new Person("Winston Peters", 48, "male");

      ls.growOlderBy(10);
      ls.talk();
      System.out.println("Luke Skywalker's age is " + ls.age);

      wp.giveKnighthood();
      wp.growOlder();
      wp.talk();


   }

}

