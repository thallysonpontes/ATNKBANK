package com.example.atnkBank.presentation;

import br.com.atnbk.cad.base.cadastro.domain.service.CadastroClienteService;
import br.com.atnbk.cad.base.cadastro.domain.service.CadastroClienteServiceImpl;
import br.com.atnkBank.cad.base.abertura.provider.presentation.representation.DadosCadastraisRepresentation;
import com.example.atnkBank.mapper.CadastroClienteMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
@RequestMapping("V1")
public class AberturaContaDigitalController implements br.com.atnkbank.cad.base.abertura.provider.api.ClienteApi {


    private final CadastroClienteService cadastroClienteService;

    @Override
    public ResponseEntity<Void> cadastraCliente(DadosCadastraisRepresentation cliente) {
         cadastroClienteService.cadastroCliente(CadastroClienteMapper.representationToObject(cliente));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
