public interface PedidoEstado
{
    public String aprovar(Pedido pedido);
    public String separar(Pedido pedido);
    public String encaminhar(Pedido pedido);
    public String entregar(Pedido pedido);
    public String cancelar(Pedido pedido);
}
