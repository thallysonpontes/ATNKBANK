package br.com.atnbk.cad.base.cadastro.domain.service;

import br.com.atnbk.cad.base.cadastro.domain.entity.DadosCadastraisRequest;
import br.com.atnbk.cad.base.cadastro.domain.port.CadastroClienteRepository;

public class CadastroClienteServiceImpl implements CadastroClienteService{


    private final CadastroClienteRepository cadastroClienteRepository;

    public CadastroClienteServiceImpl(CadastroClienteRepository cadastroClienteRepository) {
        this.cadastroClienteRepository = cadastroClienteRepository;
    }


    @Override
    public void cadastroCliente(DadosCadastraisRequest dadosCadastraisRequest) {
        cadastroClienteRepository.incluiCliente(dadosCadastraisRequest);
    }
}
