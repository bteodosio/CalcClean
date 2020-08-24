public class operacoes {
    private String nomeOperacao;
    private String sinalOperacao;
    private String logOperacao;

    public void configurarLogOperacao(String log){
        logOperacao = log;
    }

    public String listarLogOperacao(){
        return logOperacao;
    }

    public void configurarSinalOperacao(String sinal){
        sinalOperacao = sinal;
    }

    public void configurarNome(String nome){
        nomeOperacao = nome;
    }

    public String listarNomeOperacao(){
        return nomeOperacao;
    }

    public String listarSinalOperacao(){
        return sinalOperacao;
    }

    public Double calcular(){
        Double resultado = 0.0;
        return resultado;
    }

    public Double calcular(Double ft1, Double ft2){
        Double resultado = 0.0;
        return resultado;
    }
}