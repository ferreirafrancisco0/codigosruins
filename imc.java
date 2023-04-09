import java.util.Scanner;

public class ClasseScanner {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String nome, resultado;
        float peso, altura, imc;
        System.out.println("Insira nome");
        nome = leia.nextLine();
        System.out.println("Insira Sua Altura");
        altura = leia.nextFloat();
        System.out.println("Insira Seu peso");
        peso = leia.nextFloat();
        imc = (peso / (altura * altura));
        resultado = "";
        if (imc < 18.5) {

            resultado = ("Muito magro");
        }
        if (imc >= 18.5 && imc <= 24.9) {
            resultado = ("Normal");
        }
        if (imc >= 25.5 && imc <= 29.9) {
            resultado = ("Sobrepeso");
        }
        if (imc >= 30.0 && imc <= 34.9) {
            resultado = ("Obeso Grau 1");
        }
        if (imc >= 35.5 && imc <= 39.9) {
            resultado = ("Obeso grau 2");
        }
        if (imc >= 40.0) {

            resultado = ("Obeso grau 3");
        }

        System.out.println(imc);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Resultado: " + resultado);

        leia.close();

    }
}
