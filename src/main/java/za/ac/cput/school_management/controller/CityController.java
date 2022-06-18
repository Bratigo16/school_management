package za.ac.cput.school_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.school_management.domain.City;
import za.ac.cput.school_management.service.CityServiceImpl;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("school/city/")
public class CityController {
    private CityServiceImpl cityService;

@Autowired public CityController(CityServiceImpl cityService){
    this.cityService =cityService;
}
@PostMapping("save")
public ResponseEntity<City> save(City city){
    City save = cityService.save(city);
    return ResponseEntity.ok(save);
}
@GetMapping("read/{id}")
public  ResponseEntity<City> read(@PathVariable String id) {
    City city = this.cityService.read(id).orElseThrow(
            ()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    return  ResponseEntity.ok(city);
}
@GetMapping("readbyCountryId")
public ResponseEntity<City> findByCountry_IdOrderByName( @PathVariable String countryId) {
    City city = this.cityService.findByCountry_IdOrderByName(countryId);
    return ResponseEntity.ok(city);
}
@DeleteMapping("Delete")
    public ResponseEntity<Void> delete(City city){
        this.cityService.delete(city);
        return ResponseEntity.noContent().build();

    }
    @GetMapping("all")
    public ResponseEntity <List<City>> findAll(){
        List<City> cityList = this.cityService.findAll();
        return ResponseEntity.ok(cityList);
    }
}




