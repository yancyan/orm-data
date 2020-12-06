import com.orm.OrmApplication;
import com.orm.dao.jpa.SysUserRepository;
import com.orm.dao.jpa.UserRepository;
import com.orm.domain.SysUser;
import com.orm.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.util.Streamable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Junit5
 * ${ @BeforeAll 类似于JUnit 4的@BeforeAll,表示使用了该注解的方法应该在当前类中所有使用了@Test、@RepeatedTest、@ParameterizedTest或者@TestFactory注解的方法之前执行,必须为static
 * ${ @BeforeEach 类似于JUnit 4的@Before,表示使用了该注解的方法应该在当前类中每一个使用了@Test、@RepeatedTest、@ParameterizedTest或者@TestFactory注解的方法之前执行
 * ${ @Test 表示该方法是一个测试方法
 * ${ @DisplayName 为测试类或测试方法声明一个自定义的显示名称
 * ${ @AfterEach 类似于JUnit 4的@After,表示使用了该注解的方法应该在当前类中每一个使用了@Test、@RepeatedTest、@ParameterizedTest或者@TestFactory注解的方法之后执行
 * ${ @AfterAll 类似于JUnit 4的@AfterClass,表示使用了该注解的方法应该在当前类中所有使用了@Test、@RepeatedTest、@ParameterizedTest或者@TestFactory注解的方法之后执行,必须为static
 * ${ @Disable 用于禁用一个测试类或测试方法, 类似于JUnit 4的@Ignore
 * ${ @ExtendWith 用于注册自定义扩展
 */
//@DisplayName("测试-用户表")
//@ExtendWith(SpringExtension.class)
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrmApplication.class)
//@AutoConfigureMockMvc
public class BatchInsertUserTest {

    @Resource
    private UserRepository ur;

    @Resource
    private SysUserRepository sr;

    @Test
    public void test() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            User r = new User();
            r.setName("testName_" + i);
            r.setAge(100L + i);
            users.add(r);
        }
        ur.saveAll(users);
    }

    @Test
    public void test_customRepository() {
        sr.findOptionById(1L).ifPresent(su -> System.out.println("####### " + su.toString()));
    }
    @Test
    public void test_stream() {
        Streamable<SysUser> stre = sr.findByUsernameContaining("name");
    }

    @Test
    public void test_events() {

        SysUser r = new SysUser();
        r.setUsername("_testName_");
        r.setPassword("123456");
        r.setAge(100L);

        sr.save(r);
    }
}
