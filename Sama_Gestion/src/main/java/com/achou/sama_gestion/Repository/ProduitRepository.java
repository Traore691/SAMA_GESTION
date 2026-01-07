package com.achou.sama_gestion.Repository;

import com.achou.sama_gestion.Modele.Lavage;
import com.achou.sama_gestion.Modele.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
