for (int i = 0; i < log.length(); i++) {
    char c = log.charAt(i);
    
    if (c == '=') {
        if (i + 1 < log.length() && log.charAt(i + 1) == '=') {
            tokens.add("EQUALS_OPERATOR");
            i++; 
        } else {
            tokens.add("ASSIGNMENT");
        }
    }
}
