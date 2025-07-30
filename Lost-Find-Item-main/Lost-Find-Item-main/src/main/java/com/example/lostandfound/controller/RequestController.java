package com.example.lostandfound.controller;

import com.example.lostandfound.model.Request;
import com.example.lostandfound.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class RequestController {

    @Autowired
    private RequestRepository requestRepo;

    @PostMapping
    public Request makeRequest(@RequestBody Request request) {
        return requestRepo.save(request);
    }

    @GetMapping
    public List<Request> getAllRequests() {
        return requestRepo.findAll();
    }

    @PutMapping("/{id}/approve")
    public Request approveRequest(@PathVariable Long id) {
        Request request = requestRepo.findById(id).orElse(null);
        if (request != null) {
            request.setStatus(Request.Status.APPROVED);
            return requestRepo.save(request);
        }
        return null;
    }

    @PutMapping("/{id}/reject")
    public Request rejectRequest(@PathVariable Long id) {
        Request request = requestRepo.findById(id).orElse(null);
        if (request != null) {
            request.setStatus(Request.Status.REJECTED);
            return requestRepo.save(request);
        }
        return null;
    }
}
