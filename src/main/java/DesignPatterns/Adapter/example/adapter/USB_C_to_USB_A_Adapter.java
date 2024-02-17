package DesignPatterns.Adapter.example.adapter;

// Adapter class that implements the USB_A interface
public class USB_C_to_USB_A_Adapter implements USB_A {
    private final USB_C_Device usb_c_device;

    public USB_C_to_USB_A_Adapter(USB_C_Device usb_c_device) {
        this.usb_c_device = usb_c_device;
    }

    @Override
    public void connectUSB_A() {
        System.out.println("USB C to USB A adapter connected to USB A");
        usb_c_device.connectUSB_C();
    }
}
