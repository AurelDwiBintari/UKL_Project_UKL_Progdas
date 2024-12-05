import java.util.Scanner;
public class tokoonlinediskon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //buat pertanyaan dulu
        System.out.println("Masukkan total uang belanjanya : ");
        double totalbelanja = s.nextDouble();
        
        double Totalbayar;

        if(totalbelanja <100000){
            Totalbayar = totalbelanja; //engga ada diskon ya ges
        }else if(totalbelanja <=200000){
            Totalbayar = totalbelanja -(totalbelanja *0.10); //kalo yang ini diskon 10%
        }else{
            Totalbayar = totalbelanja - (totalbelanja*0.20); //Nah ini diskon yang lebih dari 20%
        }

        System.out.println("Total yang harus di bayar setelah diskon adalah : Rp " +Totalbayar);

    }
}
