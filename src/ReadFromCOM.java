import com.fazecast.jSerialComm.SerialPort;

import java.io.InputStream;

public class ReadFromCOM {

    public static void main(String[] args) {

        // Datatype til værdien
        String valueFromScanner = "";


        // Kode til at læse fra scanneren med COM8
        SerialPort comPort = SerialPort.getCommPort("COM8");
        comPort.openPort();
        comPort.setComPortTimeouts(SerialPort.TIMEOUT_READ_SEMI_BLOCKING, 0, 0);
        InputStream in = comPort.getInputStream();
        try {
            for (int j = 0; j < 10; ++j) {
                // System.out.print((char) in.read());
                valueFromScanner = valueFromScanner + (char) in.read();
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        comPort.closePort();


        // Gør noget med værdien fra scanneren
        System.out.println("Værdien er: " + valueFromScanner);

    }

}