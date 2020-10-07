package pl.codegym.task.task16.task1631;

import pl.codegym.task.task16.task1631.common.*;

/**
 * Created by Piotr on 2020-10-07
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes jpg) {
        if (jpg == null) {
            throw new IllegalArgumentException("Nieznany typ obrazu");
        }
        switch (jpg) {
            case BMP:
                return new BmpReader();
            case JPG:
                return new JpgReader();
            case PNG:
                return new PngReader();
            default:
                throw new IllegalArgumentException("Nieznany typ obrazu");
        }
    }
}
