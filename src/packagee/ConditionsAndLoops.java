package packagee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//14.	Mechanizmy strukturalizacji programów - instrukcje warunkowe i pętle.
// http://shebang.pl/kursy/programowanie-cpp/r6-instrukcje-sterujace/
public class ConditionsAndLoops {
    //symbole == , >, <, >=, <= , !=
    public void ifExample(){
        System.out.println("if method");
        int liczbaDzieci = 2;
        if(liczbaDzieci > 0){
            System.out.println("Jestem w warunku i mam dzieci!");
        }else{
            System.out.println("Jestem w elsie i nie mam dzieci!");
        }
    }

    public void ifExample2(){
        System.out.println("if method");
        int liczbaDzieci = 2;
        if(liczbaDzieci == 0){
            System.out.println("Jestem w warunku i mam dzieci!");
        }else if(liczbaDzieci == 1){
            System.out.println("Jedno dziecko.");
        }else if(liczbaDzieci == 2){
            System.out.println("Mam dwojke dzieci!");
        }else{
            System.out.println("Jestem w elsie i nie mam dzieci!");
        }
    }

    public void switchExample(){
        int liczbaDzieci = 1;
        switch (liczbaDzieci){
            case 0:
                System.out.println("Nie ma dzieci!");
                break;
            case 1:
                System.out.println("Jedno dziecko!");
                break; // co sie stanie gdy nie ma break
            case 2:
                System.out.println("Dwojka dzieci!");
                break;
            default:
                System.out.println("Domyslny przypadek gdy nie wpadnie w poprzednie!");
                break;
        }
    }
    public void switchExample2(){
        //int liczbaDzieci = 1; //typy
        String liczbaDzieci = "1";
        switch (liczbaDzieci){
            case "0":
                System.out.println("Nie ma dzieci!");
                break;
            case "1":
                System.out.println("Jedno dziecko!");
                break; // co sie stanie gdy nie ma break
            case "2":
                System.out.println("Dwojka dzieci!");
                break;
            default:
                System.out.println("Domyslny przypadek gdy nie wpadnie w poprzednie!");
                break;
        }
    }

    public void ifWithFewConditions(){
        int liczbaDzieci = 1;
        boolean rozrzutnaZona = true;
        if(liczbaDzieci==1 && rozrzutnaZona){
            System.out.println("Slabo!");
        }else if(liczbaDzieci>1 && rozrzutnaZona){
            System.out.println("Jeszcze gorzej!");
        }else{
            System.out.println("Bogacz!");
        }
    }

    public void whileLoop(){
        int licznik= 0;
        while(licznik<4){ // dopoki licznik mniejszy od 4
            System.out.println(licznik+" wykonuje petle while");
            licznik++;
        }
    }

    public void doWhileLoop(){
        int licznik = 4;
        do{
            System.out.println(licznik+" wykonuje petle DO while");
            licznik++;
        }while(licznik<4);
    }

    /*Pętli for używa się wtedy, gdy liczba powtórzeń (iteracji) jest znana.
    Natomiast pętli while używa się najczęściej wtedy, gdy liczba iteracji nie jest znana z góry.*/
    public void forLoop(){
        int koniec = 5;
        for(int i=0; i<koniec; i++){ // zmienna i zdefiniowana w petli
            System.out.println(i+" wykonuje petle for");
        }
    }

    public void foreachLoopJava(){
        List<String> listaDoIteracji =  Arrays.asList("Pierwszy element", "Drugi element", "Trzeci element");
        for (String elementZListy:listaDoIteracji
             ) {
            System.out.println(elementZListy);
        }
    }
}
