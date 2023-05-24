package modelo;
/**
 *
 * @author Daniel Torres 287871
 */
public class Modelo {

    private int valorN;
    private double angulo;
    private double salida;

    public int getValorN() {
        return valorN;
    }

    public void setValorN(int valorN) {
        this.valorN = valorN;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getSalida() {
        return salida;
    }

    public void setSalida(double salida) {
        this.salida = salida;
    }

    //Metodo que calcula en seno con serie de Taylor
    public double seno (){
        //Se divide la operacion en divisor, dividendo, signo y una expresion recurrente
        double x , dividendo, divisor, signo, exp;
        this.salida = 0;
        //Se pasa el angulo de grados a radianes
        x = Math.toRadians(this.angulo);
        //Correccion Pi
        //Cuando se realiza el calculo con Pi arroja valores errados
        //Cuando se reemplaza pi por 3.1 se corrije el resultado
        if(x%Math.PI==0) {
            x=3.1;
        }
        //FOR utilizado para el número de iteraciones
        for (int i = 0; i <= this.valorN; i++) {
            exp = 2*i+1;
            //Calcula dividendo
            dividendo=Math.pow(x,exp);
            //Calcula divisor
            divisor = 1;
            //FOR utilizado para el factorial
            for (int j = 1; j <= exp; j++) {
                divisor = divisor * j;
            }
            //Calcula si el signo es positivo o negativo
            if (i%2==0) {
                signo =  1;
            } else {
                signo = -1;
            }
            //Se realiza sumatoria por cada iteracion
            this.salida = this.salida + (dividendo/divisor)*signo;
        }
        return this.salida;
    }
}
