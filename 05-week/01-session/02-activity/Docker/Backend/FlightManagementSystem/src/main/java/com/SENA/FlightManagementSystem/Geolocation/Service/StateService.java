package com.SENA.FlightManagementSystem.Geolocation.Service;


import com.SENA.FlightManagementSystem.Geolocation.Entity.State;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepositoryGeolocation;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IStateRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.IStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService extends ABaseServiceGeolocation<State, Object, Object> implements IStateService {
    @Override
    protected IBaseRepositoryGeolocation<State, String> getRepository() {
        return repository;
    }

    @Autowired
    private IStateRepository repository;

    @Override
    public Object mapToResDto(State entity) {
        // TODO: Implement proper mapping
        return null;
    }

    @Override
    public State mapToEntity(Object dto) {
        // TODO: Implement proper mapping
        return null;
    }
}
