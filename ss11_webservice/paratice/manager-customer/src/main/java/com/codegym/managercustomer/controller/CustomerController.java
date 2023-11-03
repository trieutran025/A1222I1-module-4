package com.codegym.managercustomer.controller;

import com.codegym.managercustomer.dto.CustomerDto;
import com.codegym.managercustomer.entity.Customer;
import com.codegym.managercustomer.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomer() {
        List<Customer> customers = iCustomerService.findAll();
        if (customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveCustomer(@RequestBody CustomerDto customerDto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        iCustomerService.create(customer);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> updateCustomer(@RequestParam("id") int id, @RequestBody CustomerDto customerDto) {
        Customer customer = iCustomerService.findById(id);
        if(customer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        BeanUtils.copyProperties(customerDto,customer);
        iCustomerService.update(customer);
        return new ResponseEntity<>("Update Success",HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<?> deleteCustomer(@RequestParam("id") int id){
        Customer customer = iCustomerService.findById(id);
        if(customer == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iCustomerService.delete(customer);
        return new ResponseEntity<>("delete Success",HttpStatus.OK);
    }
}
