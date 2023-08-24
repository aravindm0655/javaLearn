public class ex6 {
    /*iterative statement 
    1 for 
    2 while 
    3 do while 
    jump statement
        1_)break 
        2_) continue 
    */
    public static void main(String[] args) {
        for (int i=1;i<=10;i++)
        {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("\n");
        /*
         * 
         */
        int j=1;
        while(j<=10){
            System.out.print(j);
            System.out.print(" ");
            j++;
        }
        System.out.print("\n");
        /*
         * do statement will execute at least once even if the condition dose not satisfy 
         */
        int k=2;
        do{
            System.out.println("do statement executed ");
        }
        while(k==1);

    }
}
