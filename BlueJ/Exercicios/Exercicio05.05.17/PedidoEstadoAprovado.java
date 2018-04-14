public class PedidoEstadoAprovado implements PedidoEstado
{   
    public String aprovar(Pedido pedido){
        return "Pedido aprovado nao pode ser aprovado";
    }
    
    public String separar(Pedido pedido){
        pedido.setEstado(new PedidoEstadoSeparado());
        return "Pedido aprovado pode ser separado";
    }
    
    public String encaminhar(Pedido pedido){
        return "Pedido aprovado nao pode ser encaminhado";
    }
    
    public String entregar(Pedido pedido){
        return "Pedido aprovado nao pode ser entregue";
    }
    
    public String cancelar(Pedido pedido){
        pedido.setEstado(new PedidoEstadoCancelado());
        return "Pedido aprovado pode ser cancelado";
    }
}
