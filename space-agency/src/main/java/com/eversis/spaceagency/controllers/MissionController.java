package com.eversis.spaceagency.controllers;


import com.eversis.spaceagency.dtos.MissionDto;
import com.eversis.spaceagency.dtos.ProductDto;
import com.eversis.spaceagency.entities.Mission;
import com.eversis.spaceagency.services.MissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/missions")
@CrossOrigin
@AllArgsConstructor
@RestController
public class MissionController {

    private final MissionService missionService;

    @PostMapping("/add")
    public void addMission(@RequestBody MissionDto missionDto){
        missionService.addMission(missionDto);
    }


//    @PostMapping("/edit")
//    public void editMission(@RequestBody MissionDto missionDto){
//        missionService.editMission(missionDto);
//
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public void deleteMission(@PathVariable Integer id) {
//        missionService.deleteProduct(id);
//    }
}
