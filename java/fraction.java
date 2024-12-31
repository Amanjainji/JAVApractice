package java;
public class fraction {

    public static int gcd(int n1,int n2){
        int min=Math.min(n1,n2);
        for(int i=min;i>=1;i--){
            if(n1%i==0 && n2%i==0 ){
                return i;
            }
        }
        return min;
    }
    public static class frac{
        int num;
        int den;

        public frac(){
        }

        public frac(int num,int den){  //constructor
            this.num=num;
            this.den=den;
        } 
        
        public void print(){
            System.out.println(num+"/"+den);
        } 
        
        public void simplify(){
            int HCF=gcd(num,den);
            if(HCF!=0){
                num/=HCF;
                den/=HCF;
            }
        }
    

        public frac add(frac f2){
            int numer= num*f2.den + f2.num*den;
            int denom= den*f2.den;

            frac f3=new frac(numer,denom);
            f3.simplify();
            return f3;
        } 

        public frac subtract(frac f2){
            int numer= num*f2.den - f2.num*den;
            int denom= den*f2.den;
    
            frac f3=new frac(numer,denom);
            f3.simplify();
            return f3;
        } 

        public frac mult(frac f2){
            int numer= num*f2.num;
            int denom= den*f2.den;
    
            frac f3=new frac(numer,denom);
            f3.simplify();
            return f3;
        } 

        public frac div(frac f2){
            int numer= num*f2.den;
            int denom= den*f2.num;
    
            frac f3=new frac(numer,denom);
            f3.simplify();
            return f3;
        } 

}

    public static void main(String args[]){
        frac f1=new frac(7,3);
        f1.print();
        frac f2=new frac(3,7);
        f2.print();

        frac f3=f1.add(f2);
        f3.print();

        frac f4=f1.subtract(f2);
        f4.print();

        frac f5=f1.mult(f2);
        f5.print();

        frac f6=f1.div(f2);
        f6.print();

        frac f7=new frac(14,21);
        f7.simplify();
        f7.print();

    } 
}
