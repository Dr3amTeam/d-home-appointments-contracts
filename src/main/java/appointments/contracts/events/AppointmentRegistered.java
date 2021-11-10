package appointments.contracts.events;

import lombok.Value;

import java.time.Instant;
@Value
public class AppointmentRegistered {
    private String appointmentId;
    private String customerId;
    private String employeeId;
    private String date;
    private String description;
    private String amount;
    private String payMethodId;
    private Instant occurredOn;
}
