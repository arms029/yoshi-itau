package br.com.yoshi.projitau.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.yoshi.projitau.model.AgFinanceiro;

public interface AgFinanceiroRepo extends CrudRepository<AgFinanceiro,Integer>{

    // @Query("SELECT new br.com.yoshi.projitau.dto.AgFinanceiroDTO from AgenteFinanceiro")
    // List<AgFinanceiroDTO> findByTop();
    // @Query(value = "SELECT id_agente, nome_agente, volume_transacional FROM mtb310_ag_financeiro ORDER BY volume_transacional DESC limit 3;", nativeQuery=true)
    public List<AgFinanceiro> findTop10ByOrderByVolumeTransacionalDesc();
}

