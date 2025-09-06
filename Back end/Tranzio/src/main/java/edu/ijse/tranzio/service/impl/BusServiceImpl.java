package edu.ijse.tranzio.service.impl;

import edu.ijse.tranzio.entity.Bus;
import edu.ijse.tranzio.repository.BusRepository;
import edu.ijse.tranzio.service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;
    @Override
    public Object saveBus(Bus bus) {
        busRepository.save(bus);
        return "Bus saved";
    }

    @Override
    public Object updateBus(Bus bus) {
        busRepository.save(bus);
        return "bus update complete";
    }

    @Override
    public Object deleteBus(Bus bus) {
        busRepository.delete(bus);
        return "Bus delete complete";
    }
}
