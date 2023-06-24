import java.util.Scanner;

class CurrencyConverter{
    void rupees(double d , double e, double di, double p){
        d = d * 0.012;
        System.out.println("The amount in Dollar : " + d);
        e = e * 0.011;
        System.out.println("The amount in Euros : " + e);
        di = di * 0.0038;
        System.out.println("The amount in Dinar : " + di);
        p = p * 0.0096;
        System.out.println("The amount in Pound : " + p);
    }
    void dollar(double d , double e, double di, double p){
        d = d * 81.96;
        System.out.println("The amount in Rupees : " + d);
        e = e * 0.91;
        System.out.println("The amount in Euros : " + e);
        di = di * 0.31;
        System.out.println("The amount in Dinar : " + di);
        p = p * 0.79;
        System.out.println("The amount in Pound : " + p);
    }
    void euros(double d , double e, double di, double p){
        d = d * 1.09;
        System.out.println("The amount in Dollar : " + d);
        e = e * 89.62;
        System.out.println("The amount in Rupees : " + e);
        di = di * 0.34;
        System.out.println("The amount in Dinar : " + di);
        p = p * 0.86;
        System.out.println("The amount in Pound : " + p);
    }
    void dinar(double d , double e, double di, double p){
        d = d * 3.27;
        System.out.println("The amount in Dollar : " + d);
        e = e * 2.99;
        System.out.println("The amount in Euros : " + e);
        di = di * 267.60;
        System.out.println("The amount in Rupees : " + di);
        p = p * 2.57;
        System.out.println("The amount in Pound : " + p);
    }
    void pound(double d , double e, double di, double p){
        d = d * 1.27;
        System.out.println("The amount in Dollar : " + d);
        e = e * 1.16;
        System.out.println("The amount in Euros : " + e);
        di = di * 0.39;
        System.out.println("The amount in Dinar : " + di);
        p = p * 104.20;
        System.out.println("The amount in Rupees : " + p);
    }
    void mainConverter() {
        char option;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the currency you want to convert in available choices:");
        System.out.println("a. Rupees");
        System.out.println("b. Dollar");
        System.out.println("c. Euros");
        System.out.println("d. Dinar");
        System.out.println("e. Pound");
        option = sc.next().charAt(0);
        switch (option){
            case 'a':
                System.out.println("The conversion of Rupees");
                System.out.println("Enter the amount you want to convert for dinar , dollar, euro and pound : ");
                double dinar1 = sc.nextDouble();
                double dollar1 = sc.nextDouble();
                double euro1 = sc.nextDouble();
                double pound1 = sc.nextDouble();
                rupees(dollar1,dinar1,euro1,pound1);
                break;
            case 'b':
                System.out.println("The conversion of Dollar");
                System.out.println("Enter the amount you want to convert for dinar , rupee, euro and pound : ");
                double rupee1 = sc.nextDouble();
                double euro2 = sc.nextDouble();
                double dinar2 = sc.nextDouble();
                double pound2 = sc.nextDouble();
                dollar(rupee1,euro2,dinar2,pound2);
                break;
            case 'c':
                System.out.println("The conversion of Euros");
                System.out.println("Enter the amount you want to convert for dinar , dollar, rupee and pound : ");
                double dollar2 = sc.nextDouble();
                double rupee2 = sc.nextDouble();
                double dinar3 = sc.nextDouble();
                double pound3 = sc.nextDouble();
                euros(dollar2,rupee2,dinar3,pound3);
                break;
            case 'd':
                System.out.println("The conversion of Dinar");
                System.out.println("Enter the amount you want to convert for rupee , dollar, euro and pound : ");
                double dollar3 = sc.nextDouble();
                double euro3 = sc.nextDouble();
                double rupee3 = sc.nextDouble();
                double pound4 = sc.nextDouble();
                dinar(dollar3,euro3,rupee3,pound4);
                break;
            case 'e':
                System.out.println("The conversion of Pound");
                System.out.println("Enter the amount you want to convert for dinar , dollar, euro and rupee : ");
                double dollar4 = sc.nextDouble();
                double euro4 = sc.nextDouble();
                double dinar4 = sc.nextDouble();
                double rupee4 = sc.nextDouble();
                pound(dollar4,euro4,dinar4,rupee4);
                break;
            default:
                System.out.println("Choose correct option for conversion.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        CurrencyConverter c1 = new CurrencyConverter();
        c1.mainConverter();
    }
}