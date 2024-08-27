package y3;

import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Locale[] f41144a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean b(@NonNull Locale locale, @NonNull Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f41144a;
        int length = localeArr.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (localeArr[i10].equals(locale)) {
                    break;
                }
                i10++;
            } else {
                for (Locale locale3 : localeArr) {
                    if (!locale3.equals(locale2)) {
                    }
                }
                String c10 = b4.e.c(b4.e.a(b4.e.b(locale)));
                if (c10.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return c10.equals(b4.e.c(b4.e.a(b4.e.b(locale2))));
            }
        }
        return false;
    }
}
