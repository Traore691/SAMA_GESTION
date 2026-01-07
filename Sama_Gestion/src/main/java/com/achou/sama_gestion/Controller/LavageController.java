package com.achou.sama_gestion.Controller;

import com.achou.sama_gestion.Modele.Lavage;
import com.achou.sama_gestion.Repository.LavageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lavage")
public class LavageController {
        private final LavageRepository repo;
        public LavageController(LavageRepository repo) { this.repo = repo; }
        @GetMapping
        public List<Lavage> all() { return repo.findAll(); }
        @PostMapping
        public Lavage add(@RequestBody Lavage l) { return repo.save(l); }
        @PutMapping("/{id}")
        public Lavage update(@PathVariable Long id, @RequestBody Lavage l) {
            l.setId(id);
            return repo.save(l);
        }
        @DeleteMapping("/{id}")
        public void delete(@PathVariable Long id) { repo.deleteById(id); }
    }
