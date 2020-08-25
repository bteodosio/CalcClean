public class calcClean {
    private static calculoOperacao operacao = new calculoOperacao();
    private static interfaceCalc console = new interfaceCalc();

    private static void receberPrimeiroOperador(){
        System.out.println("Digite o primeiro numero:\n");
        while(!operacao.configurarOperador(console.receberOperador(), 1)){
            System.out.println("Numero invalido!");
            System.out.println("Digite o primeiro numero:\n");
        }
    }

    private static void receberSegundoOperador(){
        System.out.println("Digite o segundo numero:\n");
        while(!operacao.configurarOperador(console.receberOperador(), 2)){
            System.out.println("Numero invalido!");
            System.out.println("Digite o segundo numero:\n");
        }
    }

    private static void receberOperacao(){
        System.out.println("Digite a Operacao: ["+ operacao.listarOperacoes() +"]\n");
        while(!operacao.configurarOperacao(console.receberOperacao())){
            System.out.println("Operacao Invalida!");
            System.out.println("Digite a Operacao: ["+ operacao.listarOperacoes() +"]\n");
        }
    }

    private static void adicionarOperacoesEspeciais(){
        operacoes opEspecial;

        opEspecial = new operacoes(){
            public Double calcular(Double fator1, Double fator2){
                return Math.pow(fator1, fator2);
            }
        };

        opEspecial.configurarNome("Potencia");
        opEspecial.configurarSinalOperacao("^");
        opEspecial.configurarLogOperacao("Elevando o numero:");
        operacao.cadastrarOperacao(opEspecial);

        opEspecial = new operacoes(){
            public Double calcular(Double fator1, Double fator2){
                return Math.sqrt(fator1);
            }
        };

        opEspecial.configurarNome("Raiz");
        opEspecial.configurarSinalOperacao("sqrt");
        opEspecial.configurarLogOperacao("Raiz Quadrado do numero:");
        operacao.cadastrarOperacao(opEspecial);

    }

    public static void main(String[] args){
        operacao.cadastrarOperacoesBasicas();
        adicionarOperacoesEspeciais();
        receberPrimeiroOperador();
        receberOperacao();
        receberSegundoOperador();
        operacao.calcularOperacao();
        operacao.listarLogOperacao();
        System.out.println("Resultado " + operacao.listarResultado() + "\n");
    }

}