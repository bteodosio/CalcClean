import java.io.*;

public class calcClean {
    private static BufferedReader entradaConsole = new BufferedReader(new InputStreamReader(System.in));

    private static Double recebeDouble (){

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

    private static Double recebeOperador(Integer numOp){
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

    private static String recebeOperacao(String operacoesValidas){
        String identificadorOperacao = "";
           
        System.out.println("Digite a Operacao: ["+ operacoesValidas +"]\n");
        try{
            identificadorOperacao = entradaConsole.readLine();
        }catch(IOException err){
            System.out.println("Operacao Invalida!");
        }

        return identificadorOperacao;
    }

    public static void main(String[] args){
        calculoOperacao operacao = new calculoOperacao();

        operacao.primeiroOperador = recebeOperador(1);
        while(!operacao.configurarOperador(recebeOperacao(operacao.listarOperacoes()))){}
        operacao.segundoOperador = recebeOperador(2);
        System.out.println("Resultado " + operacao.calcularOperacao() + "\n");

    }

}