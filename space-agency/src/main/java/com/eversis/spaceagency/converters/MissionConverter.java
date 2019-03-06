package com.eversis.spaceagency.converters;

import com.eversis.spaceagency.dtos.MissionDto;
import com.eversis.spaceagency.entities.Mission;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class MissionConverter {

    public Mission dtoToEntity(MissionDto missionDto) {

        return Mission.builder()
                .name(missionDto.getName())
                .startDate(missionDto.getStartDate())
                .finishDate(missionDto.getFinishDate())
                .build();
    }

}
