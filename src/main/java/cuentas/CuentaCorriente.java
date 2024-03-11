package cuentas;

class CuentaCorriente {
    private final double movimientos[] = new double[10];
    private String titular;
    private double saldo;
    private String fecha;

    public CuentaCorriente(String titular, String fecha) {
        this.titular = titular;
        this.fecha = fecha;
    }

    //-------------------Array movimiento---------------------------------------
    public void arrayMovimiento(double monto) {
        // Busca el primer índice no utilizado en el array
        int indice = -1;
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] == 0) {
                indice = i;
                break;
            }
        }

        // Si hay un índice disponible, agrega el monto al array de movimientos
        if (indice != -1) {
            movimientos[indice] = monto;
        } else {
            System.out.println("No hay espacio disponible para más movimientos.");
        }
    }

    //----------------------abono----------------------------------------------
    public void abono(double abonoSex) {
        if (abonoSex < 0) {
            System.out.println("ERROR, DIGITO INCORRECTO");
        } else {
            System.out.println("TRANSACCIÓN REALIZADA"
                    + "\n USTED HA REALIZADO UN ABONO DE: " + abonoSex);
            this.saldo += abonoSex;
            arrayMovimiento(abonoSex);
        }
    }

    //----------------------girar-----------------------------------------------
    public void girar(double girarSex) {
        if (saldo < girarSex) {
            System.out.println("SU SALDO ES 0!!!");
            this.saldo = 0;
        } else {
            System.out.println("SE REALIZÓ UN RETIRO DE: " + girarSex);
            this.saldo -= girarSex;
            arrayMovimiento(-girarSex);
        }
    }

    //-----------------------Get Set--------------------------------------------
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    //--------------------toString----------------------------------------------
    @Override
    public String toString() {
        StringBuilder boleta = new StringBuilder();
        boleta.append("*****************************************\n");
        boleta.append("************ BOLETA DE MOVIMIENTOS ************\n");
        boleta.append("*****************************************\n");
        boleta.append("Titular: ").append(titular).append("\n");
        boleta.append("Fecha de apertura: ").append(fecha).append("\n");
        boleta.append("-----------------------------------------\n");
        boleta.append("Saldo actual: ").append(saldo).append("\n");
        boleta.append("-----------------------------------------\n");
        boleta.append("Movimientos:\n");
    
        for (int i = 0; i < movimientos.length; i++) {
            if (movimientos[i] != 0) {
                boleta.append(" - Movimiento ").append(i + 1).append(": ").append(movimientos[i]).append("\n");
            }
        }
    
        boleta.append("*****************************************\n");
        return boleta.toString();
    }
}
