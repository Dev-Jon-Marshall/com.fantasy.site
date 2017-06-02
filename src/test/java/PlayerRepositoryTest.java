import com.fantasy.site.Application;
import com.fantasy.site.configuration.RepositoryConfiguration;
import com.fantasy.site.domain.Player;
import com.fantasy.site.repositories.PlayerRepository;
import com.fantasy.site.services.PlayerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import static org.junit.Assert.*;
/**
 * Created by Jonathan.Marshall on 4/25/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class PlayerRepositoryTest
{

    final static Integer PAGE_SIZE = 20;

    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerService playerService;

    @Test
    public void testPage()
    {
        PageRequest pageRequest = new PageRequest(1, PAGE_SIZE);
        Page<Player> playerPageable = playerRepository.findAll(pageRequest);
        System.out.println("Total Pages: " + playerPageable.getTotalPages());
        assertEquals(20, playerPageable.getSize());
    }

    @Test
    public void testPageActive()
    {
        PageRequest pageRequest = new PageRequest(1, PAGE_SIZE);
        Page<Player> playerPageable = playerRepository.findAllByActive(1, pageRequest);
        System.out.println("Total Pages: " + playerPageable.getTotalPages());
        assertEquals(20, playerPageable.getSize());
    }

    @Test
    public void testPageActiveByPositionRB()
    {
        PageRequest pageRequest = new PageRequest(1, PAGE_SIZE);
        Page<Player> playerPageable = playerRepository.findAllByActiveAndPosition(1, "RB", pageRequest);
        System.out.println("Total Pages: " + playerPageable.getTotalPages());
        assertEquals(20, playerPageable.getTotalPages());
    }

    @Test
    public void testPageActiveByPositionWR()
    {
        PageRequest pageRequest = new PageRequest(1, PAGE_SIZE);
        Page<Player> playerPageable = playerRepository.findAllByActiveAndPosition(1, "WR", pageRequest);
        System.out.println("Total Pages: " + playerPageable.getTotalPages());
        assertEquals(34, playerPageable.getTotalPages());
    }


}
