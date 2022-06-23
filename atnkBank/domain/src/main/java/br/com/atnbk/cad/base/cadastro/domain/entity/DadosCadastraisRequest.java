package br.com.atnbk.cad.base.cadastro.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class DadosCadastraisRequest {
    private Long banco;
    private Long contaDigital;
    private String agencia;
    private String cpf;

}
