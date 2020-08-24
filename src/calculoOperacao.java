public class calculoOperacao {
    private Double primeiroOperador;
    private Double segundoOperador;
    private Double resultadoCalculo = 0.0;
    private String identificadorOperacao;
    private String operacoesValidas = "+,-,/,*";
    private String logOperacao = "";

    public String listarOperacoes(){
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

        if(operador.equals("+") || operador.equals("*") || operador.equals("/") || operador.equals("-")){
            valorConfigurado = true;
            identificadorOperacao = operador;
        }

        return valorConfigurado;
    }

    public String listarLogOperacao() {
        return logOperacao;
    }
    
    public Double listarResultado() {
        return resultadoCalculo;
    }

    public void calcularOperacao(){
        switch (identificadorOperacao) {
            case "/":
                logOperacao = "Dividindo " + primeiroOperador + " por " + segundoOperador + "\n";
                resultadoCalculo = primeiroOperador / segundoOperador;
                break;
            
            case "*":
                logOperacao = "Multiplicando " + primeiroOperador + " por " + segundoOperador + "\n";
                resultadoCalculo = primeiroOperador * segundoOperador;
                break;

            case "-":
                logOperacao = "Subritraindo " + segundoOperador + " de " + primeiroOperador + "\n";
                resultadoCalculo = primeiroOperador - segundoOperador;
                break;
            
            case "+":
                logOperacao = "Somando " + segundoOperador + " a " + primeiroOperador + "\n";
                resultadoCalculo = primeiroOperador + segundoOperador;
                    break;

            default:
                break;
        }
    }
}