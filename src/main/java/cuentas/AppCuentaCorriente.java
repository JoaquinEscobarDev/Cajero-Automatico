package cuentas;

public class AppCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("XUXANKO", "15-11-2022");

        try {
            System.out.println(cuenta.toString());
            cuenta.abono(11000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.girar(3000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.abono(8000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.girar(10000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.abono(16000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.girar(1000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.abono(9000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.girar(6000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.abono(12000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }

        try {
            System.out.println(cuenta.toString());
            cuenta.girar(19000);
        } catch (Exception e) {
            System.out.println("ERROR: DATO INVALIDO");
        }
    }
}
