import java.util.Scanner;
import java.util.Arrays;

public class Exercicio1{

    public int minimoArray(int[] arrayNums){ // Exercicio 1.a)

        int min = 2147483647; // Alternativa para o MAX_VALUE.
        int pos = -1;

        for(int i=0;i<arrayNums.length;i++){
            if(arrayNums[i]< min){
                min = arrayNums[i];
                pos = i;
            }
        }return min;
    }

    public int minimoArrayAlt(int[] arrayNums){ // Exercicio 1.a) Alternativa

        Arrays.sort(arrayNums); // Ordena o array.
        return arrayNums[0];    // Como o array esta ordenado, a primeira posição corresponderá ao menor elemento do array.

    }

    public static int[] lerArray(int tamanho){ // Metodo auxiliar para um array

        int[] numeros = new int[tamanho];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira "+tamanho+" numeros: ");

        for(int i=0;i<tamanho;i++)
            numeros[i] = sc.nextInt();

        return numeros;

    }

    public static int[] indexArray(int startIndex, int endIndex, int[] arrayNums){ // Exercicio 1.b)

        int size = endIndex-startIndex + 1;
        int[] numeros = new int[size];

        for(int i=0;i<size;i++)
            numeros[i] = arrayNums[startIndex + i];

        return numeros;

    }

    public static int[] indexArrayAlt(int[] arrayNums, int num1, int num2){ // Exercicio 1.b) Alternativa 

        int[] nArray = Arrays.copyOfRange(arrayNums, num1, num2);
        return nArray;

    }

    public static int[] commonElem(int[] array1, int[] array2){ // Exercicio 1.c)

        int[] numeros = new int[array1.length];
        int n=0;

        for(int i=0;i<array1.length;i++){

            for(int j=0;j<array2.length;j++){

                if(array1[i] == array2[j]){
                    numeros[n++] = array1[i];
                } 

            }

        }
        
        int[] finalResult = new int[n];

        for (int i = 0;i < n;i++){
            finalResult[i] = numeros[i];
        }


        return finalResult;

    }

    public void printaArray(int[] arrayNums){ // Metodo auxiliar para printar um array

        for(int a: arrayNums) System.out.println(a);

    }

    public int findElem(int [] arrayNums, int index){ // Ex 3.b) Suponha-se que o index >=0 e <=arrayNums 

        int elem=0;

        for(int i=0;i<arrayNums.length;i++){

            if(i == index)

            elem = arrayNums[i];

        }

        return elem;

    }

    public int findIndex(int [] arrayNums, int elem){ // Ex 3.b)

        int pos = -1;
        boolean flag = false;

        for(int i=0;i<arrayNums.length && !flag;i++){

            if(arrayNums[i] == elem){

                flag = true;
                pos = i;

            }

        }

        return pos;

    }

    public static String[] nonDuplicate(String[] arrayStrings){

        int size = arrayStrings.length;
        String[] result = new String[size];
        int n = 0;

        for(String s:arrayStrings){
            boolean isDuplicate = false;
            for(int j=0;j<n;j++){
                if(s.equals(result[j])){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate)
                result[n++] = s;
        }

        return Arrays.copyOf(result, n);

    }

    public static String[] lerArrayStrings(int size){

        String[] strings = new String[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira "+size+" strings: ");

        for(int i=0;i<size;i++)
            strings[i] = sc.nextLine();

        return strings;


    }

    public void printaArrayString(String [] arr){

        for(String s: arr) System.out.println(s);

    }

    public static String biggestS(String [] arr){

        String big = "";

        for(String s: arr){

            if(s.length() > big.length())
                big = s;

        }

        return big;

    }

    public static String[] duplicates(String [] arr){

        int size = arr.length;
        int n = 0;
        String[] duplicates = new String[size];

        for(String s:arr){

            if(timesHappen(arr, s) > 1)

                duplicates[n++] = s;

        }
        
        return nonDuplicate(Arrays.copyOf(duplicates,n));

    }

    public static int timesHappen(String [] arr, String str){

        int n = 0;

        for(String s: arr)
            if(s!= null && s.equals(str)) n++;

        return n;

    }

    public static int[][] lerMatriz(int row, int col){

        int [][] matriz = new int[row][col];
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira "+row+" linhas de numeros e "+col+" colunas de numeros: ");
        
        for(int i=0;i<row;i++){

            for(int j=0; j<col;j++){

                matriz[i][j] = sc.nextInt();

            }

        }

        return matriz;

    }

    public void printaMatriz(int [][] matriz){

        for(int i=0;i<matriz.length;i++){

            for(int j=0; j<matriz[i].length;j++){

                System.out.println(matriz[i][j]+" ");

            }

        }

    }

    public static void main(String [] argv){

        Exercicio1 ex1 = new Exercicio1();
        Scanner sc = new Scanner(System.in);

        /*

        System.out.println("Quantos inteiros quer ler?");
        int dim = sc.nextInt();
        int[] arrayNums = lerArray(dim);

        // Exercicio 1.a)

        System.out.println("Minimo = "+f2.minimoArray(arrayNums));
        System.out.println("Minimo = "+f2.minimoArrayAlt(arrayNums));
        */

        // Exercicio 1.b)

        /* 

        System.out.println("Insira dois indices: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int[] nArray = indexArray(num1, num2, arrayNums);
        ex1.printaArray(nArray);

        */

        // Exercicio 1.c)
        /* 
        System.out.println("Insira o tamanho do array1: ");
        int dimArray1 = sc.nextInt();
        int[] array1 = lerArray(dimArray1);

        System.out.println("Insira o tamanho do array2: ");
        int dimArray2 = sc.nextInt();
        int[] array2 = lerArray(dimArray2);

        int[] repetidos = commonElem(array1, array2);
        System.out.println("Array com os elementos em comum entre o Array1 e o Array2: ");
        ex1.printaArray(repetidos);
        */

        // Exercicio 3.b) Index/Elem search
        /*
        System.out.println("Quantos inteiros quer ler?");
        int dim = sc.nextInt();
        int[] arrayNums = lerArray(dim);

        System.out.print("Insira uma posição para aceder ao elemento do Array: ");
        int index = sc.nextInt();
        int elem = ex1.findElem(arrayNums,index);
        System.out.println("O elemento na posição "+index+" é "+elem);

        System.out.print("Insira um elemento para aceder à sua posição do Array: ");
        int elem = sc.nextInt();
        int index = ex1.findIndex(arrayNums, elem);
        System.out.println("O elemento "+elem+" encontra-se na posição "+index);
        */

        // Exercicio 4.a)
        /* 
        System.out.println("Quantas strings queres ler?");
        int dim = sc.nextInt();
        String[] arrayStrings = lerArrayStrings(dim);
        */
        // ex1.printaArrayString(arrayStrings);
        // String[] semRepetidos = nonDuplicate(arrayStrings);
        // System.out.println(Arrays.toString(semRepetidos));

        // Exercicio 4.b)

        // String maior = biggestS(semRepetidos);
        // System.out.println("A maior string do array é: "+maior);

        // Exercicio 4.c)
        /* 
        String[] duplicates = duplicates(arrayStrings);
        System.out.println(Arrays.toString(duplicates));
        */
        // Exercicio 4.d)
        /* 
        System.out.print("Insira uma string existente no array: "); // Se não existir vai dar erro, solução: criar um method auxiliar que verifique
        sc.nextLine();
        String str = sc.nextLine();
        int count = timesHappen(arrayStrings, str);
        System.out.println("A string "+str+" aparece no array "+count+" vezes.");
        */
        // Exercicio 5.a)

        System.out.println("Insira o numero de linhas: ");
        int rows = sc.nextInt();
        System.out.println("INsira o numero de colunas: ");
        int cols = sc.nextInt();
        int[][] matrizNums = lerMatriz(rows,cols);
        ex1.printaMatriz(matrizNums);
       


        sc.close();

    }
    
}
