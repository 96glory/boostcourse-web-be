package kr.or.connect.calculatorcli;

import org.junit.Assert;
// import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 스프링 빈 컨테이너에서 테스트하기 위해 추가한 RunWith, ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
public class CalculatorServiceTest {

    // 스프링 빈 컨테이너에서 테스트하기 위해 추가한 Autowired
    @Autowired
    CalculatorService calculatorService;

//    @Before
//    public void init(){
//        this.calculatorService = new CalculatorService();
//    }

    @Test
    public void plus() throws Exception{
        //given
        int value1 = 10, value2 = 5;

        //when
        int result = calculatorService.plus(value1, value2);

        //then
        Assert.assertEquals(15, result);
    }

    @Test
    public void minus() throws Exception{
        //given
        int value1 = 10, value2 = 5;

        //when
        int result = calculatorService.minus(value1, value2);

        //then
        Assert.assertEquals(5, result);
    }

    @Test
    public void multiple() throws Exception{
        //given
        int value1 = 10, value2 = 5;

        //when
        int result = calculatorService.multiple(value1, value2);

        //then
        Assert.assertEquals(50, result);
    }

    @Test
    public void divide() throws Exception{
        //given
        int value1 = 10, value2 = 5;

        //when
        int result = calculatorService.divide(value1, value2);

        //then
        Assert.assertEquals(2, result);
    }

    @Test
    public void divideExceptionTest() throws Exception{
        //given
        int value1 = 10, value2 = 0;

        // when & then
        try {
            calculatorService.divide(value1, value2);
        } catch (ArithmeticException ae){
            Assert.assertTrue(true);
            return;
        }
        Assert.assertTrue(false);
    }
}