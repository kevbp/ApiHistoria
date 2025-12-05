
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
    private String fecCre;
    private String horCre;
    private Long idEmp;

    public Historia() {
    }

    public Historia(Long id, Long idPac, String fecCre, String horCre, Long idEmp) {
        this.id = id;
        this.idPac = idPac;
        this.fecCre = fecCre;
        this.horCre = horCre;
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

    public String getFecCre() {
        return fecCre;
    }

    public void setFecCre(String fecCre) {
        this.fecCre = fecCre;
    }

    public String getHorCre() {
        return horCre;
    }

    public void setHorCre(String horCre) {
        this.horCre = horCre;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

    
}
