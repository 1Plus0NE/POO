package POO.Aula2;
import java.time.LocalDate;

public class Exercicio2 {

    private LocalDate[] datas;
    private int size;

    public void ColDatas(){

        datas = new LocalDate[10];
        size = 0;
    }
 
    public void insereData(LocalDate data){
        if(size < datas.length)
            datas[size++] = data;
    }

    public LocalDate dataMaisProxima(LocalDate data){

        // diff = dataatual until(data, chronounit.days); SUGESTAO

    }

}
