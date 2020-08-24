import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class interfaceCalc {
    private BufferedReader entradaConsole = new BufferedReader(new InputStreamReader(System.in));

    private Double receberDouble (){

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

    public Double receberOperador(){
        Double operador = 0.0;
        
        operador = receberDouble();

        return operador;
    }

    public String receberOperacao(){
        String identificadorOperacao = "";
           
        try{
            identificadorOperacao = entradaConsole.readLine();
        }catch(IOException err){
        }

        return identificadorOperacao;
    }

}