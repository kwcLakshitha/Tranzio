package edu.ijse.tranzio.service.impl;

import edu.ijse.tranzio.entity.Rd;
import edu.ijse.tranzio.repository.RdRepository;
import edu.ijse.tranzio.service.RdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RdServiceImpl implements RdService {

    private final RdRepository rdRepository;

    @Override 
    public String rdSave(Rd rd) {
        rdRepository.save(rd);
        return "RD saved";
    }

    @Override
    public Object rdUpdate(Rd rd) {
        rdRepository.save(rd);
        return "RD updated";
    }

    @Override
    public Object rdDelete(Rd rd) {
        rdRepository.delete(rd);
        return "RD deleted";
    }
}
