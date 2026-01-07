package com.achou.sama_gestion.Repository;

import com.achou.sama_gestion.Modele.Lavage;
import com.achou.sama_gestion.Modele.VenteProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenteProduitRepository extends JpaRepository<VenteProduit, Long> {

}
