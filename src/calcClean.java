import java.io.*;

public class calcClean {

    

    public static void main(String[] args){
        BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
        try{
            Boolean noErro = true;
            String valorDigitado = "";
            Double fator1 = 0.0;
            Double fator2 = 0.0;
            Double resultado = 0.0;
            String operacao = "";

            while(noErro){
                System.out.println("Digite o primeiro numero:\n");
                valorDigitado = ent.readLine();
                try{
                    fator1 = Double.parseDouble(valorDigitado);
                    noErro = false;
                } catch (NumberFormatException err){
                    System.out.println("Numero Invalido, tente novamente!");
                }
            }

            noErro = true;
            while(noErro){                
                System.out.println("Digite o segundo numero:\n");
                valorDigitado = ent.readLine();
                
                try{
                    fator2 = Double.parseDouble(valorDigitado);
                    noErro = false;
                } catch (NumberFormatException err){
                    System.out.println("Numero Invalido, tente novamente!");
                }
            }

            noErro = true;
            while(noErro){                
                System.out.println("Digite a operacao [+,-,/,*]\n");
                valorDigitado = ent.readLine();
                operacao = valorDigitado;
               // if(((valorDigitado != "/") && (valorDigitado != "*") && (valorDigitado != "-") && (valorDigitado != "+")) == true){
                if(!operacao.equals("+") && !operacao.equals("*") && !operacao.equals("/") && !operacao.equals("-")){
                    System.out.println("Operacao Invalida, tente novamente!");
                }else{
                    noErro = false;
                }
                
            }

            switch (operacao) {
                case "/":
                    System.out.println("Dividindo " + fator1 + " por " + fator2 + "\n");
                    resultado = fator1 / fator2;
                    System.out.println("Resultado " + resultado + "\n");
                    break;
                
                case "*":
                    System.out.println("Multiplicando " + fator1 + " por " + fator2 + "\n");
                    resultado = fator1 * fator2;
                    System.out.println("Resultado " + resultado + "\n");
                    break;

                case "-":
                    System.out.println("Subritraindo " + fator2 + " de " + fator1 + "\n");
                    resultado = fator1 - fator2;
                    System.out.println("Resultado " + resultado + "\n");
                    break;
                
                case "+":
                    System.out.println("Somando " + fator2 + " a " + fator1 + "\n");
                    resultado = fator1 + fator2;
                    System.out.println("Resultado " + resultado + "\n");
                        break;

                default:
                    break;
            }
            
        } catch(IOException err){
            System.out.println("Erro: " + err);
        }
        
    }

}