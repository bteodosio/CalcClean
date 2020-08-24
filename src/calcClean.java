import java.io.*;

public class calcClean {
    static BufferedReader entradaConsole = new BufferedReader(new InputStreamReader(System.in));

    public static Double recebeDouble (){

        Double valorDouble = 0.0;
        try{
            valorDouble = Double.parseDouble(entradaConsole.readLine());
        } catch (NumberFormatException err){
            return null;
        } catch (IOException err){
            return null;
        }

        return valorDouble;
    }

    public static Double recebeOperador(Integer numOp){
        Boolean valorIncorreto = true;
        Double operador = 0.0;

        while(valorIncorreto){
            if(numOp == 1){
                System.out.println("Digite o primeiro numero:\n");
            }else{
                System.out.println("Digite o segundo numero:\n");
            }
            operador = recebeDouble();
            if(operador != null){
                valorIncorreto = false;
            }else {
                System.out.println("Numero Invalido!");
            }
        }

        return operador;
    }

    public static String recebeOperacao(){
        String identificadorOperacao = "";
        Boolean valorIncorreto = true;

        valorIncorreto = true;
        while(valorIncorreto){                
            System.out.println("Digite a identificadorOperacao [+,-,/,*]\n");
            try{
                identificadorOperacao = entradaConsole.readLine();
            }catch(IOException err){
                System.out.println("Operacao Invalida!");
            }

            if(!identificadorOperacao.equals("+") && !identificadorOperacao.equals("*") && !identificadorOperacao.equals("/") && !identificadorOperacao.equals("-")){
                System.out.println("Operacao Invalida!");
            }else{
                valorIncorreto = false;
            }
            
        }

        return identificadorOperacao;
    }

    public static Double calculaOperacao(Double fator1, Double fator2, String Operacao){
        Double resultadoOperacao = 0.0;

        switch (Operacao) {
            case "/":
                System.out.println("Dividindo " + fator1 + " por " + fator2 + "\n");
                resultadoOperacao = fator1 / fator2;
                break;
            
            case "*":
                System.out.println("Multiplicando " + fator1 + " por " + fator2 + "\n");
                resultadoOperacao = fator1 * fator2;
                break;

            case "-":
                System.out.println("Subritraindo " + fator2 + " de " + fator1 + "\n");
                resultadoOperacao = fator1 - fator2;
                break;
            
            case "+":
                System.out.println("Somando " + fator2 + " a " + fator1 + "\n");
                resultadoOperacao = fator1 + fator2;
                    break;

            default:
                break;
        }

        return resultadoOperacao;
    }

    public static void main(String[] args){
                  
        Double fatorOperacao1 = 0.0;
        Double fatorOperacao2 = 0.0;
        Double resultadoOperacao = 0.0;
        String identificadorOperacao = "";

        fatorOperacao1 = recebeOperador(1);
        identificadorOperacao = recebeOperacao();
        fatorOperacao2 = recebeOperador(2);
        resultadoOperacao = calculaOperacao(fatorOperacao1, fatorOperacao2, identificadorOperacao);
        System.out.println("Resultado " + resultadoOperacao + "\n");
        
    }

}