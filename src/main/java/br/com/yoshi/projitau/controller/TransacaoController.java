// package br.com.yoshi.projitau.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// import br.com.yoshi.projitau.dto.ContagemStatusDTO;
// import br.com.yoshi.projitau.repository.TransacaoRepo;


// @RestController
// @CrossOrigin("*") // requisições de qualquer origem
// @RequestMapping("/transacao")
// public class TransacaoController {

//     @Autowired
//     private TransacaoRepo transacaoRepo;

//     @GetMapping("/id/{id}")
//     public ResponseEntity<ContagemStatusDTO> getAgFinanceiroById(@PathVariable int id) {
//         ContagemStatusDTO transacoes = (ContagemStatusDTO) transacaoRepo.countStatusByAgent(id); // findById busca pela PK

//         if (transacoes != null) {
//             return ResponseEntity.ok(transacoes); // OK = 200
//         }

//         return ResponseEntity.notFound().build(); // NOT FOUND = 404
//     }


// }
