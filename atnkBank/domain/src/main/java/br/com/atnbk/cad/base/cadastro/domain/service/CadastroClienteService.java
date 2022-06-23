package br.com.atnbk.cad.base.cadastro.domain.service;

import br.com.atnbk.cad.base.cadastro.domain.entity.DadosCadastraisRequest;
import org.springframework.stereotype.Service;

@Service
public interface CadastroClienteService {
    void cadastroCliente(DadosCadastraisRequest representationToObject);
}
