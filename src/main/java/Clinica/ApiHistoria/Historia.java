
package Clinica.ApiHistoria;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Historia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idPac;
    private Long idEmp;

    public Historia() {
    }

    public Historia(Long id, Long idPac, Long idEmp) {
        this.id = id;
        this.idPac = idPac;
        this.idEmp = idEmp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPac() {
        return idPac;
    }

    public void setIdPac(Long idPac) {
        this.idPac = idPac;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }
    
    
}
