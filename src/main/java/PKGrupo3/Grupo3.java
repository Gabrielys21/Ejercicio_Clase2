package PKGrupo3;

public class Grupo3 {
    public double calculadorageometrica(double radio){
        return Math.PI + Math.pow(radio, 2);
    }

    public double CalculadoraCirculo (double radio){
        return 2 * Math.PI * radio;
    }

    public double CalcularVolumen(double lado){
        return Math.pow(lado, 3);
    }
}
