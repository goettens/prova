package utfpr.ct.dainf.if62c.avaliacao;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
public class Complexo {
    private double real;
    private double img;

    public Complexo() {
    }

    public Complexo(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }   

    public double getImg() {
        return this.img;
    }
    
    public void setImg(double img) {
    this.img = img;
    }

    public Complexo soma(Complexo c) {
        return new Complexo(real + c.real, img + c.img);
    }
    
    public Complexo sub(Complexo c){
        return new Complexo(this.real - c.real, img - c.img);
    }

    public Complexo prod(double r){
        return new Complexo(r*this.real,r*this.img);
    }

    public Complexo prod(Complexo c){
        return new Complexo(((real*c.real) - (img*c.img)) , (img*c.real)-(real*c.img));
    }
    
    public Complexo div(Complexo c){
        return new Complexo(((real*c. real)+(img*c.img))/(Math.pow(c.real,2)+Math.pow(c.img,2)),((img*c.real)-(real*c.img))/(Math.pow(c.real,2)+Math.pow(c.img,2)));
    }
    
    public Complexo[] sqrt() {
        Complexo[] res = new Complexo[2];
        double r = Math.sqrt(Math.pow(real,2)+Math.pow(img, 2));
        double p = Math.sqrt(r);
        double oc = 0;
        if (real > 0){
            oc = Math.atan(img/real);
        }
        else if (real<0){
            oc = Math.atan(img/real)+Math.PI;
        }
        
        else if (real == 0 && img == 0){
            oc = 0;
        }
        
        else if (real == 0 && img > 0){
            oc = Math.PI/2;
        }
        else if(real == 0 && img < 0){
            oc = 3*Math.PI/2;
        }
        
        double v1 = oc/2;
        double v2 = oc/2 + Math.PI;
        
        res[0].setReal(Math.cos(v1));
        res[0].setImg(Math.sin(v1));
        res[1].setReal(Math.cos(v2));
        res[1].setImg(Math.sin(v2));
        
        res[0] = res[0].prod(p);
        res[1] = res[1].prod(p);
        
        return res;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (int) (Double.doubleToLongBits(real)
            ^ (Double.doubleToLongBits(real) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(img)
            ^ (Double.doubleToLongBits(img) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        final Complexo c = (Complexo) obj;
        return obj != null && getClass() == obj.getClass()
            && real == c.real && img == c.img;
    }

    @Override
    public String toString() {
        return String.format("%+f%+fi", real, img);
    }
}
