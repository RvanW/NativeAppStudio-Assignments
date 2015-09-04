class Human {

   // Properties of the class...
   String name;

   // Constructor of the class...
   public Human(String aName) {
      name = aName;
   }

   // Methods of the class...
   public String toString() {
      return "I am a human and my name is " + name;
   }
}

class ArrayTest2 {

   public static void main(String[] args) {
      ArrayTest2 x = new ArrayTest2();
      x.doStuff();
   }

   public void printArray(Human[] x) {
      for (int i=0; i<x.length; i++) {
         System.out.println(x[i]);
      }
   }

   public void doStuff() {
      // insert your code here:
      Human[] threesome = new Human[3];
      threesome[0] = new Human("Angus");
      threesome[1] = new Human("Brian");
      threesome[2] = new Human("Charles");

      for (int i=0; i<2; i++) {
         System.out.println(threesome[i]);
      }
      ArrayPrint.printArray(threesome);
   }
}
