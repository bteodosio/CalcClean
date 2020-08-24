import java.util.ArrayList;
import java.util.List;

public class calculoOperacao {
    private Double primeiroOperador;
    private Double segundoOperador;
    private Double resultadoCalculo = 0.0;
    private operacoes identificadorOperacao;
    private String operacoesValidas = "";
    private List<operacoes> opCadastrada = new ArrayList<operacoes>();

    public void cadastrarOperacao(operacoes novaOp){
        opCadastrada.add(novaOp);
    }

    public void cadastrarOperacoesBasicas(){
        operacoes opSoma = new operacoes(){
            public Double calcular(Double fator1, Double fator2){
                return fator1 + fator2;
            }
        };
        opSoma.configurarNome("Soma");
        opSoma.configurarSinalOperacao("+");
        this.cadastrarOperacao(opSoma);

        operacoes opSub = new operacoes(){
            public Double calcular(Double fator1, Double fator2){
                return fator1 - fator2;
            }
        };
        opSub.configurarNome("Subtracao");
        opSub.configurarSinalOperacao("-");
        this.cadastrarOperacao(opSub);

        operacoes opDiv = new operacoes(){
            public Double calcular(Double fator1, Double fator2){
                return fator1 / fator2;
            }
        };
        opDiv.configurarNome("Divisao");
        opDiv.configurarSinalOperacao("/");
        this.cadastrarOperacao(opDiv);

        operacoes opMult = new operacoes(){
            public Double calcular(Double fator1, Double fator2){
                return fator1 * fator2;
            }
        };
        opMult.configurarNome("Multiplicacao");
        opMult.configurarSinalOperacao("*");
        this.cadastrarOperacao(opMult);
    }

    public String listarOperacoes(){
        operacoesValidas = "";
        for(operacoes op : opCadastrada){
            operacoesValidas += op.listarSinalOperacao()+",";
        }
        operacoesValidas = operacoesValidas.substring(0, operacoesValidas.length()-1);
        return operacoesValidas;
    }

    public Boolean configurarOperador(Double operador, Integer numOperador){
        Boolean valorConfigurado = false;

        if(operador != null){
            if(numOperador == 1){
                valorConfigurado = true;
                primeiroOperador = operador;
            }else if(numOperador == 2){
                valorConfigurado = true;
                segundoOperador = operador;
            }
        }

        return valorConfigurado;
    }

    public Boolean configurarOperacao(String operador){
        Boolean valorConfigurado = false;

        for(operacoes op : opCadastrada){
            if(operador.equals(op.listarSinalOperacao())){
                valorConfigurado = true;
                identificadorOperacao = op;
            }
        }

        return valorConfigurado;
    }

    public String listarLogOperacao() {
        return identificadorOperacao.listarLogOperacao();
    }
    
    public Double listarResultado() {
        return resultadoCalculo;
    }

    public void calcularOperacao(){
        resultadoCalculo = identificadorOperacao.calcular(primeiroOperador,segundoOperador);          
    }
}