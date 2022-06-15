package aula2;

import modelos.Carro;
import modelos.Modelo;

/**
 *
 * @author yuri
 */
public class ManipularObjetos {

    public static void main(String[] args) {

        //carro 1
        Modelo objModelo = new Modelo("Chevrolet", "Corsa");
        Carro objCarro = new Carro("001002003", "Vermelho", objModelo, 2010, 2011);
        //carro 2
        Modelo objModelo2 = new Modelo("Chevrolet", "Opala");
        Carro objCarro2 = new Carro("002001003", "Preto", objModelo2, 1980, 1981);
        //carro 3
        Modelo objModelo3 = new Modelo("Wolks", "Gol");
        Carro objCarro3 = new Carro("111222333", "Azul", objModelo3, 2015, 2016);
        
        Carro objCarroMaisNovo = obterCarroMaisNovo(objCarro, objCarro2, objCarro3);
        
        System.out.println("Carro mais novo: \n" + objCarroMaisNovo);
    }

    public static Carro obterCarroMaisNovo(Carro obj, Carro obj2, Carro obj3) {

        if (obj.getAno_fabricacao() > obj2.getAno_fabricacao() && obj.getAno_fabricacao() > obj3.getAno_fabricacao()) {
            return obj;
        } else if (obj2.getAno_fabricacao() > obj.getAno_fabricacao() && obj2.getAno_fabricacao() > obj3.getAno_fabricacao()) {
            return obj2;
        } else if (obj3.getAno_fabricacao() > obj.getAno_fabricacao() && obj3.getAno_fabricacao() > obj2.getAno_fabricacao()) {
            return obj3;
        }
        return null;
    }

}
