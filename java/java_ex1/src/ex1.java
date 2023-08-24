public class ex1 {
    public static void main(String[] args) {
        //directly print a string 
        System.out.println("Talentship");
        //can print a addition inside a print dunction 
        int a=10,b=20;
        System.out.println(a+b);

        String c="talent", d="ship";
        System.out.println(c+d); //(concatenation)

        System.out.println(a+b+c+d); //will be done frm left to right 

        System.out.println(c+d+a+b); //when a int concatented with a string it will changes to string 
        
        System.out.println(c+b+(a+b)); //which will add the integer first and combine it to the string 

    }
}
