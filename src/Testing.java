import com.company.calculation.LorryCalcService;
import com.company.calculation.PrivateCarCalcService;
import com.company.calculation.TaxiCalcService;
import com.company.entities.Lorry;
import com.company.entities.PrivateCar;
import com.company.entities.Taxi;
import com.company.plate.Plate;

public class Testing {

    //Tester is equivalent to taxi
    static TaxiCalcService testerCalcService = new TaxiCalcService();
    static PrivateCarCalcService privateCarCalcService = new PrivateCarCalcService();
    static LorryCalcService lorryCalcService = new LorryCalcService();

    public static void main(String[] args) {
        Plate plate1 = new Plate(1,"D");
        Plate plate2 = new Plate(13,"D");
        Plate plate3 = new Plate(8,"D");


        Taxi taxi1 = new Taxi(plate1, 1000, 1);
        Taxi taxi2 = new Taxi(plate1, 2000, 4);
        Taxi taxi3 = new Taxi(plate1, 1500, 6);
        Taxi taxi4 = new Taxi(plate1, 1200, 9);
        Taxi taxi5 = new Taxi(plate1, 1700, 11);

        PrivateCar p1 = new PrivateCar(plate1, 1200, 60, false);
        PrivateCar p2 = new PrivateCar(plate1, 2200, 60, true);
        PrivateCar p3 = new PrivateCar(plate3, 1200, 60, false);
        PrivateCar p4 = new PrivateCar(plate3, 1200, 60, true);

        Lorry l1 = new Lorry(plate1, 2000, 4, 20);
        Lorry l2 = new Lorry(plate1, 2000, 8, 30);
        Lorry l3 = new Lorry(plate1, 2000, 12, 55);
        Lorry l4 = new Lorry(plate1, 2000, 3, 2);


        System.out.println("-------Private cars------");
        double presult1 = privateCarCalcService.calculateTax(p1);
        double presult2 = privateCarCalcService.calculateTax(p2);
        double presult3 = privateCarCalcService.calculateTax(p3);
        double presult4 = privateCarCalcService.calculateTax(l4);

        System.out.println(presult1);
        System.out.println(presult2);
        System.out.println(presult3);
        System.out.println(presult4);

        System.out.println("---------Lorry------");

        double lresult1 = lorryCalcService.calculateTax(l1);
        double lresult2 = lorryCalcService.calculateTax(l2);
        double lresult3 = lorryCalcService.calculateTax(l3);
        double lresult4 = lorryCalcService.calculateTax(l4);

        System.out.println(lresult1);
        System.out.println(lresult2);
        System.out.println(lresult3);
        System.out.println(lresult4);

        System.out.println("---------Taxi-------");
        double result1 = testerCalcService.calculateTax(taxi1);
        double result2 = testerCalcService.calculateTax(taxi2);
        double result3 = testerCalcService.calculateTax(taxi3);
        double result4 = testerCalcService.calculateTax(taxi4);
        double result5 = testerCalcService.calculateTax(l4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
