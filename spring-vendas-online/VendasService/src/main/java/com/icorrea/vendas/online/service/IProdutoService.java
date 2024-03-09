/**
 * 
 */
package com.icorrea.vendas.online.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icorrea.vendas.online.domain.Produto;



/**
 * @author irwing.correa
 *
 */

@FeignClient(name = "produto", url = "${application.produtoService.endpointConsultarProduto}")
public interface IProdutoService {

	@RequestMapping(method = RequestMethod.GET, value = "/{codigo}", produces = "application/json", headers = "application/json")
	Produto buscarProduto(@RequestParam("codigo") String codigoProduto);

}
