public class A {
    private int a;
    private int b;

    public int suma(){
        return a+b;
    }
    public int resta(){
        return a-b;
    }
    public int multiplicacion(){
        return a*b;
    }
    public int division(){
        try{
            return a/b;
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0");
        }
    }
    public int potencia(){
        return a^b;
    }
    public int sumaCuadrados(){
        return a^2+b^2;
    }
}
