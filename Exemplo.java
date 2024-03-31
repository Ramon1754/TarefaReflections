public class Exemplo {

    public static void main(String args[]) throws Exception {
        Exemplo exemplo = new Exemplo();
        exemplo.processarDadosClientes();
        exemplo.processarDadosPedidos();
    }

    @Tabela(nome = "Cliente")
    public void processarDadosClientes() throws NoSuchMethodException {

        Tabela tabela = this.getClass().getMethod("processarDadosClientes").getAnnotation(Tabela.class);
        if (tabela != null) {
            System.out.println("Nome da tabela" + tabela.nome());
        }
        System.out.println("Processando dados da tabela Clientes...");
    }

    @Tabela(nome = "Pedidos")
    public void processarDadosPedidos() throws NoSuchMethodException {
       Tabela tabela = this.getClass().getMethod("processarDadosPedidos").getAnnotation(Tabela.class);
       if (tabela != null) {
           System.out.println("Nome da tabela" + tabela.nome());
       }
       System.out.println("Processando dados da tabela Pedidos...");
    }

}
