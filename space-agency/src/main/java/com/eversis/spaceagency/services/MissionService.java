package com.eversis.spaceagency.services;

import com.eversis.spaceagency.converters.MissionConverter;
import com.eversis.spaceagency.dtos.MissionDto;
import com.eversis.spaceagency.entities.Mission;
import com.eversis.spaceagency.repositories.MissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MissionService {

    private final MissionRepository missionRepository;
    private final MissionConverter missionConverter;

    public void addMission(MissionDto missionDto) {
        missionRepository.save(missionConverter.dtoToEntity(missionDto));
    }
}
