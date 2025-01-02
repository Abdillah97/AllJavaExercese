public class TableOfValues{
    public static void main(String[] args){

        int N=1;
        System.out.println("\n+-------+-------+-------+------+");
        System.out.println("| N\t|10*N\t|100*N\t|1000*N|");
        System.out.println("+-------+-------+-------+------+");

        while(N<=5){
            System.out.println("| "+N+"\t|"+10*N+"\t|"+100*N+"\t|"+1000*N+"  |");
            N++;
        }
        
        System.out.println("+-------+-------+-------+------+\n");
    }
}
