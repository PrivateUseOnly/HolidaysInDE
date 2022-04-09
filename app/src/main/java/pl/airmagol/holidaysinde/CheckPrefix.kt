package pl.airmagol.holidaysinde

open class CheckPrefix {
    private val brandenburg = "Brandenburg"
    private val sachsen = "Sachsen"
    private val thueringen = "Thüringen"
    private val sachsenAnhalt = "Sachsen-Anhalt"
    private val berlin = "Berlin"
    private val mecklenburg = "Mecklenburg-Vorpommern"
    private val niedersachsen = "Niedersachsen"
    private val hamburg = "Hamburg"
    private val schleswig = "Schleswig-Holstein"
    private val invalidZipcode = "Invalid Zipcode"
    private var exceptionsCityCounter = 0
    private lateinit var answer: String


    fun checkPrefixZero(checkedZipcode: Int): String {
        when (checkedZipcode) {

            in 1067..1936 -> {
                answer = sachsen
            }

            in 1945..1998 -> {
                answer = brandenburg
            }

            in 2625..2999 -> {
                answer = sachsen
            }

            in 4103..4579 -> {
                answer = sachsen
            }

            in 4600..4639 -> {
                answer = thueringen
            }

            in 4643..4938 -> {
                answer = sachsen
            }

            in 4895..4938 -> {
                answer = brandenburg
            }

            in 6108..6548 -> {
                answer = sachsenAnhalt
            }

            in 6556..6578 -> {
                answer = thueringen
            }

            in 6618..6928 -> {
                answer = sachsenAnhalt
            }

            in 7318..7907 -> {
                answer = thueringen
            }

            7919 -> {
                exceptionsCityCounter = 2
                answer =
                    "$thueringen, $sachsen: Langenback Mühltroff"
            }

            in 7922..7950 -> {
                answer = thueringen
            }

            7952 -> {
                exceptionsCityCounter = 1
                answer = "$thueringen, $sachsen: Pausa"
            }

            in 7955..7980 -> {
                answer = thueringen
            }
            7985 -> {
                exceptionsCityCounter = 2
                answer = "$thueringen, $sachsen: Elsterberg, Rentzschmühle"
            }

            in 7987..7989 -> {
                answer = thueringen
            }

            in 8056..9669 -> {
                answer = sachsen
            }
            else -> answer = invalidZipcode
        }
        return answer
    }

    fun checkPrefixOne(checkedZipcode:Int):String{
        when (checkedZipcode) {
            in 10115..12527 -> {
                answer = berlin
            }

            12529 -> {
                answer = brandenburg
            }

            in 12555..12623 -> {
                answer = berlin
            }

            12625 -> {
                answer = brandenburg
            }

            in 12627..14199 -> {
                answer = berlin
            }

            in 14467..14712 -> {
                answer = brandenburg
            }

            14715 -> {
                exceptionsCityCounter = 8
                answer =
                    "$brandenburg, $sachsenAnhalt: Ferchels, Mahlitz, Molkenberg, Neumolkenberg, Neuschollene, Neuwartensleben, Nierow, Schollene"
            }

            in 14727..16949 -> {
                answer = brandenburg
            }

            in 17033..17255 -> {
                answer = mecklenburg
            }

            17285 -> {
                exceptionsCityCounter = 1
                answer = "$mecklenburg, $brandenburg: Beenz"
            }

            17259 -> {
                answer = mecklenburg
            }

            17268 -> {
                answer = "$brandenburg, $mecklenburg: Tackmannshof"
            }

            in 17279..17291 -> {
                answer = brandenburg
            }

            in 17309..17322 -> {
                answer = mecklenburg
            }

            17326 -> {
                answer = brandenburg
            }

            in 17328..17335 -> {
                answer = mecklenburg
            }

            17337 -> {
                exceptionsCityCounter = 1
                answer = "$mecklenburg, $brandenburg: Uckerland"
            }

            in 17348..19260 -> {
                answer = mecklenburg
            }

            19723 -> {
                exceptionsCityCounter = 13
                answer =
                    "$niedersachsen,$mecklenburg: Bandekow, Bleckederwerder, Brahlstorf,\n" +
                            " Dammereez, Groß Timkenberg, Gülze, Hinterhagen, Langenheide, Melkof,\n" +
                            " Schleusenow, Soltow, Teldau, Vorderhagen"
            }

            in 19288..19306 -> {
                answer = mecklenburg
            }

            in 19309..19348 -> {
                answer = brandenburg
            }
            19357 -> {
                exceptionsCityCounter = 2
                answer = "$brandenburg, $mecklenburg: Dambeck, Klüß"
            }
            in 19370..19417 -> {
                answer = mecklenburg
            }
            else -> {
                answer = invalidZipcode
            }
        }
        return answer
    }

    fun checkPrefixTwo(checkedZipcode:Int):String{
        when (checkedZipcode){
            in 20095..21037 -> {
                answer = hamburg
            }
            21039 -> {
                exceptionsCityCounter = 1
                answer = "$schleswig, $hamburg: Hamburg"
            }
            in 21073..21149 -> {
                answer = hamburg
            }
            in 21217..21449 -> {
                answer = niedersachsen
            }
            in 21465..21521 -> {
                answer = schleswig
            }
            21522 -> {
                answer = niedersachsen
            }
            in 21524..21529 -> {
                answer = schleswig
            }
            in 21614..21789 -> {
                answer = niedersachsen
            }
            in 22041..22111 -> {
                answer = hamburg
            }
            22113 -> {
                answer = "$hamburg, $schleswig: Oststeinbek"
            }
            else -> answer = invalidZipcode
        }

    return answer}
}