package pl.airmagol.holidaysinde

open class CheckPrefix {


    private val checkZipcode = CheckZipcode()
    private var response = ""

    fun findLand(plz: String): String {
        checkZipcode.exceptionsCityCounter = 0
        when (plz.toInt()) {
            in 1000..9999 -> {
                response = checkZipcode.checkInPrefixZero(plz.toInt())
            }
            in 10000..19999 -> {
                response = checkZipcode.checkInPrefixOne(plz.toInt())
            }
            in 20000..29999 -> {
                response = checkZipcode.checkInPrefixTwo(plz.toInt())
            }
            in 30000..39999 -> {
                response = checkZipcode.checkInPrefixThree(plz.toInt())
            }
            in 40000..49999 -> {
                response = checkZipcode.checkInPrefixFour(plz.toInt())
            }
            in 50000..59999 -> {
                response = checkZipcode.checkInPrefixFive(plz.toInt())
            }
            in 60000..69999 -> {
                response = checkZipcode.checkInPrefixSix(plz.toInt())
            }
            in 70000..79999 -> {
                response = checkZipcode.checkInPrefixSeven(plz.toInt())
            }
            in 80000..89999 -> {
                response = checkZipcode.checkInPrefixEight(plz.toInt())
            }
            in 90000..99999 -> {
                response = checkZipcode.checkInPrefixNine(plz.toInt())
            }
            else -> response = checkZipcode.invalidZipcode
        }
    return response
    }
}

