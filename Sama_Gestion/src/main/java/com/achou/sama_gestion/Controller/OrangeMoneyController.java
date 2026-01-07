package com.achou.sama_gestion.Controller;

import com.achou.sama_gestion.Modele.OrangeOperation;
import com.achou.sama_gestion.Repository.OrangeOperationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orange-money")
public class OrangeMoneyController {
        private final OrangeOperationRepository repo;
        public OrangeMoneyController(OrangeOperationRepository repo)
        { this.repo = repo;
        }
        @GetMapping
        public List<OrangeOperation> all() { return repo.findAll(); }
        @PostMapping
        public OrangeOperation add(@RequestBody OrangeOperation op) {
            return repo.save(op);
        }
    }
