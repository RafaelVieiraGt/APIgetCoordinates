package com.example.getcoordinates.repositories;


import com.example.getcoordinates.details.Node;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NodeRepository extends JpaRepository<Node, Integer> {

}
