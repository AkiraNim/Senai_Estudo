
package atividadesSenaiJavaAula07;

public class Calculadora {
    private int number1, number2, result;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void sum(){
        this.setResult(this.getNumber1()+this.getNumber2());
    }
    public void subtraction(){
        this.setResult(this.getNumber1()-this.getNumber2());
    }
     public void multiplication(){
        this.setResult(this.getNumber1()*this.getNumber2());
    }
      public void division(){
        this.setResult(this.getNumber1()/this.getNumber2());
    }
}
