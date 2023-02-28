import java.util.Scanner;

public class Exercicios{

    public double celsiusParaFarenheit(double graus){

        return graus*1.8+32;

    }

    public int maximoNumeros(int a, int b){

        if(a>b) return a;
        else return b;

    }

    public String criaDescricaoConta(String nome, double saldo){

        return "Nome:"+nome+"\nSaldo: "+saldo;

    }

    public double eurosParaLibras(double valor, double taxaConversao){

        return valor*taxaConversao;

    }

    public String decrescenteMaisMedia(int num1,int num2){

        if(num1>num2) return num1+"\n"+num2+"\n"+"Media: "+(num1+num2)/2;
        else return num2+"\n"+num1+"\n"+"Media: "+(num1+num2)/2;

    }

    public static void main(String [] argv){

        Scanner sc = new Scanner(System.in);
        Exercicios ex = new Exercicios();

        System.out.println("Insira um valor em Graus: ");
        double grau = sc.nextDouble();

        System.out.println("Celsius to Farenheit: "+ex.celsiusParaFarenheit(grau));

        System.out.println("Insira dois numeros: ");
        int fstNum = sc.nextInt();
        int sndNum = sc.nextInt();

        System.out.println("O maior dos dois é: "+ex.maximoNumeros(fstNum,sndNum));

        System.out.println("Insira o seu nome e saldo: ");
        String nome = sc.next();
        double saldo = sc.nextDouble();

        System.out.println(ex.criaDescricaoConta(nome,saldo));

        System.out.println("Insira um valor em euros uma taxa de conversao para libras: ");
        double euro = sc.nextDouble();
        double taxa = sc.nextDouble();
        System.out.println("O valor em libras é: "+ex.eurosParaLibras(euro,taxa));

        System.out.println("Insira dois numeros: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(ex.decrescenteMaisMedia(num1,num2));

        sc.close();

    }

}