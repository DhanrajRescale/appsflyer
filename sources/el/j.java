package el;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.facebook.FacebookSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import nl.t;
import nl.v;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f15686a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f15687b = new AtomicBoolean(false);

    public static final void a() {
        if (sl.a.b(j.class)) {
            return;
        }
        try {
            if (f15687b.get()) {
                if (f15686a.b()) {
                    v vVar = v.f28944a;
                    if (v.b(t.IapLoggingLib2)) {
                        d.b(FacebookSdk.getApplicationContext());
                        return;
                    }
                }
                c.b();
            }
        } catch (Throwable th2) {
            sl.a.a(j.class, th2);
        }
    }

    public final boolean b() {
        if (sl.a.b(this)) {
            return false;
        }
        try {
            Context applicationContext = FacebookSdk.getApplicationContext();
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            if (Integer.parseInt((String) w.P(string, new String[]{"."}, 3, 2).get(0)) < 2) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            sl.a.a(this, th2);
            return false;
        }
    }
}
