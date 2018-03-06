package packagee;

import java.util.List;
import java.util.concurrent.Callable;

//15.	Podprogramy. Przekazywanie parametrów podprogramu.
// W Javie podprogramy to metody klas
// http://shebang.pl/kursy/programowanie-cpp/r7-funkcje/
public class MethodsAndPassingParameters {
    public void wyswietlCos(){ // typ dostepu, typ metody -> void, , ilosc argumentow - tutaj bez argumentow
        String nazwaMetody = new Object(){}.getClass().getEnclosingMethod().getName();
        System.out.println("Jestem w "+ nazwaMetody+"()");
    }

    public String metodaZwracajacaStringa(){
        String stringDoZwrocenia = "Hello from the other side";
        return stringDoZwrocenia;
    }

    public int podwojenie(int liczbaDoPodwojenia){
        return 2*liczbaDoPodwojenia;
    }

    public int podwojenie(int liczbaDoPodwojenia, int ileRazyPodwoic){ // przeciazenie metody podwojenie
        return liczbaDoPodwojenia*ileRazyPodwoic;
    }

    public void zmienListe(List<String> lista){
        lista.add("test 4");
    }

    public String metodaZNiewiadomaLiczbaArgumentow(String... niewiadomaLiczbaArgumentow){
        String wszystkieArgumenty = "";
        for (String pojedynczyArgument:niewiadomaLiczbaArgumentow
             ) {
            wszystkieArgumenty+=pojedynczyArgument+", ";
        }
        return wszystkieArgumenty.substring(0,wszystkieArgumenty.length()-2);
    }

}
