package cl.praxis.controlreclamos_transporte.model.service;

import cl.praxis.controlreclamos_transporte.model.entity.User;
import cl.praxis.controlreclamos_transporte.model.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public boolean create(User user) {
        User u = userRepository.save(user);
        return u != null;
    }

    @Override
    public boolean update(User user) {
        return userRepository.save(user) != null;
    }

    @Override
    public boolean delete(Integer id) {
        boolean exist = userRepository.existsById(id);
        if (exist){
            userRepository.deleteById(id);
        }
        return exist;
    }
}
