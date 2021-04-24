package pensiones;

import javax.swing.JOptionPane;

public class Pensiones {

    private int Edad;
    private int opcion;
    private double Total;
    private double SalarioM;
    private double MesadaR;
    private double Retencion;
    private double Bono;
    private double BonoF;
    private String Genero;
    private double Transporte;
    private int Trabajo;
    private int Fuerzas;
    private String MensajeR;

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public double getBonoF() {
        return BonoF;
    }

    public void setBonoF(double BonoF) {
        this.BonoF = BonoF;
    }

    public double getSalarioM() {
        return SalarioM;
    }

    public void setSalarioM(double SalarioM) {
        this.SalarioM = SalarioM;
    }

    public double getMesadaR() {
        return MesadaR;
    }

    public void setMesadaR(double MesadaR) {
        this.MesadaR = MesadaR;
    }

    public double getRetencion() {
        return Retencion;
    }

    public void setRetencion(double Retencion) {
        this.Retencion = Retencion;
    }

    public double getBono() {
        return Bono;
    }

    public void setBono(double Bono) {
        this.Bono = Bono;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public double getTransporte() {
        return Transporte;
    }

    public void setTransporte(double Transporte) {
        this.Transporte = Transporte;
    }

    public int getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(int Trabajo) {
        this.Trabajo = Trabajo;
    }

    public int getFuerzas() {
        return Fuerzas;
    }

    public void setFuerzas(int Fuerzas) {
        this.Fuerzas = Fuerzas;
    }

    public String getMensajeR() {
        return MensajeR;
    }

    public void setMensajeR(String MensajeR) {
        this.MensajeR = MensajeR;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public String ObtenerGenero() {

        switch (opcion) {
            case 1:
                Genero = "Hombre";
                break;
            case 2:
                Genero = "Mujer";
                break;
        }
        return Genero;
    }

    public double CalcularRetencion() {

        if (MesadaR >= (10 * SalarioM)) {
            Retencion = MesadaR * 0.08;
            MensajeR = "Retencion superior";
        }
        if (MesadaR >= (4 * SalarioM) && MesadaR < (10 * SalarioM)) {
            Retencion = MesadaR * 0.04;
            MensajeR = "Retencion media";
        }
        if (MesadaR >= (2 * SalarioM) && MesadaR < (4 * SalarioM)) {
            Retencion = MesadaR * 0.02;
            MensajeR = "Retencion baja";
        }
        if (MesadaR < (2 * SalarioM)) {
            Retencion = MesadaR * 0.2;
            MensajeR = "Excepcion de retencion";
        }
        return Retencion;
    }

    public double CalcularBono() {

        if ("Retencion baja".equals(MensajeR)) {
            switch (Trabajo) {
                case 1:
                    Bono = MesadaR * 0.04;
                    break;
                case 2:
                    if ("Mujer".equals(Genero) && Edad > 66) {
                        Bono = MesadaR * 0.20;
                    }if ("Hombre".equals(Genero) && Edad > 76) {
                        Bono = MesadaR * 0.20;
                    }
                    break;
            }
        }
        return Bono;
    }

    public double CalcularBonoFuerzasA() {

        if (Fuerzas == 1) {
            BonoF = MesadaR * 0.10;
        }
        if (Fuerzas == 2) {
            BonoF = 0;
        }
        return BonoF;
    }

    public double CalcularAuxilio() {

        Transporte = Math.round(SalarioM * 0.02);

        return Transporte;
    }

    public double CalcularTotal() {

        Total = MesadaR + Transporte + Bono + BonoF - Retencion;

        return Total;
    }
}
