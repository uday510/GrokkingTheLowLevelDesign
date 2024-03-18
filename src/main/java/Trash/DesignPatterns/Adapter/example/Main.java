package Trash.DesignPatterns.Adapter.example;

import Trash.DesignPatterns.Adapter.example.adapter.USB_A;
import Trash.DesignPatterns.Adapter.example.adapter.USB_C_Device;
import Trash.DesignPatterns.Adapter.example.adapter.USB_C_to_USB_A_Adapter;

public class Main {
    public static void main(String[] args) {

        // Device with USB-C
        USB_C_Device usb_c_device = new USB_C_Device();

        // Adapter that converts USB-C to USB-A
        USB_A usbAAdapter = new USB_C_to_USB_A_Adapter(usb_c_device);

        // Connect USB-A to USB-C device
        usbAAdapter.connectUSB_A();
    }
}
