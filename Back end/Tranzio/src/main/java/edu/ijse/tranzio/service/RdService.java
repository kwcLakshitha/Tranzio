package edu.ijse.tranzio.service;

import edu.ijse.tranzio.entity.Rd;

public interface RdService {
    String rdSave(Rd rd);

    Object rdUpdate(Rd rd);

    Object rdDelete(Rd rd);
}
