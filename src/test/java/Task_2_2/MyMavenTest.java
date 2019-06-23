package Task_2_2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMavenTest {

   private MyMaven myMaven;

   @Before
   public void init(){
       System.out.println("RUN");
       myMaven = new MyMaven();
   }

    @Test
    public void method1Test(){


        assertEquals(0, myMaven.method2());
    }

    @Test
    public void method2Test(){

        assertEquals(0, myMaven.method2());
    }

}
