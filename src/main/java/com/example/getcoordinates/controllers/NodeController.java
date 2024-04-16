package com.example.getcoordinates.controllers;

import com.example.getcoordinates.DTO.NodeResponseDTO;
import com.example.getcoordinates.details.Node;
import com.example.getcoordinates.services.NodeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coordinates")
@RequiredArgsConstructor
public class NodeController {

    private final NodeService service;


    @GetMapping
    public ResponseEntity<NodeResponseDTO> getNodes(){
        List<Node> nodes = this.service.getAllCoordinates().nodes();

        return ResponseEntity.ok(new NodeResponseDTO(nodes));
    }

    @PostMapping
    public ResponseEntity<Node> postNodes(@RequestBody Node node){
        Node newNode = this.service.postNode(node);

        return ResponseEntity.ok(newNode);
    }

}
