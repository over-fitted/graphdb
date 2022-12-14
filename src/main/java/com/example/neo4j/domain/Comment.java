package com.example.neo4j.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.*;
import org.springframework.data.neo4j.core.support.UUIDStringGenerator;

@RelationshipProperties
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
    // note: forced to map internally generated id in variable `id`
    @RelationshipId
    private Long java_id;

    // this id is generated by mongodb dataset, also generate placeholder id
    // if not exists for use with Node DTO class
    @GeneratedValue(UUIDStringGenerator.class)
    private String id;
    private String email;
    private String text;

    @TargetNode
    private Movie movie;
}
