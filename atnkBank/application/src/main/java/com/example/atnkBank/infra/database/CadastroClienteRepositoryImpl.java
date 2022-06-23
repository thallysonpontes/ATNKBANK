package com.example.atnkBank.infra.database;

import br.com.atnbk.cad.base.cadastro.domain.entity.DadosCadastraisRequest;
import br.com.atnbk.cad.base.cadastro.domain.port.CadastroClienteRepository;
import org.jdbi.v3.sqlobject.customizer.BindBean;
import org.jdbi.v3.sqlobject.locator.UseClasspathSqlLocator;
import org.jdbi.v3.sqlobject.statement.GetGeneratedKeys;
import org.jdbi.v3.sqlobject.statement.SqlUpdate;
import org.springframework.stereotype.Repository;

@Repository
@UseClasspathSqlLocator
public interface CadastroClienteRepositoryImpl extends CadastroClienteRepository {

    @SqlUpdate
    @Override
    @GetGeneratedKeys
    void incluiCliente(@BindBean DadosCadastraisRequest dadosCadastraisRequest);
}
