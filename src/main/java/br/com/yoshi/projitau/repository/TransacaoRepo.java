package br.com.yoshi.projitau.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.yoshi.projitau.dto.ContagemStatusDTO;
import br.com.yoshi.projitau.model.Transacao;

public interface TransacaoRepo extends CrudRepository<Transacao, Integer> {
    @Query("SELECT new br.paduan.projFinal.dto.ContagemStatus(t.agente.nomeAgente, t.agente.volumeTransacional, t.status, COUNT(t.status)) FROM Transacao AS t WHERE t.agente.idAgente = ?1 GROUP BY t.agente.nomeAgente, t.status ORDER By t.status")
    List<ContagemStatusDTO> countStatusByAgent(int idAgente);
}
