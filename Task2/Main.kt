fun main() {
var ip1="192.168.1"
println(IPv4(ip1))
var ip2= "192.168.1.1.1"
println(IPv4(ip2))
var ip3= "192.168..1"
println(IPv4(ip3))
var ip4= "192.168.1.a"
println(IPv4(ip4))
var ip5="192.168.01.1"
println(IPv4(ip5))
var ip6= "192.01.10.1"
println(IPv4(ip6))
var ip7="192.168.5.001"
println(IPv4(ip7))
var ip8= "001.168.5.7"
println(IPv4(ip8))
var ip9="192.168.1.300"
println(IPv4(ip9))
    }

    fun IPv4(ip: String): Boolean {
       val newIpParts=ip.split(".")
       
       if(newIpParts.size == 4 && hasNoEmptyItems(newIpParts) && isAllDigit(newIpParts) &&isIpWithinRange(newIpParts) && isValidIpWithoutLeadingZeros(newIpParts)){
           return true
       }
        else{
           return false
       }
    }
    fun hasNoEmptyItems(list: List<String>): Boolean{
        for (item in list) {
        if (item.isEmpty()) {
            return false
        }
    }
    return true
    }
    fun isAllDigit(list: List<String>):Boolean{
          for (item in list) {
        if (item.toIntOrNull() == null) {
            return false
        }
    }
    return true
    }
    
       fun isIpWithinRange(list: List<String>):Boolean{
          for (item in list) {
             if (item.toInt() !in 0..255) {
            return false
             }
        }
    return true
    }
 fun isValidIpWithoutLeadingZeros(list: List<String>):Boolean{
        for (item in list) {
             if (item != item.toInt().toString()) {
            return false
             }
        }
    return true
    }
 
    
    

