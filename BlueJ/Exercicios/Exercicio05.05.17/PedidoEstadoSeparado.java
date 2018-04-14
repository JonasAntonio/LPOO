public class PedidoEstadoSeparado implements PedidoEstado
{
    public String aprovar(Pedido pedido){
        return "Pedido separado nao pode ser aprovado";
    }
    
    public String separar(Pedido pedido){
        return "Pedido separado nao pode ser separado";
    }
    
    public String encaminhar(Pedido pedido){
        pedido.setEstado(new PedidoEstadoEncaminhado());
        return "Pedido separado pode ser encaminhado";
    }
    
    public String entregar(Pedido pedido){
        return "Pedido separado nao pode ser entregue";
    }
    
    public String cancelar(Pedido pedido){
        pedido.setEstado(new PedidoEstadoCancelado());
        return "Pedido separado pode ser cancelado";
    }
}
