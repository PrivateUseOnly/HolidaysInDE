package pl.airmagol.holidaysinde

class ResponseZipcode {
    private val zipcodeInLand = "This zipcode is from land: "
    private val isAnException = " but there is an exception: "
    private val butThereAreExceptions = "but there are: "
    private val inLand = "are in Land: "

    fun withoutExceptions(land1 : String) : String {
        return "$zipcodeInLand $land1"
    }

    fun withOneException(land1: String, land2: String, city: String):String{
        return "$zipcodeInLand $land1 $isAnException $city $inLand: $land2"
    }

    fun withMoreExceptions(land1: String, land2: String, cities: String) : String{
        return "$zipcodeInLand $land1 $butThereAreExceptions $cities $inLand: $land2"
    }
}

class ResponseHolidays {
    private lateinit var holidays : String
    val consNeuJahrAll = "01.01, "
    val cons3Koenige = "06.01, " //Baden, Bayer, Sachen-Anhalt
    val consWomensDay = " 08.03,  " // Berlin
    val moKarFreitagAll = "15.04, " // -> 07.04.2023
    val moOsterMontagAll = "18.04, " // ->10.04.2023
    val consTagDerArbeitAll = "01.05, "
    val moChristiHimmelfahrtAll = "26.05, " // ->18.05.2023
    val moPfingstMontagAll = "06.06, " // -> 29.05.2023
    val moFronleichnam = "16.06, " // Baden, Bayern, Hessen, NRW, Rheinland, Saarland, Sachs&Thur some -> 08.06.2023
    val exceptionsFrohnleichnamSachen = "16.06 - some Areas in  Sachsen"
    val exceptonsFronleichnamThuringen = "16.06 - some Areas in Thüringen"
    val consAugsburgerFriedenfest = " 08.08 (Augsburg only) " // AugsburgCiy
    val consMariaHimmelfahrt = "15.08, " // Saarland, some Bayern (plz from to)
    val exceptionMariaHimmelfartBayern = "15.08 (90% of Bayern), "
    val consWeltKindTag = "20.09" // Thuringen
    val consTagDerDeutscherEinheitAll = "03.10, "
    val consReformationsTag = "31.10, " // Brand, Brem, Ham, Meck, Nied, Sach, SachAnh, Schle, Thu
    val consAllerheiligen = "01.11, " // Bad, Bay, NRW, Rhe, Saa
    val moBusBett = "16.11, " // Sachsen -> 22.11.2023
    val xmasAll = " 25.12, 26.12."

    fun showHolidays(land: String) : String{


        when (land) {
            "Baden" -> {
                holidays = badenHolidays()
            }
            "Bayern" -> {
                holidays = bayernHolidays()
            }
            "Berlin" -> {
                holidays = berlinHolidays()
            }
            "Brandenburg" -> {
                holidays = brandenburgHolidays()
            }
            "Bremen" -> {
                holidays = bremenHolidays()
            }
            "Hamburg" -> {
                holidays = hamburgHolidays()
            }
            "Hessen" -> {
                holidays = hessenHolidays()
            }
            "Mecklenburg" -> {
                holidays = mecklenburgHolidays()
            }
            "Niedersachsen" -> {
                holidays = niedersachsenHolidays()
            }
            "Nrw" -> {
                holidays = nrwHolidays()
            }
            "Rheinland" -> {
                holidays = rheinlandHolidays()
            }
            "Saarland" -> {
                holidays = saarlandHolidays()
            }
            "Sachsen" -> {
                holidays = sachsenHolidays()
            }
            "SachenAnhalt" -> {
                holidays = sachsenAnhaltHolidays()
            }
            "Schelswig" -> {
                holidays = schleswigHolidays()
            }
            "Thüringen" -> thuringenHolidays()
        }
        return holidays
    }

    private fun badenHolidays() : String {
        return consNeuJahrAll+cons3Koenige+moKarFreitagAll+moOsterMontagAll+
                consTagDerArbeitAll+moChristiHimmelfahrtAll+moPfingstMontagAll+
                moFronleichnam+consTagDerDeutscherEinheitAll+consAllerheiligen+xmasAll
    }

    private fun bayernHolidays() : String {
        return consNeuJahrAll+cons3Koenige+moKarFreitagAll+moOsterMontagAll+
                consTagDerArbeitAll+moChristiHimmelfahrtAll+moPfingstMontagAll+
                moFronleichnam+consAugsburgerFriedenfest+exceptionMariaHimmelfartBayern+
                consTagDerDeutscherEinheitAll+consAllerheiligen+xmasAll
    }

    private fun berlinHolidays() : String {
        return consNeuJahrAll+consWomensDay+moKarFreitagAll+moOsterMontagAll+
                consTagDerArbeitAll+moChristiHimmelfahrtAll+moPfingstMontagAll+
                consTagDerDeutscherEinheitAll+xmasAll
    }

    private fun brandenburgHolidays() : String{
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+consTagDerDeutscherEinheitAll+
                consReformationsTag+xmasAll
    }

    private fun bremenHolidays() : String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+consTagDerDeutscherEinheitAll+
                consReformationsTag+xmasAll
    }

    private fun hamburgHolidays() : String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+consTagDerDeutscherEinheitAll+
                consReformationsTag+xmasAll
    }

    private fun hessenHolidays(): String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+moFronleichnam+
                consTagDerDeutscherEinheitAll+xmasAll
    }

    private fun mecklenburgHolidays(): String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+
                consTagDerDeutscherEinheitAll+consReformationsTag+xmasAll
    }

    private fun niedersachsenHolidays() :String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+
                consTagDerDeutscherEinheitAll+consReformationsTag+xmasAll
    }

    private fun nrwHolidays(): String{
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+moFronleichnam+
                consTagDerDeutscherEinheitAll+consAllerheiligen+xmasAll
    }

    private fun rheinlandHolidays() : String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+moFronleichnam+
                consTagDerDeutscherEinheitAll+consAllerheiligen+xmasAll
    }

    private fun saarlandHolidays() : String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+moFronleichnam+consMariaHimmelfahrt+
                consTagDerDeutscherEinheitAll+consAllerheiligen+xmasAll
    }

    private fun sachsenHolidays() : String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+exceptionsFrohnleichnamSachen+
                consTagDerDeutscherEinheitAll+consReformationsTag+moBusBett+xmasAll
    }

    private fun sachsenAnhaltHolidays() : String {
        return consNeuJahrAll+cons3Koenige+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+
                consTagDerDeutscherEinheitAll+consReformationsTag+xmasAll
    }

    private fun schleswigHolidays() : String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+
                consTagDerDeutscherEinheitAll+consReformationsTag+xmasAll
    }

    private fun thuringenHolidays() : String {
        return consNeuJahrAll+moKarFreitagAll+moOsterMontagAll+consTagDerArbeitAll+
                moChristiHimmelfahrtAll+moPfingstMontagAll+exceptonsFronleichnamThuringen+
                consWeltKindTag+consTagDerDeutscherEinheitAll+consReformationsTag+xmasAll
    }
}
