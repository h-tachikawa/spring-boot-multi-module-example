package com.example.demo.controller;

import com.example.demo.project.Project;
import com.example.demo.todo.ToDo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/projects")
class ProjectController {

    @GetMapping
    public List<Project> list() {
        return List.of(
                new Project(
                        "1",
                        "プロジェクトA",
                        List.of(
                                new ToDo("1", "すきやきを食べる")
                        )
                ),
                new Project(
                        "2",
                        "プロジェクトB",
                        List.of(
                                new ToDo("2", "洗剤を買う")
                        )
                )
        );
    }
}
