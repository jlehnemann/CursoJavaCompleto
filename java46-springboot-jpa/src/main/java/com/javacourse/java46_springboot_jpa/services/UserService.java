package com.javacourse.java46_springboot_jpa.services;

import com.javacourse.java46_springboot_jpa.entities.User;
import com.javacourse.java46_springboot_jpa.exceptions.DatabaseException;
import com.javacourse.java46_springboot_jpa.exceptions.ResourceNotFoundException;
import com.javacourse.java46_springboot_jpa.repositories.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {

        try {
            //busca e lança exceção se não encontrou o id - ver findById
            findById(id);

            //este tenta apagar, caso tenha erro de database, é pego no catch abaixo
            repository.deleteById(id);
        }

        catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        //não consulta no banco de dados, apenas prepara o objeto monitorado para depois mexer no banco de dados
        //esse processo é mais eficiente
        try{
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }

}
