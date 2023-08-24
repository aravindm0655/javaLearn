public class ex3 {
    public static void main(String[] args) {
/* 
*  data types can be clasified into two 
* 1_) primitive:-  holds  the value 
* 2_) non primitive (reference)  holds the address of the values 
*/
        int a = 10;
        int b = a;
        a = 5;
        System.out.println(a); // Output: 5
        System.out.println(b); // Output: 10

        int[] c={1,2,3,4,5};
        int[] d=c;   
        System.out.println(d[3]); // Output: Point(x=5, y=7)
        c[3]=10;
        System.out.println(c[3]); // Output: Point(x=7, y=7)
        System.out.println(d[3]); // Output: Point(x=7, y=7)
    }

}