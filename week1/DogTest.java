class Flea {
   
   // Properties of the class...
    String name;
   
   // Constructor of the class...
   public Flea(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a flea called " + name;
   }

}

class Dog {

   // Properties of the class...
    String name;
    int    age;
    Flea   dogsFlea;

   // Constructor of the class...
   public Dog(String aName, int anAge, Flea aFlea) {
         name     = aName;
         age      = anAge;
         dogsFlea = aFlea;
   }
   public String toString() {
      return "I am a dog called " + name +
              " and my age is " + age +
              " and I have a flea called " + dogsFlea.name;
   }
}
class DogOwner {
   // Properties of the class...
    String name;
    int    salary;
    Dog    ownersDog;
   // Constructor of the class...
   public DogOwner(String aName, int aSalary, Dog aDog) {
      name   = aName;
      salary = aSalary;
      ownersDog    = aDog;
   }
   public String toString() {
      return "I am a dog owner called " + name +
              " and my salary is " + salary +
              " and my dog is " + ownersDog.name;
   }
}

class DogTest {

   // The main method is the point of entry into the program...
   public static void main(String[] args) {
      // 2
      Flea p = new Flea("Pop");
      Flea s = new Flea("Squeak");
      Flea z = new Flea("Zip");
      // 3
      Dog r = new Dog("Rex",  3,p);
      Dog j = new Dog("Jimbo",4,s);
      Dog f = new Dog("Fido", 5,z);
      // 4
      System.out.println(r.toString());
      System.out.println(j.toString());
      System.out.println(f.toString());
      // 6
      DogOwner a = new DogOwner("Angus",  10000,r);
      DogOwner b = new DogOwner("Brian",  20000,j);
      DogOwner c = new DogOwner("Charles",30000,f);
      // 7
      System.out.println(a.toString());
      System.out.println(b.toString());
      System.out.println(c.toString());
      // 8
      System.out.println(a.ownersDog.dogsFlea.toString());
   }
}

