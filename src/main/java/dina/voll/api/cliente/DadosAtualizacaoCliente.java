package dina.voll.api.cliente;

import jakarta.validation.constraints.NotNull;
import dina.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
