package edu.ijse.tranzio.service.impl;

import edu.ijse.tranzio.entity.Driver;
import edu.ijse.tranzio.repository.DriverRepository;
import edu.ijse.tranzio.service.DriverService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DriverServiceImpl implements DriverService {
    private final DriverRepository driverRepository;

    @Override
    public Object saveDriver(Driver driver) {
        driverRepository.save(driver);
        return "Driver save complete";
    }

    @Override
    public Object updateDriver(Driver driver) {
        driverRepository.save(driver);
        return "Driver update complete";
    }

    @Override
    public Object deleteDriver(Driver driver) {
        driverRepository.delete(driver);
        return "Driver delete complete";
    }
}
