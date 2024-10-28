package com.xqaqyn.survey.controller;

import com.xqaqyn.survey.dto.SurveyDto;
import com.xqaqyn.survey.util.GlobalResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class SurveyController {
    @GetMapping("/survey")
    public GlobalResponse<SurveyDto> getSurvey(@RequestParam String id) {
        return GlobalResponse.error("Unimplemented method");
    }

    @PostMapping("/survey")
    public GlobalResponse<String> saveSurvey(@RequestBody SurveyDto surveyDto) {
        return GlobalResponse.error("Unimplemented method");
    }

    @PostMapping("/survey/update")
    public GlobalResponse<String> updateSurvey(@RequestBody SurveyDto surveyDto) {
        return GlobalResponse.error("Unimplemented method");
    }
}
