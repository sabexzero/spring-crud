package com.example.laboratoryhub.Services;

import java.util.List;
import com.example.laboratoryhub.Dtos.TestEntityDTO;
import com.example.laboratoryhub.Entities.TestEntity;
import com.example.laboratoryhub.Repositories.TestEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TestEntityService {
    
    private final TestEntityRepository testEntityRepository;
    
    public TestEntity createTestEntity(TestEntityDTO  dto){
        TestEntity testEntity = TestEntity.builder()
                .name(dto.getName())
                .build();
        return testEntityRepository.save(testEntity);
    }
    
    public List<TestEntity> getAllTestEntities(){
        return testEntityRepository.findAll();
    }
    
    public TestEntity updateTestEntity(TestEntity entity){
        return testEntityRepository.save(entity);
    }
    
    public void deleteTestEntity(Long id){
        testEntityRepository.deleteById(id);
    }
}
