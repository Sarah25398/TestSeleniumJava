import org.testng.annotations.Test;

import java.util.Random;
import java.util.UUID;
import java.util.stream.DoubleStream;

public class TestUUID {
    public static String getUserNameData(){
        String userName = UUID.randomUUID().toString();
        return userName + "@yomail.com";
    };
    @Test
    public void DataUUID(){
        System.out.println(getUserNameData());
        DoubleStream randomNoStream = DoubleStream.of(new Random().nextInt());
        // print a random double value
        randomNoStream.limit(1).forEach( i -> System.out.println(i));

    }
}
