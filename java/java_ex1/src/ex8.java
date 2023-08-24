public class ex8 {
    public static void main(String[] args) {
        natnum(10);
    }
    public static void natnum(int n){
        if(n==1){
            System.out.println(1);
        }
        else{
            System.out.println(n);
            natnum(n-1);
        }
    }
}
