import com.fantasy.site.Application;
import com.fantasy.site.domain.Owner;
import com.fantasy.site.repositories.OwnerRepository;
import com.fantasy.site.services.OwnerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import static org.junit.Assert.*;
/**
 * Created by Jonathan.Marshall on 5/9/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class OwnerRepositoryTest
{
    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    OwnerService ownerService;


    @Test
    public void testGetOwnerByContactId()
    {
        Owner testOwner = ownerRepository.findByContactInfoContactInfoId(1);
        assertEquals(Integer.valueOf(1), testOwner.getOwnerId());
    }

}
