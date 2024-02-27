package latihan_tanggal_27_februari_2024;

public class rekursif1 {
    public static int faktorial(int n){
        if(n == 0){ //kasus dasar 0! = 1
            return 1;
        }else{
            return n * faktorial(n-1);
        }
    }
    public static int faktorial_looping(int n){
        int x =1 ;
        for(int i = 1; i <=n ; i++){
            x *= i;
        }
        return x;

    }
    
    public static void main(String[]args){
         int n = 5;
         System.out.println("Faktorial " + n + "!" + " : " + faktorial(n));
         System.out.println("Faktorial " + n + "!" + " : " + faktorial_looping(n));
    }
}
