package com.marre.cm.mapper;

import com.marre.cm.domain.SysBill;
import com.marre.cm.domain.SysCinema;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author :marRE
 * @Date :2024/3/17
 */
@Mapper
public interface SysCinemaMapper {

    SysCinema findCinemaById(Long id);

    SysCinema findCinema();

    int updateCinema(SysCinema sysCinema);


}
