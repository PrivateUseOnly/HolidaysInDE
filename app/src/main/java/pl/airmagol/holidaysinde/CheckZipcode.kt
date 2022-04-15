package pl.airmagol.holidaysinde

open class CheckZipcode {

    private val response = ResponseZipcode()

    private val thueringen = "Thüringen"
    private val sachsenAnhalt = "Sachsen-Anhalt"
    private val berlin = "Berlin"
    private val mecklenburg = "Mecklenburg-Vorpommern"
    private val niedersachsen = "Niedersachsen"
    private val hamburg = "Hamburg"
    private val schleswig = "Schleswig-Holstein"
    private val bremen = "Bremen"
    private val nrw = "Nordrhein-Westfallen"
    private val hessen = "Hessen"
    private val rheinland = "Rheinland-Pfalz"
    private val bayern = "Bayern"
    private val saarland = "Saarland"
    private val baden = "Baden-Württemberg"
    val invalidZipcode = "Invalid Zipcode"

    var exceptionsCityCounter = 0
    lateinit var exceptions : String
    var land1: Int = 0
    var land2: Int = 0

    fun checkInPrefixZero(checkedZipcode: Int): Int {
        when (checkedZipcode) {

            in 1067..1936 -> {
                //sachsen
                land1 = R.string.sachsen
            }

            in 1945..1998 -> {
                land1 = R.string.brandenburg
            }

            in 2625..2999 -> {
                land1 = R.string.sachsen
            }

            in 4103..4579 -> {
                land1 = R.string.sachsen
            }

            in 4600..4639 -> {
                land1 = thueringen
            }

            in 4643..4938 -> {
                land1 = R.string.sachsen
            }

            in 4895..4938 -> {
                land1 = R.string.brandenburg
            }

            in 6108..6548 -> {
                land1 = sachsenAnhalt
            }

            in 6556..6578 -> {
                land1 = thueringen
            }

            in 6618..6928 -> {
                land1 = sachsenAnhalt
            }

            in 7318..7907 -> {
                land1 = thueringen
            }

            7919 -> {
                exceptionsCityCounter = 2
                exceptions = "Langenback, Mühltroff"
                land1 = thueringen
                land2 = R.string.sachsen
            }

            in 7922..7950 -> {
                land1 = thueringen
            }

            7952 -> {
                exceptionsCityCounter = 1
                land1 = thueringen
                land2 = R.string.sachsen
                exceptions = "Pausa"
            }

            in 7955..7980 -> {
                land1 = thueringen
            }
            7985 -> {
                exceptionsCityCounter = 2
                land1 = thueringen
                land2 = R.string.sachsen
                exceptions = "Elsterberg, Rentzschmühle"
            }

            in 7987..7989 -> {
                land1 = thueringen
            }

            in 8056..9669 -> {
                land1 = R.string.sachsen
            }
            else -> land1 = R.string.invalid
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }
    fun checkInPrefixOne(checkedZipcode: Int): String {
        when (checkedZipcode) {
            in 10115..12527 -> {
                land1 = berlin
            }
            12529 -> {
                land1 = R.string.brandenburg
            }
            in 12555..12623 -> {
                land1 = berlin
            }
            12625 -> {
                land1 = R.string.brandenburg
            }
            in 12627..14199 -> {
                land1 = berlin
            }
            in 14467..14712 -> {
                land1 = R.string.brandenburg
            }
            14715 -> {
                exceptionsCityCounter = 8
                land1 = R.string.brandenburg
                land2 = sachsenAnhalt
                exceptions = "Ferchels, Mahlitz, Molkenberg, Neumolkenberg, Neuschollene, Neuwartensleben, Nierow, Schollene"
            }
            in 14727..16949 -> {
                land1 = R.string.brandenburg
            }
            in 17033..17255 -> {
                land1 = mecklenburg
            }
            17285 -> {
                exceptionsCityCounter = 1
                land1 = mecklenburg
                land2 = R.string.brandenburg
                exceptions = "Beenz"
            }
            17259 -> {
                land1 = mecklenburg
            }
            17268 -> {
                land1 = R.string.brandenburg
                land2 = mecklenburg
                exceptions = "Tackmannshof"
            }
            in 17279..17291 -> {
                land1 = R.string.brandenburg
            }
            in 17309..17322 -> {
                land1 = mecklenburg
            }
            17326 -> {
                land1 = R.string.brandenburg
            }
            in 17328..17335 -> {
                land1 = mecklenburg
            }
            17337 -> {
                exceptionsCityCounter = 1
                land1 = mecklenburg
                land2 = R.string.brandenburg
                exceptions = "Uckerland"
            }
            in 17348..19260 -> {
                land1 = mecklenburg
            }
            19723 -> {
                exceptionsCityCounter = 13
                land1 = niedersachsen
                land2 = mecklenburg
                exceptions = "Bandekow, Bleckederwerder, Brahlstorf,\n" +
                            " Dammereez, Groß Timkenberg, Gülze, Hinterhagen, Langenheide, Melkof,\n" +
                            " Schleusenow, Soltow, Teldau, Vorderhagen"
            }
            in 19288..19306 -> {
                land1 = mecklenburg
            }
            in 19309..19348 -> {
                land1 = R.string.brandenburg
            }
            19357 -> {
                exceptionsCityCounter = 2
                land1 = R.string.brandenburg
                land2 = mecklenburg
                exceptions = "Dambeck, Klüß"
            }
            in 19370..19417 -> {
                land1 = mecklenburg
            }
            else -> {
                land1 = R.string.invalid
            }
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixTwo(checkedZipcode: Int): String {
        when (checkedZipcode) {
            in 20095..21037 -> {
                land1 = hamburg
            }
            21039 -> {
                exceptionsCityCounter = 1
                land1 = schleswig
                land2 = hamburg
                exceptions = "hamburg"
            }
            in 21073..21149 -> {
                land1 = hamburg
            }
            in 21217..21449 -> {
                land1 = niedersachsen
            }
            in 21465..21521 -> {
                land1 = schleswig
            }
            21522 -> {
                land1 = niedersachsen
            }
            in 21524..21529 -> {
                land1 = schleswig
            }
            in 21614..21789 -> {
                land1 = niedersachsen
            }
            in 22041..22111 -> {
                land1 = hamburg
            }
            22113 -> {
                land1 = hamburg
                land2 = schleswig
                exceptions = "Oststeinbek"
            }
            in 22115..22143 -> {
                land1 = hamburg
            }
            22145 -> {
                exceptionsCityCounter = 1
                land1 = schleswig
                land2 = hamburg
                exceptions = "hamburg"
            }
            in 22147..22769 -> {
                land1 = hamburg
            }
            in 22844..23919 -> {
                land1 = schleswig
            }
            in 23923..23999 -> {
                land1 = mecklenburg
            }
            in 24103..25999 -> {
                land1 = schleswig
            }
            in 26121..27478 -> {
                land1 = niedersachsen
            }
            27498 -> {
                land1 = schleswig
            }
            27499 -> {
                land1 = hamburg
            }
            in 27568..27580 -> {
                land1 = bremen
            }
            in 27607..27809 -> {
                land1 = niedersachsen
            }
            in 28195..28779 -> {
                land1 = bremen
            }
            in 28790..29399 -> {
                land1 = niedersachsen
            }
            in 29410..29416 -> {
                land1 = sachsenAnhalt
            }
            in 29439..29699 -> {
                land1 = niedersachsen
            }
            else -> land1 = R.string.invalid
        }

        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixThree(checkedZipcode: Int): String {
        when (checkedZipcode) {
            in 30159..31868 -> {
                land1 = niedersachsen
            }
            in 32049..33829 -> {
                land1 = nrw
            }
            in 34117..34329 -> {
                land1 = hessen
            }
            34346 -> {
                land1 = niedersachsen
            }
            34355 -> {
                exceptionsCityCounter = 1
                land1 = niedersachsen
                land2 = hessen
                exceptions = "Kassel"
            }
            in 34359..34399 -> {
                land1 = hessen
            }
            in 34414..34439 -> {
                land1 = nrw
            }
            in 34454..36399 -> {
                land1 = hessen
            }
            in 36404..36469 -> {
                land1 = thueringen
            }
            in 37073..37191 -> {
                land1 = niedersachsen
            }
            37194 -> {
                exceptionsCityCounter = 1
                land1 = niedersachsen
                land2 = hessen
                exceptions ="Wahlsburg"
            }
            in 37197..37199 -> {
                land1 = niedersachsen
            }
            in 37213..37299 -> {
                land1 = hessen
            }
            in 37308..37359 -> {
                land1 = thueringen
            }
            in 37412..37649 -> {
                land1 = niedersachsen
            }
            in 37671..37688 -> {
                land1 = nrw
            }
            37691 -> {
                land1 = niedersachsen
            }
            37696 -> {
                land1 = nrw
            }
            in 37697..38479 -> {
                land1 = niedersachsen
            }
            in 38486..38489 -> {
                land1 = sachsenAnhalt
            }
            in 38518..38729 -> {
                land1 = niedersachsen
            }
            in 38820..39649 -> {
                land1 = sachsenAnhalt
            }
            else -> land1 = R.string.invalid
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixFour(checkedZipcode: Int): String {
        when (checkedZipcode) {
            in 40210..48432 -> {
                land1 = nrw
            }
            in 48455..48465 -> {
                land1 = niedersachsen
            }
            48477 -> {
                land1 = nrw
            }
            48480 -> {
                land1 = niedersachsen
            }
            48485 -> {
                land1 = nrw
            }
            48488 -> {
                land1 = niedersachsen
            }
            in 48493..49496 -> {
                land1 = nrw
            }
            in 48499..48513 -> {
                land1 = niedersachsen
            }
            in 48565..48739 -> {
                land1 = nrw
            }
            in 49074..49459 -> {
                land1 = niedersachsen
            }
            in 49477..49549 -> {
                land1 = nrw
            }
            in 49565..49849 -> {
                land1 = niedersachsen
            }
            else -> land1 = R.string.invalid
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixFive(checkedZipcode: Int):String {
        when(checkedZipcode) {
            50126 -> {
                land1 = rheinland
            }
            in 51643..53359 -> {
                land1 = nrw
            }
            in 53424..53579 -> {
                land1 = rheinland
            }
            53604 -> {
                land1 = nrw
            }
            53619 -> {
                land1 = rheinland
            }
            in 53639..53949 -> {
                land1 = nrw
            }
            in 54290..55239 -> {
                land1 = rheinland
            }
            in 55246..55252 -> {
                land1 = hessen
            }
            in 55257..56869 -> {
                land1 = rheinland
            }
            in 57072..57489 -> {
                land1 = nrw
            }
            in 57518..57648 -> {
                land1 = rheinland
            }
            in 58089..59964 -> {
                land1 = nrw
            }
            59969 -> {
                exceptionsCityCounter = 1
                land1 = nrw
                land2 = hessen
                exceptions = "Bromskirchen"
            }
            else -> land1 = R.string.invalid
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixSix(chechedZipcode: Int):String {
        when(chechedZipcode) {
            in 60308..63699 -> {
                land1 = hessen
            }
            in 63739..63773 -> {
                land1 = bayern
            }
            63776 -> {
                exceptionsCityCounter = 1
                land1 = bayern
                land2 = hessen
                exceptions = "Hüttelngesäß"
            }
            in 63785..63927 -> {
                land1 = bayern
            }
            63928 -> {
                exceptionsCityCounter = 1
                land1 = bayern
                land2 = baden
                exceptions = "Spritzenmühle"
            }
            in 63930..63939 -> {
                land1 = bayern
            }
            in 64283..64753 -> {
                land1 = hessen
            }
            64754 -> {
                exceptionsCityCounter = 1
                land1 = hessen
                land2 = baden
                exceptions = "Badisch Schöllenbach"
            }
            in 64756..65321 -> {
                land1 = hessen
            }
            65326 -> {
                exceptionsCityCounter = 1
                land1 = hessen
                land2 = rheinland
                exceptions = "Sandersmühle"
            }
            in 65329..65388 -> {
                land1 = hessen
            }
            65391 -> {
                exceptionsCityCounter = 1
                land1 = hessen
                land2 = rheinland
                exceptions = "Sauerthal"
            }
            in 65396..65556 -> {
                land1 = hessen
            }
            in 65558..65582 -> {
                land1 = rheinland
            }
            in 65589..65620 -> {
                land1 = hessen
            }
            in 65623..65626 -> {
                land1 = rheinland
            }
            65627 -> {
                land1 = hessen
            }
            65629 -> {
                land1 = rheinland
            }
            in 65719..65936 -> {
                land1 = hessen
            }
            in 66111..66459 -> {
                land1 = saarland
            }
            in 66482..66509 -> {
                land1 = rheinland
            }
            in 66538..66839 -> {
                land1 = saarland
            }
            in 66849..67829 -> {
                land1 = rheinland
            }
            in 68159..68309 -> {
                land1 = baden
            }
            68519 -> {
                land1 = hessen
            }
            in 68526..68549 -> {
                land1 = baden
            }
            in 68623..68649 -> {
                land1 = hessen
            }
            in 68723..69234 -> {
                land1 = baden
            }
            69239 -> {
                land1 = hessen
            }
            in 69242..69259 -> {
                land1 = baden
            }
            69412 -> {
                exceptionsCityCounter = 1
                land1 = baden
                land2 = hessen
                exceptions = "Igelsbach"
            }
            in 69427..69434 -> {
                land1 = baden
            }
            69434 -> {
                exceptionsCityCounter = 1
                land1 = baden
                land2 = hessen
                exceptions = "Hirschhorn"
            }
            in 69436..69469 -> {
                land1 = baden
            }
            in 69483..69488 -> {
                land1 = hessen
            }
            in 69493..69514 -> {
                land1 = baden
            }
            in 69517..69518 -> {
                land1 = hessen
            }
            else -> {
                land1 = R.string.invalid
            }
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixSeven(checkedZipcode: Int): String {
        when(checkedZipcode) {
            in 70173..74592 -> {
                land1 = baden
            }
            74594 -> {
                exceptionsCityCounter = 1
                land1 = baden
                land2 = bayern
                exceptions = "Gumpenweiler"
            }
            in 74595..76709 -> {
                land1 = baden
            }
            in 76726..76891 -> {
                land1 = rheinland
            }
            in 77652..79879 -> {
                land1 = baden
            }
            else -> {
                land1 = R.string.invalid
            }
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixEight(checkedZipcode: Int): String {
        when(checkedZipcode) {
            in 80331..87789 -> {
                land1 = bayern
            }
            in 88045..88099 -> {
                land1 = baden
            }
            in 88131..88145 -> {
                land1 = bayern
            }
            88147 -> {
                exceptionsCityCounter = 1
                land1 = bayern
                land2 = baden
                exceptions = "Achberg"
            }
            in 88149..88179 -> {
                land1 = bayern
            }
            in 88212..89079 -> {
                land1 = baden
            }
            89081 -> {
                exceptionsCityCounter = 1
                land1 = baden
                land2 = bayern
                exceptions = "Seligweiler"
            }
            in 89129..89198 -> {
                land1 = baden
            }
            in 89231..89447 -> {
                land1 = bayern
            }
            in 89518..89619 -> {
                land1 = baden
            }
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }

    fun checkInPrefixNine(checkedZipcode: Int): String {
        when(checkedZipcode) {
            in 90402..96489 -> {
                land1 = bayern
            }
            in 96515..96529 -> {
                land1 = thueringen
            }
            in 97070..97859 -> {
                land1 = bayern
            }
            97877 -> {
                land1 = baden
            }
            in 97892..97895 -> {
                land1 = bayern
            }
            97896 -> {
                exceptionsCityCounter = 1
                land1 = bayern
                land2 = baden
                exceptions = "Freudenberg"
            }
            97900 -> {
                land1 = baden
            }
            in 97901..97909 -> {
                land1 = bayern
            }
            in 97922..97999 -> {
                land1 = baden
            }
            in 98527..99998 -> {
                land1 = thueringen
            }
            else -> land1 = R.string.invalid
        }
        return when {
            exceptionsCityCounter > 1 -> {
                response.withMoreExceptions(land1, land2, exceptions)
            }
            exceptionsCityCounter == 1 -> {
                response.withOneException(land1, land2, exceptions)
            }
            else -> {
                response.withoutExceptions(land1)
            }
        }
    }
}