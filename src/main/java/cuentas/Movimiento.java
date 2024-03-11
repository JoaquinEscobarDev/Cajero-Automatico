package cuentas;

class Movimiento {
    private int abono;
    private int cargo;
    private int fecha;
    private int monto;

    public Movimiento(int abono, int cargo, int fecha, int monto) {
        this.abono = abono;
        this.cargo = cargo;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getAbono() {
        return abono;
    }

    public void setAbono(int abono) {
        this.abono = abono;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
}
