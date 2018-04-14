public class PedidoEstadoCancelado implements PedidoEstado
{
    public String aprovar(Pedido pedido){
        return "Pedido cancelado nao pode ser aprovado";
    }
    
    public String separar(Pedido pedido){
        return "Pedido entregue nao pode ser separado";
    }
    
    public String encaminhar(Pedido pedido){
        return "Pedido entregue nao pode ser encaminhado";
    }
    
    public String entregar(Pedido pedido){
        return "Pedido entregue nao pode ser entregue";
    }
    
    public String cancelar(Pedido pedido){
        return "Pedido entregue nao pode ser aprovado";
    }
}
