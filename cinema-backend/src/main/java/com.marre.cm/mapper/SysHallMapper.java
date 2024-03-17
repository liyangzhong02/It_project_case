package com.marre.cm.mapper;

import com.marre.cm.domain.SysBill;
import com.marre.cm.domain.SysHall;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author :marRE
 * @Date :2024/3/17
 */
@Mapper
public interface SysHallMapper {

    List<SysHall> findAllHalls(SysHall sysHall);

    SysHall findHallById(Long id);

    SysHall findHall();

    int addHall(SysHall sysHall);

    int updateHall(SysHall sysHall);

    int deleteHall(SysHall sysHall);
}
