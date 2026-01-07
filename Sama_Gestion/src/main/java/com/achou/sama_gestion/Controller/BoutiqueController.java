package com.achou.sama_gestion.Controller;

import com.achou.sama_gestion.Modele.Produit;
import com.achou.sama_gestion.Modele.VenteProduit;
import com.achou.sama_gestion.Repository.ProduitRepository;
import com.achou.sama_gestion.Repository.VenteProduitRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boutique")
public class BoutiqueController {

        private final ProduitRepository produitRepository;
        private final VenteProduitRepository venteproduitRepository;

        public BoutiqueController(VenteProduitRepository venteproduitRepository, ProduitRepository produitRepository) {
            this.produitRepository = produitRepository;
            this.venteproduitRepository = venteproduitRepository;
        }

        @GetMapping("/produits")
        public List<Produit> produits() { return produitRepository.findAll(); }

        @PostMapping("/produits")
        public Produit addProduit(@RequestBody Produit produit) { return produitRepository.save(produit); }

        @PostMapping("/vente")
        public VenteProduit addVente(@RequestBody VenteProduit venteproduit) { return venteproduitRepository.save(venteproduit); }
    }
