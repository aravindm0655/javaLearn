public class ex4 {
    /* operators 
    binary:-      +,-,*,/,% they need two values to operate 
    uniry:-       they need single value to operate "++,--" two types pre post 
    relational:-  they find the relation between two variables >,<,>=,<=,==,!= 
    Logical:-     they operates with the logical gate "  AND->'&&', OR->'||', NOT->'!' "
    */ 
public static void main(String[] args) {
    int a=10,b=20,c,d,e,h,i,j,k,l;
   c=a+b;
   d=a-b;
   e=a*b;
   float fa=a;
   float fb=b;
   float f=fa/fb;
   float g= fa%fb;
   System.out.println(c);//gives the sum 
   System.out.println(d);// gives the subracted value 
   System.out.println(e);// gives the multiplied value 
   System.out.println(f);// gives the quocent 
   System.out.println(g);// gives the remainder 
   System.out.println("\n\n\n");
   h=++a;
   i=a++;
   j=--a;
   k=a--;
   System.out.println(h);
   System.out.println(i);
   System.out.println(j);
   System.out.println(k);
   System.out.println("\n\n\n");
   


}
}
