package com.example.siteFull.Controllers;

import com.example.siteFull.Documents.Usuarios;
import com.example.siteFull.Repositories.UsuariosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Usuarios")
public class UsuarioController {
    @Autowired
    private UsuariosRepo usuariosRepository;


    @PostMapping
    //Create a new Usuario////////////////////////////////
    public ResponseEntity<?> save(@RequestBody Usuarios usuario){
        try {
            Usuarios userSave = usuariosRepository.save(usuario);
            return new ResponseEntity<Usuarios>(userSave, HttpStatus.ACCEPTED);
        }
        catch (Exception e){
            return new ResponseEntity<String>(e.getCause().toString(),
                                                HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
