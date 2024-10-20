public class Adder {
    private int a;
    private int b;

    public int add(int a,int b){
        return a + b;
    }
    public int addntimes(int a,int b, int n){
        int i = 0;
        int sum = 0;
        while(i < n){
            sum = sum + (a+b);
            i++;
        }
        return sum;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public int getA() {
        return a;
    }
}
