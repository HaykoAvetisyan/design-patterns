package creational_dp.builder;

public class CompTest {

    Computer computer = new Computer.ComputerBuilder(
            "500 GB", "2 GB")
            .setBluetoothEnabled(true)
            .setGraphicsCardEnabled(true)
            .build();
}
