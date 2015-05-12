/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author José Guilherme da Costa Goetten
 */
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

public class Avaliacao1 {

    public static void main(String[] args) {
        
        
        
    }
    
    public static Complexo[] raizesEquacao(Complexo a, Complexo b, Complexo c){
        Complexo[] res = new Complexo[2];
        res[0] = (b.prod(-1).soma((b.prod(b).soma(a.prod(c).prod(-4))).sqrt()[0]).div(a.prod(2)));
        res[1] = (b.prod(-1).soma((b.prod(b).soma(a.prod(c).prod(-4))).sqrt()[1]).div(a.prod(2)));
        return res;
    }
    
}
