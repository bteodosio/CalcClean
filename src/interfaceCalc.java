import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class InterfaceCalc {
    private BufferedReader entradaConsole = new BufferedReader(new InputStreamReader(System.in));

    public Double receberOperador(){
        Double operador = 0.0;
        
        try{
            operador = Double.parseDouble(entradaConsole.readLine().replace(',', '.'));
        } catch (NumberFormatException err){
            return null;
        } catch (IOException err){
            return null;
        };

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