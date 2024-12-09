package labs.lab5;

import java.util.regex.*;

public class IPValidator {

    public static void main(String[] args) {
        System.out.println(testIP("192.168.1.1"));     // true
        System.out.println(testIP("256.100.50.25"));   // false
        System.out.println(testIP("000.168.1.1"));   // false
    }

    public static String testIP(String ip) {
        Pattern pattern = Pattern.compile(
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$"
        );
        Matcher matcher = pattern.matcher(ip);

        if (matcher.matches()) {
            return "IP-адрес " + ip + " корректен!";
        } else {
            return "Некорректный IP-адрес: " + ip;
        }
    }
}