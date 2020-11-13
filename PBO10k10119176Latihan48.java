/**
 * Latihan48
 * Nama     : Muhammad Fauzan Fadhlulbarr
 * Kelas    : PBO10K
 * NIM      : 10119176
 * Program  : Kalkulator
 */
public class PBO10k10119176Latihan48 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        kalkulator.setValue1(7.0f);
        kalkulator.setValue2(5.0f);

        double value1 = kalkulator.getValue1();
        double value2 = kalkulator.getValue2();

        System.out.println("VALUE 1 = " + kalkulator.getValue1());
        System.out.println("VALUE 2 = " + kalkulator.getValue2());

        kalkulator.setNamaProject();
        kalkulator.setNoteProject("This project shown you how to manage method in java");

        System.out.println("Result Add is = " + kalkulator.add(value1,value2));
        System.out.println("Result Minus is = " + kalkulator.minus(value1,value2));
        System.out.println("Result Multiple is = " + kalkulator.multiplication(value1,value2));
        System.out.println("Result Division is = " + kalkulator.division(value1,value2));

    }
}