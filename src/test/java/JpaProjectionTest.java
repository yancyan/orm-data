import com.orm.OrmApplication;
import com.orm.dao.jpa.SysUserRepository;
import com.orm.dto.projection.UserOnlyInfo;
import com.orm.dto.projection.UserOnlyProjection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

/*
SpeL 支持扩展如下。。
@Component
public class CustomBean {
    public static String getFullName(User user) {
        return "张三";
    }
}
public interface UsersOnly {
    @Value("#{@customBean.getFullName(target)}")
    String getFullName();
}

 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrmApplication.class)
public class JpaProjectionTest {


    @Autowired
    private SysUserRepository sysUserRepository;

    /**
     * 可选sql返回值
     */
    @Test
    public void test() {
        Collection<UserOnlyInfo> testName = sysUserRepository.findByUsername("testName_");
        testName.forEach(ts -> {
            System.out.println(ts.getUsername());
        });
    }

    /**
     * @Value 支持
     */
    @Test
    public void test_Value() {
        Collection<UserOnlyProjection> names = sysUserRepository.findByName("testName_");

        names.forEach(ts -> {
            System.out.println("############ " + ts.getProjectionUsername());
        });
    }
}
