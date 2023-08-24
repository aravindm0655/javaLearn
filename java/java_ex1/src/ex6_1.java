public class ex6_1 {
    public static void main(String[] args) {
        int i,j;
        for (i=1;i<=10;i++){
            if(i==6){
                break; // will terminate the loop if condition satisfy
            }
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("\n");
        for (j=1;j<=10;j++){
            if(j==6){
                continue;// will skip if condition satisfy
            }
            System.out.print(j);
            System.out.print(" ");
        }
    }
}
