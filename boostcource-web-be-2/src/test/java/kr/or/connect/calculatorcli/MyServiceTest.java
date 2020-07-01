package kr.or.connect.calculatorcli;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = {ApplicationConfig.class})
@RunWith(MockitoJUnitRunner.class)
public class MyServiceTest {

    // @InjectMocks가 붙은 필드는 Mock 객체를 사용하는 MyService 객체를 생성하여 초기화하라는 의미
    // 또한, 객체를 직접 생성하지 않아도 자동으로 객체가 생성되고 해당 필드가 초기화됨.
    @InjectMocks
    MyService myService;

    // @Mock은 calculatorService가 Mock 객체를 참조하도록 한다.
    // 즉, 객체를 직접 생성하지 않아도 자동으로 객체가 생성되고 해당 필드가 초기화됨.
    @Mock
    CalculatorService calculatorService;

    @Test
    public void execute() {
        // given
        int value1 = 5;
        int value2 = 10;

        // param에 어떤 값을 주어더 plux(5. 10)은 15를 리턴해야 한다!
        given(calculatorService.plus(5, 10)).willReturn(15);

        // when
        int result = myService.execute(value1, value2);

        // then

        // verify() : 파라미터로 들어온 객체의 plus 메소드가 호출된 적이 있는지 검증
        // anyInt를 활용해 어떤 정수든지 2개를 파라미터로 넣어서 plus() 메소드를 호출했는 지 검증함.
        verify(calculatorService).plus(anyInt(), anyInt());
        Assert.assertEquals(result, 30);
    }
}