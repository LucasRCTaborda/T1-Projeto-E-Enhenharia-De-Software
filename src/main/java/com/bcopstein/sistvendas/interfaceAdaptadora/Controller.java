package com.bcopstein.sistvendas.interfaceAdaptadora;

import com.bcopstein.sistvendas.aplicacao.casosDeUso.BuscaUsuarariosUC;
import com.bcopstein.sistvendas.aplicacao.dtos.UsuarioTDO;
import com.bcopstein.sistvendas.dominio.modelos.UsuarioModel;
import com.bcopstein.sistvendas.persistencia.Usuario;
import com.bcopstein.sistvendas.persistencia.UsuarioJpa_itfRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    UsuarioJpa_itfRep jpaUser = null ;

    private BuscaUsuarariosUC userUC;


    @Autowired
    public Controller( BuscaUsuarariosUC userUC) {
        this.userUC = userUC;
    }

    @RequestMapping("/Controller")
    public String tester(){
        String msg = "oioioioioioioioiooioi";
        return msg;
    }

/*   Lista com todos os clientes cadastrador*/
    @RequestMapping(value = "/usuarios") // Corrigindo a sintaxe da anotação RequestMapping
    public List<UsuarioTDO> buscaUsuarios() {
return userUC.run();}
}
/* aplicativos cadastrados*/


/*post crie assinatura , retorna  */


/* atualiza o custo mensal do aplicativo post (custo) retorna cadastro completo dos aplicativos */

/*get crie um filtro que repassa todos os cadastro  e sub cadastros tipos ativos e tipos cancelados*/


/* get passa o (codigo do cliente ) e retorna o retorna as assinaturas do cliente e se estao ativas e canceladas */

/*      post faz pagamento  marca o (datatime) , (long codigo do cliente), ( valor pago e a data incicada)*/

/* assinaturas permanecentes ativas , (cod assinatura)*/