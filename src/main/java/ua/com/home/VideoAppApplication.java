package ua.com.home;

import inet.ipaddr.IPAddressString;
import inet.ipaddr.ipv4.IPv4Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class VideoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoAppApplication.class, args);
        IPv4Address loopbackv4 = new IPAddressString("93.92.87.7").
                getAddress().toIPv4();
        int val = loopbackv4.intValue();
        System.out.println(val);
        IPv4Address backAgainv4 = new IPv4Address(val);
        System.out.println(backAgainv4);
    }

}
