/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Random;



/**
 *
 * @author allan
 */


public class Pangramas {
    
    private String [] pangramaPt = {"Quem traz CD, LP, fax, engov e whisky JB?",
        "Jane quer LP, fax, CD, giz, TV e bom whisky",
        "TV faz quengo explodir com whisky JB",
        "Gafanhotos azuis celebram a pequena terra das jovens bruxas",
        "Um pequeno jabuti xereta viu dez cegonhas felizes"};//Pangramas em portugues
    private String [] pangramaEn = {"Jackdaws love my big sphinx of quartz",
        "Pack my box with five dozen liquor jugs",
        "A quick brown fox jumps over the lazy dog",
        "Xylophone wizard begets quick jive form",
        "Lazy movers quit hard packing of jewelry boxes"};//Pangramas em ingles
    private boolean tipoPangrama = false;//flag do tipo de pangrama : false = Portugues | true = Ingles
    
    
    public String getPangramaPt(){//captura o pangrama em portugues
        Random rand = new Random();
        return pangramaPt[rand.nextInt(5)];//retorna o pangrama randomizado
    }
    public String getPangramaEn(){//captura o pangrama em ingles    
        Random rand = new Random();
        return pangramaEn[rand.nextInt(5)];//retorna o pangrama randomizado
    }
    public int alterarTipoPangrama(int i){
        if(i==0){//0 para portugues - 1 para ingles
            if(!tipoPangrama){//verifica se o portugues ja esta selecionado
               return -1;//retorna valor para tratar a exceção
            }
            tipoPangrama = false;//habilita a flag para pangrama portugues
            return 0;//retorna o exito
        }
        //caso for ingles
        if(tipoPangrama){//verifica se o ingles esta selecionado
            return -1;//retorna valor para tratar a exceção
        }
        tipoPangrama = true;//habilita a flag para pangrama ingles
        return 1;//retorna o exito
    }
    
    public String carregarPangrama(){//carrega o pangrama com base na flag habilitada
        if(!tipoPangrama){//verifica a flag do pangrama cujo false = pt e true = en
            return getPangramaPt();
        }else{
            return getPangramaEn();
        }
    }
}