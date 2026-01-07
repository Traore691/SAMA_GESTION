package com.achou.sama_gestion.Repository;

import com.achou.sama_gestion.Modele.Lavage;
import com.achou.sama_gestion.Modele.Vente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteRepository extends JpaRepository<Vente, Long>{
}
