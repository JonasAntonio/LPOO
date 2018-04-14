public class PedidoEstadoEncaminhado implements PedidoEstado
{
    public String aprovar(Pedido pedido){
        return "Pedido encaminhado nao pode ser aprovado";
    }
    
    public String separar(Pedido pedido){
        return "Pedido encaminhado nao pode ser separado";
    }
    
    public String encaminhar(Pedido pedido){
        return "Pedido encaminhado nao pode ser encaminhado";
    }
    
    public String entregar(Pedido pedido){
        pedido.setEstado(new PedidoEstadoEntregue());
        return "Pedido encaminhado pode ser entregue";
    }
    
    public String cancelar(Pedido pedido){
        pedido.setEstado(new PedidoEstadoCancelado());
        return "Pedido encaminhado pode ser cancelado";
    }
}
