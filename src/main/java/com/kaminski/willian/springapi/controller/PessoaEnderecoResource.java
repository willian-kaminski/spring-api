package com.kaminski.willian.springapi.controller;

import com.kaminski.willian.springapi.models.PessoaEndereco;
import com.kaminski.willian.springapi.service.PessoaEnderecoService;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Willian Kaminski
 * @since 28-09-19
 * @version 1.0
 */

@RestController
@RequestMapping(value = "/api")
public class PessoaEnderecoResource {
    
    @Autowired
    PessoaEnderecoService pessoaEnderecoService;
    
    @GetMapping(value = "/pessoasEnderecos")
    @ApiOperation(value = "Retorna uma lista de Enderecos de Pessoas")
    public List<PessoaEndereco> listPesssoasEnderecos(){
        return pessoaEnderecoService.getAllPessoasEnderecos();
    }
    
    @GetMapping(value = "/pessoaEndereco/{id}")
    @ApiOperation(value = "Retorna um endereço unico")
    public PessoaEndereco listUnicPessoaEndereco(@PathVariable(value = "id") long id){
        return pessoaEnderecoService.getPessoasEnderecos(id); 
    }
    
    @PostMapping(value = "/pesssoaEndereco")
    @ApiOperation(value = "Salva um Endereco")
    public PessoaEndereco savePessoaEndereco(@RequestBody PessoaEndereco pessoaEndereco){ 
        return pessoaEnderecoService.postPessoasEnderecos(pessoaEndereco);
    }
    
    @DeleteMapping(value = "/pessoaEndereco")
    @ApiOperation(value = "Deleta um Endereco")
    public void deletePessoaEndereco(@RequestBody PessoaEndereco pessoaEndereco){
        pessoaEnderecoService.deletePessoasEnderecos(pessoaEndereco);
    }
    
    @DeleteMapping(value = "/pessoaEndereco/{id}")
    @ApiOperation(value = "Deleta um endereco com base no seu Id")
    public void deletePessoaEndereco(@PathVariable(value = "id") long id){
        pessoaEnderecoService.deletePessoasEnderecos(id);
    }
    
    @PutMapping(value = "/pessoaEndereco")
    @ApiOperation(value = "Atualiza os dados do Endereco")
    public PessoaEndereco putPais(@RequestBody PessoaEndereco pessoaEndereco){
        return pessoaEnderecoService.putPessoasEnderecos(pessoaEndereco);
    }
}
