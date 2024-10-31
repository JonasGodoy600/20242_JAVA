    public class TesteCalculadora{
        public static void main (String[]args){
            var calc = new Calculadora();
            System.out.println(calc.somar(2, 3));
            System.out.println(calc.somarReais(5.5, 2.3));
            System.out.println(calc.somar("2","3"));
            System.out.println(calc.somar(1,2,3));
            System.out.println(calc.somar(2, "2"));
        }
    }

