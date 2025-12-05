package Clinica.ApiHistoria;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Servicio {

    @Autowired
    private Repositorio repo;

    public Historia grabar(Historia his) {
        return repo.save(his);
    }

    public Historia buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public Historia buscarPorPaciente(Long idPac) {
        return repo.findByIdPac(idPac);
    }

    public List<Historia> listar() {
        return repo.findAll();
    }

    public Historia actualizar(Long id, Historia his) {
        return repo.findById(id).map(existing -> {
            existing.setIdPac(his.getIdPac());
            existing.setFecCre(his.getFecCre());
            existing.setHorCre(his.getHorCre());
            existing.setIdEmp(his.getIdEmp());
            return repo.save(existing);
        }).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
