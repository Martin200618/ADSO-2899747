package com.SENA.FlightManagementSystem.Geolocation.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.City;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepositoryGeolocation;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.ICityRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService extends ABaseServiceGeolocation<City, Object, Object> implements ICityService {
    @Override
    protected IBaseRepositoryGeolocation<City, String> getRepository() {
        return repository;
    }

    @Autowired
    private ICityRepository repository;

    @Override
    public Object mapToResDto(City entity) {
        return null;
    }

    @Override
    public City mapToEntity(Object dto) {
        return null;
    }
}
