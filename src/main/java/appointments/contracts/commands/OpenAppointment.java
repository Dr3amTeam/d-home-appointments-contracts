package appointments.contracts.commands;

import lombok.Value;

@Value
public class OpenAppointment {
    private String appointmentId;
    private String customerId;
    private String employeeId;
    private String date;
    private String description;
    private String amount;
    private String payMethodId;
    private String status;
}
