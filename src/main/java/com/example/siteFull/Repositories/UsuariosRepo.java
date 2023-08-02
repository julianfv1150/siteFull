package com.example.siteFull.Repositories;

import com.example.siteFull.Documents.Usuarios;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuariosRepo extends MongoRepository<Usuarios, Long> {

}
