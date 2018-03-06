package packagee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ConditionsAndLoops conditionsAndLoops = new ConditionsAndLoops();
        conditionsAndLoops.ifExample();
        //conditionsAndLoops.ifExample2();
        //conditionsAndLoops.switchExample();
        //conditionsAndLoops.ifWithFewConditions();
        //conditionsAndLoops.whileLoop();
        //conditionsAndLoops.doWhileLoop();
        //conditionsAndLoops.forLoop();
        //conditionsAndLoops.foreachLoopJava();


        MethodsAndPassingParameters methodsAndPassingParameters = new MethodsAndPassingParameters();

        String nazwaMetody = new Object(){}.getClass().getEnclosingMethod().getName();
        // Przechodzenie z glownego programu do podprogramu -> metody
        /*System.out.println("Jestem w "+nazwaMetody);
        methodsAndPassingParameters.wyswietlCos();
        System.out.println("Jestem ponownie w "+nazwaMetody);*/

        // Metoda zwracajaca cos
        /*System.out.println(methodsAndPassingParameters.metodaZwracajacaStringa());*/

        // Przeciazenie metody
        /*System.out.println(methodsAndPassingParameters.podwojenie(5));
        System.out.println(methodsAndPassingParameters.podwojenie(5,3));*/

        // Metoda. Argument przekazany przez referencje do obiektu - listy. Dodanie obiektu
        /*List<String> listaDoIteracji = new ArrayList<>();
        listaDoIteracji.add("Pierwszy");
        listaDoIteracji.add("Drugi");
        listaDoIteracji.add("Trzeci");
        System.out.println(listaDoIteracji);
        methodsAndPassingParameters.zmienListe(listaDoIteracji);
        System.out.println(listaDoIteracji);
*/
        // Metoda z niewiadoma liczba argumentow
        /*System.out.println(methodsAndPassingParameters.metodaZNiewiadomaLiczbaArgumentow("Raz", "Dwa", "Trzy"));
        System.out.println(methodsAndPassingParameters.metodaZNiewiadomaLiczbaArgumentow("Raz", "Dwa", "Trzy", "Cztery"));*/

    }
}
