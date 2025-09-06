package edu.ijse.tranzio.service;

import edu.ijse.tranzio.entity.Driver;

public interface DriverService {
    Object saveDriver(Driver driver);

    Object updateDriver(Driver driver);

    Object deleteDriver(Driver driver);
}
