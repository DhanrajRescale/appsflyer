package y3;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public abstract class h {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(@NonNull Configuration configuration, @NonNull l lVar) {
        configuration.setLocales((LocaleList) lVar.f41146a.a());
    }
}
