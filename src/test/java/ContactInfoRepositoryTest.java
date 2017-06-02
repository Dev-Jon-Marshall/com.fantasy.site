import com.fantasy.site.Application;
import com.fantasy.site.domain.ContactInfo;
import com.fantasy.site.repositories.ContactInfoRepository;
import com.fantasy.site.services.ContactInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;
/**
 * Created by Jonathan.Marshall on 5/4/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {Application.class})
@WebAppConfiguration
public class ContactInfoRepositoryTest
{
    @Autowired
    ContactInfoRepository contactInfoRepository;

    @Autowired
    ContactInfoService contactInfoService;

    @Test
    public void getContactByEmail()
    {
        ContactInfo ci = new ContactInfo();
        ci = contactInfoRepository.findByEmailAddress("bob@bobsMail.com");

        System.out.println(ci);

        assertEquals("bob@bobsMail.com", ci.getEmailAddress());
    }




}
