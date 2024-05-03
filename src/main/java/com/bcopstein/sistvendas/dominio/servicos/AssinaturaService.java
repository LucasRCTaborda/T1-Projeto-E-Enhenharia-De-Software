package com.bcopstein.sistvendas.dominio.servicos;

import com.bcopstein.sistvendas.dominio.modelos.AplicativoModel;
import com.bcopstein.sistvendas.dominio.modelos.AssinaturaModel;
import com.bcopstein.sistvendas.dominio.modelos.ClienteModel;
import com.bcopstein.sistvendas.dominio.modelos.StatusATIVO;
import com.bcopstein.sistvendas.persistencia.*;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AssinaturaService {

    private long codigo;
    private Date inicioVigencia;
    private Date fimVigencia;

    private ClienteModel cliente;
    private AplicativoModel aplicativo;

    private StatusATIVO statusATIVO;

    public AssinaturaService(long codigo) {
        this.codigo = codigo;
    }

    public AssinaturaService(long codigo, ClienteModel cliente, AplicativoModel aplicativo, Date inicioVigencia, Date fimVigencia, StatusATIVO statusATIVO) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.aplicativo = aplicativo;
        this.inicioVigencia = inicioVigencia;
        this.fimVigencia = fimVigencia;
        this.statusATIVO = statusATIVO;
    }

    public AssinaturaService() {
    }

    public StatusATIVO getStatusATIVO() {
        return statusATIVO;
    }

    public long getCodigo() {
        return codigo;
    }

    public Date getInicioVigencia() {
        return inicioVigencia;
    }

    public Date getFimVigencia() {
        return fimVigencia;
    }

    public ClienteModel getCliente() {
        return cliente;
    }

    public AplicativoModel getAplicativo() {
        return aplicativo;
    }

    public void setInicioVigencia(Date inicioVigencia) {
        this.inicioVigencia = inicioVigencia;
    }

    public void setFimVigencia(Date fimVigencia) {
        this.fimVigencia = fimVigencia;
    }

    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }

    public void setAplicativo(AplicativoModel aplicativo) {
        this.aplicativo = aplicativo;
    }

    public void setStatusATIVO(StatusATIVO statusATIVO) {
        this.statusATIVO = statusATIVO;
    }

    public AssinaturaModel criarAssinaturaComClienteEAplicativo(long clientex, long aplicativox) {
        ClienteModel cliente ;
        AplicativoModel aplicativo;
        ClienteRepJpa jpaCli = null;
        AplicativoRepJpa jpaApp=null;

        cliente=jpaCli.consultaPorId(clientex);
        aplicativo= jpaApp.consultaPorId(aplicativox);

        Assinatura assinatura = new Assinatura();

        assinatura.setCliente(fromClienteModel(cliente));

        assinatura.setAplicativo(fromAplicativoModel(aplicativo));

         toAplicativoModel(assinatura);

        Date inicio = new Date();
        Date fim = adicionarDias(inicio, 30);
        assinatura.setInicio_vigencia(inicio);
        assinatura.setFim_vigencia(fim);


        return   toAplicativoModel(assinatura);
    }


    public static AssinaturaModel toAplicativoModel(Assinatura assinatura) {
        Cliente cliente = assinatura.getCliente();
        Aplicativo aplicativo = assinatura.getAplicativo();

        return new AssinaturaModel(
                assinatura.getCodigo(),
                cliente.getcodigo(),
                aplicativo.getCodigo(),
                assinatura.getInicio_vigencia(),
                assinatura.getFim_vigencia()
        );
    }

    public static ClienteModel toClienteModel(Cliente cli){
        return new ClienteModel(cli.getcodigo(),cli.getNome(),cli.getEmail());
    }
    public static Cliente fromClienteModel(ClienteModel cModel){
        return new Cliente(cModel.getcodigo(),cModel.getNome(),cModel.getEmail());
    }

    public static Aplicativo fromAplicativoModel(AplicativoModel apModel) {
        return new Aplicativo(apModel.getCodigo(), apModel.getNome(), apModel.getCustoMensal());
    }

    private Date adicionarDias(Date data, int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.add(Calendar.DAY_OF_MONTH, dias);
        return calendar.getTime();
    }

    public StatusATIVO verificarStatusValido() {
        Date inicio = inicioDate();
        Date fim = fimdate();

        if (inicio.after(fim)) {
            return StatusATIVO.ATIVO;
        } else {
            return StatusATIVO.CANCELADO;
        }
    }

    private Date inicioDate() {
        LocalDate dataAtual = LocalDate.now();
        return java.sql.Date.valueOf(dataAtual);
    }

    private Date fimdate() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inicioVigencia);
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        return calendar.getTime();
    }

    private final AssinaturaRepJpa assinaturaRepJpa = null;

    public AplicativoModel encontraAplicativo(long codigoAplicativo) {
        AplicativoModel modelAplicativo = null;

        List<List<AplicativoModel>> todosAplicativos = assinaturaRepJpa.todosAplicativos();

        for (List<AplicativoModel> listaAplicativos : todosAplicativos) {
            for (AplicativoModel umAplicativo : listaAplicativos) {
                long codx = umAplicativo.getCodigo();

                if (codx == codigoAplicativo) {
                    modelAplicativo = umAplicativo;
                    break;
                }
            }
            if (modelAplicativo != null) {
                break;
            }
        }

        return modelAplicativo;
    }

    private final ClienteRepJpa clienteRepJpa = null;
/*
    public ClienteModel encontrCliente(long codigoCliente) {
        ClienteModel modelCliente = null;

        List<ClienteModel> todosClientes = clienteRepJpa.todos();
        for (ClienteModel umcliente : todosClientes) {
           // long codx = umcliente.getCodigo();

            if (codx == codigoCliente) {
                modelCliente = umcliente;
                break;
            }
        }

        return modelCliente;
    }*/
}
