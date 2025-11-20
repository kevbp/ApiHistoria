/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiHistoria;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/historia")
public class Control {
    @Autowired
    private Servicio serv;

    @PostMapping("/grabar")
    public Historia grabar(@RequestBody Historia his) {
        return serv.grabar(his);
    }

    @GetMapping("/buscar/{id}")
    public Historia buscar(@PathVariable Long id) {
        return serv.buscar(id);
    }

    @GetMapping("/listar")
    public List<Historia> listar() {
        return serv.listar();
    }

    @PutMapping("/actualizar/{id}")
    public Historia actualizar(@PathVariable Long id, @RequestBody Historia his) {
        return serv.actualizar(id, his);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        serv.eliminar(id);
    }
}
