package com.ut.ecommerce.search_suggestions_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SearchSuggestionsController {

    @GetMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("success");
    }

    @GetMapping("/default-search-suggestion")
    public ResponseEntity<?> getDefaultSearchSuggestion() {
        return ResponseEntity.ok("default search suggestion");
    }

    @GetMapping(value = "/search-suggestion", params = "q")
    public ResponseEntity<?> getSearchSuggestion(@RequestParam("q") String queryParams) {
        return ResponseEntity.ok("search suggestion for query: " + queryParams);
    }
}
