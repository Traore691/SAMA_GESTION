package com.achou.sama_gestion.Controller;

import com.achou.sama_gestion.Modele.Achat;
import com.achou.sama_gestion.Modele.Vente;
import com.achou.sama_gestion.Repository.AchatRepository;
import com.achou.sama_gestion.Repository.VenteRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recyclage")
public class RecyclageController {
        private final AchatRepository achatRepo;
        private final VenteRepository venteRepo;

        public RecyclageController(AchatRepository a, VenteRepository v) {
            this.achatRepo = a; this.venteRepo = v;
        }

        @GetMapping("/achats")
        public List<Achat> allAchats() { return achatRepo.findAll(); }

        @PostMapping("/achats")
        public Achat addAchat(@RequestBody Achat a) { return achatRepo.save(a); }

        @GetMapping("/ventes")
        public List<Vente> allVentes() { return venteRepo.findAll(); }

        @PostMapping("/ventes")
        public Vente addVente(@RequestBody Vente v) { return venteRepo.save(v); }
    }
