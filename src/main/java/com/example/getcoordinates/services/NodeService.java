package com.example.getcoordinates.services;

import com.example.getcoordinates.DTO.NodeResponseDTO;
import com.example.getcoordinates.details.Node;
import com.example.getcoordinates.repositories.NodeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class NodeService {

    private final NodeRepository nodeRepository;

    public NodeResponseDTO getAllCoordinates(){
        List<Node> nodes = nodeRepository.findAll();

        return new NodeResponseDTO(nodes);

    }

    public Node postNode(@RequestBody Node newnode){
        if( newnode != null){
            nodeRepository.save(newnode);

        }

        return newnode;

    }
}
