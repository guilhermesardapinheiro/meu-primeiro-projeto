package com.my.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.my.api.entities.Empresa;


public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	/**
	 * findBy + nome do atributo mapeado na classe (Spring vai automaticamente criar a query where cnpj
	 * */
	Empresa findByCnpj(String cnpj);

}
