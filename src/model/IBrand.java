package model;

import java.util.ArrayList;
import java.util.List;

public interface IBrand {
    public static String[][] BRANDS = {
            {"1", "1", "PH-SV", "Pizza Hut El Salvador"},
            {"2", "1", "WD-SV", "Wendy's El Salvador"},
            {"3", "1", "CW-SV", "China Wok El Salvador"},
            {"4", "1", "SBUX-SV", "Starbucks El Salvador"},
            {"5", "1", "KFC-SV", "KFC El Salvador"},

            {"6", "2", "PH-GT", "Pizza Hut Guatemala"},
            {"7", "2", "SBUX-GT", "Starbucks Guatemala"},
            {"8", "2", "KFC-GT", "KFC Guatemala"},

            {"9", "3", "SBUX-CR", "Starbucks Costa Rica"}
    };

    String[][] SelectBrand(String selectedCountry);
}
