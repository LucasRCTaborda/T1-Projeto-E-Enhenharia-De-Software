package com.bcopstein.sistvendas.interfaceAdaptadora;

import com.bcopstein.sistvendas.aplicacao.casosDeUso.BuscaUsuarariosUC;
import com.bcopstein.sistvendas.aplicacao.casosDeUso.ListaAplicativosUC;
import com.bcopstein.sistvendas.aplicacao.dtos.AplicativoTDO;
import com.bcopstein.sistvendas.aplicacao.dtos.UsuarioTDO;
import com.bcopstein.sistvendas.persistencia.UsuarioJpa_itfRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    UsuarioJpa_itfRep jpaUser = null ;
    private BuscaUsuarariosUC userUC;
    private ListaAplicativosUC aplicativoUC ;


    @Autowired
    public Controller(BuscaUsuarariosUC userUC, ListaAplicativosUC aplicativoUC) {
        this.userUC = userUC;
        this.aplicativoUC=aplicativoUC;
    }

    @RequestMapping("/Controller")
    public String tester(){
        String msg = "oioioioioioioioiooioi";

        return msg;
    }

/*   Lista com todos os clientes cadastrador*/
@GetMapping("/usuarios")
public List<UsuarioTDO> buscaUsuarios() {
    return userUC.run();
}


/* aplicativos cadastrados*/
@GetMapping("/aplicativos")
public List<AplicativoTDO> buscaAplicativos() {
    return aplicativoUC.run(); }



    // Endpoint para criar uma assinatura
    @PostMapping("/assinatura")
    public String criarAssinatura() {
        // Implemente a lógica para criar uma assinatura
        return "Assinatura criada com sucesso";
    }




    // Endpoint para atualizar o custo mensal do aplicativo
    @PostMapping("/atualizar-custo-aplicativo")
    public String atualizarCustoAplicativo(@RequestParam("custo") double custo) {
        // Implemente a lógica para atualizar o custo mensal do aplicativo
        return "Custo do aplicativo atualizado com sucesso";
    }






    // Endpoint para obter todos os cadastros e subcadastros ativos e cancelados
    @GetMapping("/cadastros")
    public String getCadastros() {
        // Implemente a lógica para obter todos os cadastros
        return "Lista de todos os cadastros e subcadastros ativos e cancelados";
    }

    // Endpoint para obter as assinaturas de um cliente por código
    @GetMapping("/assinaturas-cliente")
    public String getAssinaturasCliente(@RequestParam("codigoCliente") long codigoCliente) {
        // Implemente a lógica para obter as assinaturas de um cliente
        return "Lista de assinaturas do cliente " + codigoCliente;
    }

    // Endpoint para fazer um pagamento
    @PostMapping("/pagamento")
    public String fazerPagamento(@RequestParam("codigoCliente") long codigoCliente,
                                 @RequestParam("valorPago") double valorPago,
                                 @RequestParam("dataPagamento") String dataPagamento) {
        // Implemente a lógica para fazer um pagamento
        return "Pagamento realizado com sucesso";
    }

    // Endpoint para obter assinaturas permanentes ativas por código de assinatura
    @GetMapping("/assinaturas-ativas")
    public String getAssinaturasAtivas(@RequestParam("codAssinatura") long codAssinatura) {
        // Implemente a lógica para obter assinaturas permanentes ativas
        return "Lista de assinaturas permanentes ativas para o código de assinatura " + codAssinatura;
    }}