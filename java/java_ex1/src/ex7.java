    /*
    oops 
    Clases & Objects 
    Methods 

     */
class Math{                         //class 
    public void add(int a,int b){  //method 
        int c=a+b;
        System.out.println(c);
    }
    public void sub(int a, int b){
        int d=a-b;
        System.out.println(d);
    }
    public void multi(int a, int b){
        int e=a*b;
        System.out.println(e);
    }

}
class Main1{
    public static void main(String[] args) {
        Math a=new Math();         //object creation
        a.add(10,12);          //calling the methods with the  object
        a.sub(12,10);
        a.multi(20,10);
    }   
}

