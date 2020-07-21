package com.example.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Categoria;



@Repository
public interface ICategoria  extends CrudRepository<Categoria, Integer>{

}
