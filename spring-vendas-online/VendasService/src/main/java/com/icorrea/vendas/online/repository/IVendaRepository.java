/**
 * 
 */
package com.icorrea.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.icorrea.vendas.online.domain.Venda;



/**
 * @author rodrigo.pires
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
