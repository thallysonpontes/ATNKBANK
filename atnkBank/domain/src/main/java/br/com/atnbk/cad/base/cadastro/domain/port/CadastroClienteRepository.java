package br.com.atnbk.cad.base.cadastro.domain.port;

import br.com.atnbk.cad.base.cadastro.domain.entity.DadosCadastraisRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroClienteRepository {
    void incluiCliente(DadosCadastraisRequest dadosCadastraisRequest);
}
