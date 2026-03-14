module hallbooking.org.exaple.hallbooking {
    requires javafx.controls;
    requires javafx.fxml;


    opens hallbooking.org.exaple.hallbooking to javafx.fxml;
    exports hallbooking.org.exaple.hallbooking;
}