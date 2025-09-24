
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa obj1 = new Pessoa("Gabriel", 19);
        Pessoa obj2 = new Pessoa("Rafael", 54);
        Pessoa obj3 = new Pessoa("João pedro estrupado", 69);

        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        
        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();
        listaP.add(obj3);
        listaP.add(obj2);
        listaP.add(obj1);

        System.out.println(listaP.get(0));
        System.out.println(listaP.get(1));
        System.out.println(listaP.get(2));

        for(Pessoa auxP : listaP){   
            System.out.println(auxP.toString());
        }
        
    }

}
