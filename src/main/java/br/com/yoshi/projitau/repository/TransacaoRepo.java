package br.com.yoshi.projitau.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.yoshi.projitau.dto.ContagemStatusDTO;
import br.com.yoshi.projitau.model.Transacao;

public interface TransacaoRepo extends CrudRepository<Transacao, Integer> {
    @Query("SELECT new br.com.yoshi.projitau.dto.ContagemStatusDTO(t.agFinanceiro.nome, t.agFinanceiro.volumeTransacional, t.status, " +
    "COUNT(t.status)) " +
    "FROM Transacao AS t " +
    "WHERE t.agFinanceiro.id = ?1 " +
    "GROUP BY t.agFinanceiro.nome, t.status " +
    "ORDER By t.status")
    List<ContagemStatusDTO> teste(int idAgente);

    // @Query(value = "SELECT new br.com.yoshi.projitau.dto.ContagemStatusDTO(t.ag_financeiro,a.nome_agente,a.volume_transacional, "+
    // "count(case when status = 0 then 1 else 0 end) AS sucessos, " +
    // "count(case when status = 1 then 1 else 0 end) AS falhas, " +
    // "count(case when status = 2 then 1 else 0 end) AS fraudes) " +
    // "FROM mtb310_transaction as t " +
    // "RIGHT JOIN mtb310_ag_financeiro as a " +
    // "ON(t.ag_financeiro=a.id_agente) " + 
    // "GROUP BY t.ag_financeiro")
    // List<ContagemStatusDTO> teste(int idAgente);

    // @Query("SELECT new br.com.yoshi.projitau.dto.ContagemStatusDTO(t.agFinanceiro,a.nome,a.volumeTransacional, "+
    // "count(case when status = 0 then 1 else 0 end) AS sucessos, " +
    // "count(case when status = 1 then 1 else 0 end) AS falhas, " +
    // "count(case when status = 2 then 1 else 0 end) AS fraudes) " +
    // "FROM Transacao as t " +
    // "RIGHT JOIN AgFinanceiro as a " +
    // "ON(t.agFinanceiro=a.id) " + 
    // "GROUP BY t.agFinanceiro")
    // List<ContagemStatusDTO> teste(int idAgente);
}
