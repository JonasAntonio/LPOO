public class Pedido
{
    private PedidoEstado estado;
    
    public PedidoEstado getEstado(){
        return this.estado;
    }
    
    public void setEstado(PedidoEstado estado){
        this.estado = estado;
    }
    
    public String aprovar(){
        return this.estado.aprovar(this);
    }
    
    public String separar(){
        return this.estado.separar(this);
    }
    
    public String encaminhar(){
        return this.estado.encaminhar(this);
    }
    
    public String entregar(){
        return this.estado.entregar(this);
    }
    
    public String cancelar(){
            return this.estado.cancelar(this);
    }
}
