package model;

public interface IShop {
    public static String[][] SHOPS = {

            {"1", "1", "PHSanta Tecla"},
            {"2", "1", "PHAhuachapan"},
            {"3", "1", "PHUniversitaria"},

            {"4", "2", "WDEscalon"},
            {"5", "2", "WDUsulutan"},
            {"6", "2", "WDAutopista Sur"},

            {"7", "3", "CWProceres"},
            {"8", "3", "CWHeroes"},
            {"9", "3", "CWPlazaMundo"},

            {"10", "4", "SBUXWorld Trade Center"},
            {"11", "4", "SBUXSan Benito"},
            {"12", "4", "SBUXProceres 2"},

            {"13", "5", "KFCSoyapango"},
            {"14", "5", "KFCAutopista Sur"},
            {"15", "5", "KFCMerliot"},

            {"16", "6", "PHPalin"},
            {"17", "6", "PHOakland Mall"},
            {"18", "6", "PHCentranorte"},

            {"19", "7", "SBUXPradera Concepcion"},
            {"20", "7", "SBUXFontabella"},
            {"21", "7", "SBUXAntigua Guatemala"},

            {"22", "8", "KFCSan Rafael"},
            {"23", "8", "KFCCentranorte"},
            {"24", "8", "KFCSan Cristobal"},

            {"25", "9", "SBUXLos Yoses"},
            {"26", "9", "SBUXEscazu"},
            {"27", "9", "SBUXPlaza Iskatzu"},
    };

    String[][] SelectShop(String selectedBrand);
}
