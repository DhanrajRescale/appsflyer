package h;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class v {
    public static void a(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static y3.l b(Configuration configuration) {
        return y3.l.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(y3.l lVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(((y3.n) lVar.f41146a).f41147a.toLanguageTags()));
    }

    public static void d(Configuration configuration, y3.l lVar) {
        configuration.setLocales(LocaleList.forLanguageTags(((y3.n) lVar.f41146a).f41147a.toLanguageTags()));
    }
}
