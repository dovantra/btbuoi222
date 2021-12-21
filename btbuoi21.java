import java.util.Scanner;

public class btbuoi21 {

    public static void main(String[] args) {
        Scanner dtb = new Scanner(System.in);
        System.out.println(" diem thuc hanh :");
        double dth = dtb.nextDouble();
        System.out.println("diem li thuyet:");
        double dlt = dtb.nextDouble();
        double adtb;
        adtb = (dth + dlt) / 2;
        System.out.println(adtb);
        String s = (adtb > 6) ? " đạt" : "trượt";
        System.out.println(s);

        








    }

    
}
