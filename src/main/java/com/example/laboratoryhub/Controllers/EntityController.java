package com.example.laboratoryhub.Controllers;

import com.example.laboratoryhub.Dtos.TestEntityDTO;
import com.example.laboratoryhub.Entities.TestEntity;
import com.example.laboratoryhub.Services.TestEntityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EntityController {
    private final TestEntityService testEntityService;
    
    @PostMapping
    public ResponseEntity<TestEntity> create(@RequestBody TestEntityDTO dto) {
        return new ResponseEntity<>(testEntityService.createTestEntity(dto), HttpStatus.OK);
    }
    
    @GetMapping
    public ResponseEntity<List<TestEntity>> readAll(){
        return new ResponseEntity<>(testEntityService.getAllTestEntities(),HttpStatus.OK);
    }
}
