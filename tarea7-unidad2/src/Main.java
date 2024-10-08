import javax.imageio.ImageTranscoder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numeroAleatorio1 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio2 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio3 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio4 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio5 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio6 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio7 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio8 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio9 = (int) (Math.random() * 100) + 1;
        int numeroAleatorio10 = (int) (Math.random() * 100) + 1;

        double raiznumero1 = Math.sqrt(numeroAleatorio1);
        double raiznumero2 = Math.sqrt(numeroAleatorio2);
        double raiznumero3 = Math.sqrt(numeroAleatorio3);
        double raiznumero4 = Math.sqrt(numeroAleatorio4);
        double raiznumero5 = Math.sqrt(numeroAleatorio5);
        double raiznumero6 = Math.sqrt(numeroAleatorio6);
        double raiznumero7 = Math.sqrt(numeroAleatorio7);
        double raiznumero8 = Math.sqrt(numeroAleatorio8);
        double raiznumero9 = Math.sqrt(numeroAleatorio9);
        double raiznumero10 = Math.sqrt(numeroAleatorio10);

        int potencianumero1 = (int) Math.pow(numeroAleatorio1, 2);
        int potencianumero2 = (int) Math.pow(numeroAleatorio2, 2);
        int potencianumero3 = (int) Math.pow(numeroAleatorio3, 2);
        int potencianumero4 = (int) Math.pow(numeroAleatorio4, 2);
        int potencianumero5 = (int) Math.pow(numeroAleatorio5, 2);
        int potencianumero6 = (int) Math.pow(numeroAleatorio6, 2);
        int potencianumero7 = (int) Math.pow(numeroAleatorio7, 2);
        int potencianumero8 = (int) Math.pow(numeroAleatorio8, 2);
        int potencianumero9 = (int) Math.pow(numeroAleatorio9, 2);
        int potencianumero10 = (int) Math.pow(numeroAleatorio10, 2);

        int suma = numeroAleatorio1 + numeroAleatorio2 + numeroAleatorio3 + numeroAleatorio4 + numeroAleatorio5 + numeroAleatorio6 + numeroAleatorio7 + numeroAleatorio8 + numeroAleatorio9 + numeroAleatorio10;
        double media = suma / 10;

        double deviacionestandarsuma = Math.pow(numeroAleatorio1-media, 2)+
        Math.pow(numeroAleatorio2-media, 2)+
        Math.pow(numeroAleatorio3-media, 2)+
        Math.pow(numeroAleatorio4-media, 2)+
        Math.pow(numeroAleatorio5-media, 2)+
        Math.pow(numeroAleatorio6-media, 2)+
        Math.pow(numeroAleatorio7-media, 2)+
        Math.pow(numeroAleatorio8-media, 2)+
        Math.pow(numeroAleatorio9-media, 2)+
        Math.pow(numeroAleatorio10-media, 2);

        double desviacionestandar = Math.sqrt((deviacionestandarsuma/10));

        System.out.println(numeroAleatorio1);
        System.out.println(numeroAleatorio2);
        System.out.println(numeroAleatorio3);
        System.out.println(numeroAleatorio4);
        System.out.println(numeroAleatorio5);
        System.out.println(numeroAleatorio6);
        System.out.println(numeroAleatorio7);
        System.out.println(numeroAleatorio8);
        System.out.println(numeroAleatorio9);
        System.out.println(numeroAleatorio10);
        System.out.println(raiznumero1);
        System.out.println(raiznumero2);
        System.out.println(raiznumero3);
        System.out.println(raiznumero4);
        System.out.println(raiznumero5);
        System.out.println(raiznumero6);
        System.out.println(raiznumero7);
        System.out.println(raiznumero8);
        System.out.println(raiznumero9);
        System.out.println(raiznumero10);
        System.out.println(potencianumero1);
        System.out.println(potencianumero2);
        System.out.println(potencianumero3);
        System.out.println(potencianumero4);
        System.out.println(potencianumero5);
        System.out.println(potencianumero6);
        System.out.println(potencianumero7);
        System.out.println(potencianumero8);
        System.out.println(potencianumero9);
        System.out.println(potencianumero10);
        System.out.println(media);
        System.out.println(desviacionestandar);

    }
}