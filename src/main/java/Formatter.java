class Formatter {
    String convert(double price) {
        String typeOfWordRubles;
        int lastDigits = (int) Math.floor(price) % 100;
        if (Math.floor(lastDigits / 10) != 1) {
            int lastDigit = (int) Math.floor(price) % 10;
            if (lastDigit == 0 || lastDigit >= 5) {
                typeOfWordRubles = "рублей";
            } else if (lastDigit == 1) {
                typeOfWordRubles = "рубль";
            } else {
                typeOfWordRubles = "рубля";
            }
        } else {
            typeOfWordRubles = "рублей";
        }
        return typeOfWordRubles;
    }
}
