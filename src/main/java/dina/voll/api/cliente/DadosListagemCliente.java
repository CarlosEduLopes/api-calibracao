package dina.voll.api.cliente;

public record DadosListagemCliente(Long id, String nome, String email, String cnpj, Equipamento equipamento) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getId(), cliente.getNome(), cliente.getEmail(), cliente.getCnpj(), cliente.getEquipamento());
    }

}
