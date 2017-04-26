package com.ee.squiggly.poc.web;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ee.squiggly.poc.model.Issue;

@RestController
public class IssueController {

    @RequestMapping("/issues")
    public ResponseEntity<?> findAll() {

        List<Issue> issues = Issue.findAll();

        issues.stream().forEach(
                issue -> issue.add(linkTo(methodOn(IssueController.class).findById(issue.getIssueId())).withSelfRel()));

        return new ResponseEntity<>(issues, HttpStatus.OK);
    }

    @RequestMapping("/issues/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {

        for (Issue issue : Issue.findAll()) {
            if (issue.getIssueId().equals(id)) {

                issue.add(linkTo(methodOn(IssueController.class).findById(issue.getIssueId())).withSelfRel());
                return new ResponseEntity<>(issue, HttpStatus.OK);
            }
        }

        return ResponseEntity.notFound().build();
    }
}