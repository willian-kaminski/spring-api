package com.kaminski.willian.springapi.service;

import com.kaminski.willian.springapi.models.PessoaEndereco;
import com.kaminski.willian.springapi.repository.PessoaEnderecoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Willian Kaminski
 * @since 28-09-19
 * @version 1.0
 */

@Service
public class PessoaEnderecoService {
 
    @Autowired
    private PessoaEnderecoRepository pessoaEnderecoRepository;
    
    public List<PessoaEndereco> getAllPessoasEnderecos(){
        return pessoaEnderecoRepository.findAll();
    }
    
    public PessoaEndereco getPessoasEnderecos(long id){
        return pessoaEnderecoRepository.findById(id);
    }
    
    public PessoaEndereco postPessoasEnderecos(PessoaEndereco pessoaEndereco){
        return pessoaEnderecoRepository.save(pessoaEndereco);
    }
    
    public void deletePessoasEnderecos(PessoaEndereco pessoaEndereco){
        pessoaEnderecoRepository.delete(pessoaEndereco);
    }
    
    public void deletePessoasEnderecos(long id){
        pessoaEnderecoRepository.deleteById(id);
    }
    
    public PessoaEndereco putPessoasEnderecos(PessoaEndereco pessoaEndereco){
        return pessoaEnderecoRepository.save(pessoaEndereco);
    }
}
