package com.example.atnkBank.mapper;

import br.com.atnbk.cad.base.cadastro.domain.entity.DadosCadastraisRequest;
import br.com.atnkBank.cad.base.abertura.provider.presentation.representation.DadosCadastraisRepresentation;

public class CadastroClienteMapper {
    public static DadosCadastraisRequest representationToObject(DadosCadastraisRepresentation cliente) {
        return DadosCadastraisRequest.builder().build();

    }
}
