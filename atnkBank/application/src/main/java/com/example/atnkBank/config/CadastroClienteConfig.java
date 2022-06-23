package com.example.atnkBank.config;

import br.com.atnbk.cad.base.cadastro.domain.port.CadastroClienteRepository;
import br.com.atnbk.cad.base.cadastro.domain.service.CadastroClienteService;
import br.com.atnbk.cad.base.cadastro.domain.service.CadastroClienteServiceImpl;
import com.example.atnkBank.presentation.AberturaContaDigitalController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
public class CadastroClienteConfig {
    @Bean
    public CadastroClienteServiceImpl aberturaContaDigitalService(CadastroClienteRepository repository){
        return new CadastroClienteServiceImpl(repository);
    }

    @Bean
    public AberturaContaDigitalController aberturaContaDigitalService(CadastroClienteService service){
        return new AberturaContaDigitalController(service);
    }
}
