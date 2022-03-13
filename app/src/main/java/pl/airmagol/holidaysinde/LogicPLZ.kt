package pl.airmagol.holidaysinde

open class LogicPLZ {


    private val checkPrefix = CheckPrefix()
    private var response = ""

    fun findLand(plz: String): String {
// prefix 0
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


            }
        }
    return response
    }
}

