package pl.airmagol.holidaysinde

open class LogicPLZ {


    private val checkPrefix = CheckPrefix()
    private var response = ""

    fun findLand(plz: String): String {
        checkPrefix.exceptionsCityCounter = 0
        when (plz.toInt()) {
            in 0..9999 -> {
                response = checkPrefix.checkPrefixZero(plz.toInt())
            }
            in 10000..19999 -> {
                response = checkPrefix.checkPrefixOne(plz.toInt())
            }
            in 20000..29999 -> {
                response = checkPrefix.checkPrefixTwo(plz.toInt())

            }
            in 30000..39999 -> {
                response = checkPrefix.checkPrefixThree(plz.toInt())

            }
            in 40000..49999 -> {
                response = checkPrefix.checkPrefixFour(plz.toInt())
            }
            in 50000..59999 -> {
                response = checkPrefix.checkPrefixFive(plz.toInt())
            }
            in 60000..69999 -> {response = checkPrefix.checkPrefixSix(plz.toInt())}
            in 70000..79999 -> {response= checkPrefix.checkPrefixSeven(plz.toInt())}
            in 80000..89999 -> {response = checkPrefix.checkPrefixEight(plz.toInt())}
            in 90000..99999 -> {response = checkPrefix.checkPrefixNine(plz.toInt())}
        }
    return response
    }
}

