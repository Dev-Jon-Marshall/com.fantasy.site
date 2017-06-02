package com.fantasy.site.repositories;

import com.fantasy.site.domain.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;



/**
 * Created by Jonathan.Marshall on 4/3/2017.
 */
public interface PlayerRepository extends PagingAndSortingRepository<Player, Integer>
{
//    @Query(value = "select * from player where active = 1 order by player_id offset :startOnRow rows fetch next :numToReturn rows only"
//            , nativeQuery = true)
//    Iterable<Player> getAllActivePlayers(@Param("startOnRow") Integer startOnRow, @Param("numToReturn") Integer numToReturn);

//    @Query(value = "select * from player where active = 1 "
//            , nativeQuery = false)
//    Page<Player> getAllActivePlayersByPage(Pageable pageRequest);


    Page<Player> findAllByActive(Integer active, Pageable pageRequest);


//continue building back on pagination adding variables for start point and return value

//    @Query(value = "select * from player where active = 1 and position = :position"
//            , nativeQuery = true)
//    Iterable<Player> getAllActivePlayersByPosition(@Param("position") String position);


    Page<Player> findAllByActiveAndPosition(Integer active, String position, Pageable pageable);
}
