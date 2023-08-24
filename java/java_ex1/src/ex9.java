


class Appform{
   String name;
   int rollno;
   int age;

   public void display(){
      System.out.println("\n");
      System.out.println(name);
      System.out.println(rollno);
      System.out.println(age);
      System.out.println("\n");
   }
   public static void main(String[] args) {
      Appform arvi = new Appform();
      arvi.name="aravind";
      arvi.rollno=1;
      arvi.age=21;
      arvi.display();
      Appform aravind = new Appform();
      aravind.name="aravindm";
      aravind.rollno=2;
      aravind.age=21;
      aravind.display();
   }
}

