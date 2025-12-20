String state = "PENDING";
boolean processing = true;

while (processing) {
    if (state.equals("PENDING")) {
        state = "PAID"; 
    } else if (state.equals("PAID")) {
        state = "SHIPPED";
    } else if (state.equals("SHIPPED")) {
        processing = false; 
    } else {
        processing = false;
    }
}
