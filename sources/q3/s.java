package q3;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class s {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList b(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }
}
