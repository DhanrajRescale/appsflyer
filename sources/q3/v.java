package q3;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f31644a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f31645b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f31646c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31647d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31648e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f31649f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f31650g;

    public v(int i10, String str, PendingIntent pendingIntent) {
        IconCompat b10;
        if (i10 == 0) {
            b10 = null;
        } else {
            b10 = IconCompat.b(HttpUrl.FRAGMENT_ENCODE_SET, i10);
        }
        Bundle bundle = new Bundle();
        this.f31647d = true;
        this.f31645b = b10;
        if (b10 != null) {
            int i11 = b10.f1504a;
            if (i11 == -1) {
                Object obj = b10.f1505b;
                if (Build.VERSION.SDK_INT >= 28) {
                    i11 = v3.f.c(obj);
                } else {
                    try {
                        i11 = ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
                    } catch (IllegalAccessException e10) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                    } catch (NoSuchMethodException e11) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                    } catch (InvocationTargetException e12) {
                        Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                    }
                }
            }
            if (i11 == 2) {
                this.f31648e = b10.c();
            }
        }
        this.f31649f = d0.b(str);
        this.f31650g = pendingIntent;
        this.f31644a = bundle;
        this.f31646c = true;
        this.f31647d = true;
    }
}
