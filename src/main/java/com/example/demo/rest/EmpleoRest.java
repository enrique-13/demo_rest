package com.example.demo.rest;

import com.example.demo.dao.EmpleoDAO;
import com.example.demo.model.Empleo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleo")
public class EmpleoRest {

    @Autowired
    private EmpleoDAO empleoDAO;

    @PostMapping("/guardar")
    public void guardar( @RequestBody Empleo empleo){
        empleoDAO.save(empleo);
    }

    @GetMapping("/listar")
    public List<Empleo> lsitar (){
        return empleoDAO.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public void elimar(@PathVariable("id") Integer id){
        empleoDAO.deleteById(id);
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Empleo empleo){
        empleoDAO.save(empleo);
    }

}
