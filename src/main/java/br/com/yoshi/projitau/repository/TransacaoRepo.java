package br.com.yoshi.projitau.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.yoshi.projitau.dto.ContagemStatusDTO;
import br.com.yoshi.projitau.model.Transacao;

public interface TransacaoRepo extends CrudRepository<Transacao, Integer> {
    @Query("SELECT new br.com.yoshi.projitau.dto.ContagemStatusDTO(t.agFinanceiro.nome, t.agFinanceiro.volumeTransacional, t.status, COUNT(t.status)) FROM Transacao AS t WHERE t.agFinanceiro.id = ?1 GROUP BY t.agFinanceiro.nome, t.status ORDER By t.status")
    List<ContagemStatusDTO> countStatusByAgent(int idAgente);

    // @Query(value = "ag_financeiro,a.nome_agente,a.volume_transacional,count(case when status = 0 then 1 else 0 end) AS sucessos,count(case when status = 1 then 1 else 0 end) AS falhas, count(case when status = 2 then 1 else 0 end) AS fraudes FROM mtb310_transaction as t RIGHT JOIN mtb310_ag_financeiro as a ON(t.ag_financeiro=a.id_agente) GROUP BY ag_financeiro", nativeQuery = true)
    // List<Object> teste(int idAgente);
}
