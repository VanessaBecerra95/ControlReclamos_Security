package cl.praxis.controlreclamos_transporte.model.service;

import cl.praxis.controlreclamos_transporte.model.entity.Role;
import cl.praxis.controlreclamos_transporte.model.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role findById(Integer id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public boolean create(Role role) {
        Role r = roleRepository.save(role);
        return r != null;
    }

    @Override
    public boolean update(Role role) {
        return roleRepository.save(role) != null;
    }

    @Override
    public boolean delete(Integer id) {
        boolean exist = roleRepository.existsById(id);
        if (exist){
            roleRepository.deleteById(id);
        }
        return exist;
    }
}
