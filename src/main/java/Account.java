public class Account {
    private double a;
    private double b;
    private double c;
    public Account(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getA(){
        return this.a;
    }
    double getB(){
        return this.b;
    }
    double getC(){
        return this.c;
    }
    double getDiscriminant(){
        return b*b - (4*a*c);
    }
    double getRoot1(){
        return (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
    }
    double getRoot2(){
        return (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
    }
}
