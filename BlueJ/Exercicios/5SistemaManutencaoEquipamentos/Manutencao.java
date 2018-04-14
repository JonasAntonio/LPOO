import java.util.ArrayList;

public class Manutencao
{
    private int numManutencao;
    private ArrayList<EquipamentoManutencao> equipamentos;
    
    public Manutencao(){
        equipamentos = new ArrayList<EquipamentoManutencao>();
    }
    
    public Manutencao(int numManutencao){
        this.setNumManutencao(numManutencao);
        equipamentos = new ArrayList<EquipamentoManutencao>();
    }
    
    public int getNumManutencao(){
        return this.numManutencao;
    }
    
    public void setNumManutencao(int numManutencao){
        this.numManutencao = numManutencao;
    }

    public void adicionarEquipamento(EquipamentoManutencao equipamento){
        this.equipamentos.add(equipamento);
    }
    
    public String dadosManutencao(){
        String dados = "";
        for(int i = 0; i < equipamentos.size(); i++){
            dados = " Numero: " + this.numManutencao + " Equipamento: " + this.equipamentos.get(i).tipoClasse() +
            " Mão de Obra: " + this.equipamentos.get(i).getValorMaoObra() +
            " Peças: " + this.equipamentos.get(i).getValorPecas();
        }
        return dados;
    }
}
