package edu.ijse.tranzio.service;

import edu.ijse.tranzio.entity.Bus;

public interface BusService {
    Object saveBus(Bus bus);

    Object updateBus(Bus bus);

    Object deleteBus(Bus bus);
}
