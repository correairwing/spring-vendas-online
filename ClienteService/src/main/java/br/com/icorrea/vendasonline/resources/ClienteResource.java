package br.com.icorrea.vendasonline.resources;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.icorrea.vendasonline.domain.Cliente;
import br.com.icorrea.vendasonline.usecase.BuscaCliente;
import br.com.icorrea.vendasonline.usecase.CadastroCliente;
import io.swagger.v3.oas.annotations.Parameter;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteResource {
	
	private BuscaCliente buscaCliente;
	
	private CadastroCliente cadastroCliente;
	
	@Autowired
	public ClienteResource(BuscaCliente buscaCliente, CadastroCliente cadastroCliente) {
		this.buscaCliente = buscaCliente;
		this.cadastroCliente = cadastroCliente;
	}
	
	@GetMapping
	public ResponseEntity<Page<Cliente>> buscar(Pageable pageable) {
		return ResponseEntity.ok(buscaCliente.buscar(pageable));
	}
}
