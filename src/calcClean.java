import java.io.*;

public class calcClean {

    

    public static void main(String[] args){
        BufferedReader entradaConsole = new BufferedReader(new InputStreamReader(System.in));
        try{
            Boolean valorIncorreto = true;
            Double fatorOperacao1 = 0.0;
            Double fatorOperacao2 = 0.0;
            Double resultadoOperacao = 0.0;
            String identificadorOperacao = "";

            while(valorIncorreto){
                System.out.println("Digite o primeiro numero:\n");
                try{
                    fatorOperacao1 = Double.parseDouble(entradaConsole.readLine());
                    valorIncorreto = false;
                } catch (NumberFormatException err){
                    System.out.println("Numero Invalido, tente novamente!");
                }
            }

            valorIncorreto = true;
            while(valorIncorreto){                
                System.out.println("Digite a identificadorOperacao [+,-,/,*]\n");
                identificadorOperacao = entradaConsole.readLine();
                if(!identificadorOperacao.equals("+") && !identificadorOperacao.equals("*") && !identificadorOperacao.equals("/") && !identificadorOperacao.equals("-")){
                    System.out.println("Operacao Invalida, tente novamente!");
                }else{
                    valorIncorreto = false;
                }
                
            }

            valorIncorreto = true;
            while(valorIncorreto){                
                System.out.println("Digite o segundo numero:\n");
                try{
                    fatorOperacao2 = Double.parseDouble(entradaConsole.readLine());
                    valorIncorreto = false;
                } catch (NumberFormatException err){
                    System.out.println("Numero Invalido, tente novamente!");
                }
            }

            switch (identificadorOperacao) {
                case "/":
                    System.out.println("Dividindo " + fatorOperacao1 + " por " + fatorOperacao2 + "\n");
                    resultadoOperacao = fatorOperacao1 / fatorOperacao2;
                    System.out.println("Resultado " + resultadoOperacao + "\n");
                    break;
                
                case "*":
                    System.out.println("Multiplicando " + fatorOperacao1 + " por " + fatorOperacao2 + "\n");
                    resultadoOperacao = fatorOperacao1 * fatorOperacao2;
                    System.out.println("Resultado " + resultadoOperacao + "\n");
                    break;

                case "-":
                    System.out.println("Subritraindo " + fatorOperacao2 + " de " + fatorOperacao1 + "\n");
                    resultadoOperacao = fatorOperacao1 - fatorOperacao2;
                    System.out.println("Resultado " + resultadoOperacao + "\n");
                    break;
                
                case "+":
                    System.out.println("Somando " + fatorOperacao2 + " a " + fatorOperacao1 + "\n");
                    resultadoOperacao = fatorOperacao1 + fatorOperacao2;
                    System.out.println("Resultado " + resultadoOperacao + "\n");
                        break;

                default:
                    break;
            }
            
        } catch(IOException err){
            System.out.println("Erro: " + err);
        }
        
    }

}