package sobrecarga_de_metodos;
public class Calculadora {
        public int somar(int a, int b){
            return a + b;
        }
        
        int somar(String a, String b){
            var ai = Integer.parseInt(a);
            var bi = Integer.parseInt(b);
            return ai + bi;
        }

        // public double somar(String a, String b){
        //     return Double.parseDouble(a) + Double.parseDouble(b);
        // }
        public double somarReais(double a, double b){
            return a + b;
        }
        public int somar(int a, int b, int c){
            return a + b + c;
        }

        public int somar(int a, String b){
            return somar(a, Integer.parseInt(b));
        }
        public int somar(String a, int b){
            return somar(b, a);
        }
    }

