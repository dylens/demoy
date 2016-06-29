package fory.powermock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.easymock.PowerMock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(StaticClass.class)
public class MainClassTest {

    public static final String DYE = "dye";
    MainClass mainClass = new MainClass();

    @Test
    public void testMake() throws Exception {
        PowerMock.mockStatic(StaticClass.class);
        PowerMock.expectPrivate(StaticClass.class, "get", DYE).andReturn("hello dye");

        PowerMock.replayAll();
        Assert.assertEquals(9, mainClass.make(DYE));
    }
}