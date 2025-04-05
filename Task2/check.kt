fun main() {
    // Valid IPs
    validateIpAddress("192.168.0.1", true, "Valid IP: 192.168.0.1")
    validateIpAddress("255.255.255.255", true, "Valid IP: 255.255.255.255")
    validateIpAddress("192.168.0.0", true, "Valid IP: 192.168.0.0")
    validateIpAddress("0.168.10.5", true, "Valid IP: 0.168.10.5")

    // Invalid IPs
    validateIpAddress("192.168.1", false, "Too few segments")
    validateIpAddress("192.168.1.1.1", false, "Too many segments")
    validateIpAddress("192.168..1", false, "Empty segment")
    validateIpAddress("192.168.1.a", false, "Non-numeric segment")
    validateIpAddress("192.168.01.1", false, "Leading zero not allowed")
    validateIpAddress("192.01.10.1", false, "Leading zero not allowed")
    validateIpAddress("192.168.5.001", false, "Leading zeros not allowed")
    validateIpAddress("001.168.5.7", false, "Leading zeros not allowed")
    validateIpAddress("192.168.1.300", false, "Segment exceeds 255")
}

fun validateIpAddress(actual: Boolean, expected: Boolean, message: String = "") {
    if (actual == expected) {
        println("Success, $message")
    } else {
        println("Fail, $message")
    }
}

