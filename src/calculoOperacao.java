public class calculoOperacao {
    private Double primeiroOperador;
    private Double segundoOperador;
    private String identificadorOperacao;
    private String operacoesValidas = "+,-,/,*";

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

    public Double calcularOperacao(){
        Double resultadoOperacao = 0.0;

        switch (identificadorOperacao) {
            case "/":
                System.out.println("Dividindo " + primeiroOperador + " por " + segundoOperador + "\n");
                resultadoOperacao = primeiroOperador / segundoOperador;
                break;
            
            case "*":
                System.out.println("Multiplicando " + primeiroOperador + " por " + segundoOperador + "\n");
                resultadoOperacao = primeiroOperador * segundoOperador;
                break;

            case "-":
                System.out.println("Subritraindo " + segundoOperador + " de " + primeiroOperador + "\n");
                resultadoOperacao = primeiroOperador - segundoOperador;
                break;
            
            case "+":
                System.out.println("Somando " + segundoOperador + " a " + primeiroOperador + "\n");
                resultadoOperacao = primeiroOperador + segundoOperador;
                    break;

            default:
                break;
        }

        return resultadoOperacao;
    }
}