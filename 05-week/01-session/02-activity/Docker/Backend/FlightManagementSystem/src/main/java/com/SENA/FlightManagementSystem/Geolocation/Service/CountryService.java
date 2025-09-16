package com.SENA.FlightManagementSystem.Geolocation.Service;

import com.SENA.FlightManagementSystem.Geolocation.Entity.Country;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.IBaseRepositoryGeolocation;
import com.SENA.FlightManagementSystem.Geolocation.IRepository.ICountryRepository;
import com.SENA.FlightManagementSystem.Geolocation.IService.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService  extends ABaseServiceGeolocation<Country, Object, Object> implements ICountryService {
    @Override
    protected IBaseRepositoryGeolocation<Country, String> getRepository() {
        return repository;
    }

    @Autowired
    private ICountryRepository repository;

    @Override
    public Object mapToResDto(Country entity) {
        // TODO: Implement proper mapping
        return null;
    }

    @Override
    public Country mapToEntity(Object dto) {
        // TODO: Implement proper mapping
        return null;
    }
}
