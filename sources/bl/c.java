package bl;

import android.os.Bundle;
import android.view.View;
import androidx.work.u;
import com.facebook.FacebookSdk;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f7084a = new Object();

    public static final void a(cl.c mapping, View rootView, View hostView) {
        if (sl.a.b(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String str = mapping.f8208a;
            u uVar = h.f7101f;
            Bundle y10 = u.y(mapping, rootView, hostView);
            f7084a.b(y10);
            FacebookSdk.getExecutor().execute(new yk.h(4, str, y10));
        } catch (Throwable th2) {
            sl.a.a(c.class, th2);
        }
    }

    public final void b(Bundle parameters) {
        Locale locale;
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                double d10 = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        try {
                            locale = FacebookSdk.getApplicationContext().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                        }
                        d10 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                parameters.putDouble("_valueToSum", d10);
            }
            parameters.putString("_is_fb_codeless", "1");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
