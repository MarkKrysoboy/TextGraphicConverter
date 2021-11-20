package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {

    @Override
    public char convert(int color) {
        return color < 32 ? '#' : (color < 63 ? '$' : (color < 95 ? '@' : (color < 127 ? '%' : (color < 159 ? '*' :
                (color < 191 ? '+' : (color < 256 ? '-' : '\''))))));
    }
}

