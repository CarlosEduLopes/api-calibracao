package dina.voll.api.cliente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import dina.voll.api.endereco.DadosEndereco;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String cnpj,
        @NotNull
        Equipamento equipamento,

        @NotNull @Valid DadosEndereco endereco) {
}
