public class Convert_To_Roman {
    static String converter_to_roman_number(int arabian_numbers)
    {
        String [] to_roman = { "0","I","II","III","IV","V","VI","VII","VIII","IX","X",
                               "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                               "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                               "XXXI","XXXII","XXXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XL",
                               "XLI","XLII","XLIII","XLIV","XLV","XLVI","XLVII","XLVIII","XLIX","L",
                               "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                               "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                               "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                               "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","XC",
                               "XCI","XCII","XCIII","XCIV","XCV","XCVI","XCVII","XCVIII","XCIX","C",};
        final String convert = to_roman[arabian_numbers];
        return convert;
    }
}
