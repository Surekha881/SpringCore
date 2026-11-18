package com.flm.controller;

import com.flm.dto.ClaimDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/claim")
public class ClaimController {

    @GetMapping("/get/{id}")
    public ResponseEntity<ClaimDTO> getDetails


}
