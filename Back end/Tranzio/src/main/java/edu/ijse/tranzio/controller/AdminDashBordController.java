package edu.ijse.tranzio.controller;

import edu.ijse.tranzio.dto.ApiResponse;
import edu.ijse.tranzio.entity.Bus;
import edu.ijse.tranzio.entity.Driver;
import edu.ijse.tranzio.entity.Rd;
import edu.ijse.tranzio.service.BusService;
import edu.ijse.tranzio.service.DriverService;
import edu.ijse.tranzio.service.RdService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tranzio/AdminDash")
@Slf4j
public class AdminDashBordController {
    private final BusService busService;
    private final DriverService driverService;
    private final RdService rdService;

    @PostMapping("/saveRd")
    public ResponseEntity<ApiResponse> saveRd(@RequestBody Rd rd) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "RD save complete",
                        rdService.rdSave(rd)

                )
        );
    }

    @PostMapping("/updateRD")
    public ResponseEntity<ApiResponse> updateRd(@RequestBody Rd rd) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "RD update complete",
                        rdService.rdUpdate(rd)
                )
        );
    }

    @PostMapping("/deleteRD")
    public ResponseEntity<ApiResponse> deleteRd(@RequestBody Rd rd) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "RD Delete complete",
                        rdService.rdDelete(rd)
                )
        );
    }

    @PostMapping("/saveDriver")
    public ResponseEntity<ApiResponse> saveDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "Driver save complete",
                        driverService.saveDriver(driver)
                )
        );
    }

    @PostMapping("/updateDriver")
    public ResponseEntity<ApiResponse> updateDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "Driver update complete",
                        driverService.updateDriver(driver)
                )
        );
    }

    @PostMapping("/deleteDriver")
    public ResponseEntity<ApiResponse> deleteDriver(@RequestBody Driver driver) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "Driver delete complete",
                        driverService.deleteDriver(driver)
                )
        );
    }

    @PostMapping("/saveBus")
    public ResponseEntity<ApiResponse> saveBus(@RequestBody Bus bus) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "Bus save complete",
                        busService.saveBus(bus)
                )
        );
    }
    @PostMapping("updateBus")
    public ResponseEntity<ApiResponse> updateBus(@RequestBody Bus bus) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "Bus update complete",
                        busService.updateBus(bus)
                )
        );
    }
    @PostMapping("/deleteBus")
    public ResponseEntity<ApiResponse> deleteBus(@RequestBody Bus bus) {
        return ResponseEntity.ok(
                new ApiResponse(
                        200,
                        "Driver delete complete",
                        busService.deleteBus(bus)
                )
        );
    }
}
