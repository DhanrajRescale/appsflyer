package vq;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final yq.a f38274c = yq.a.d();

    /* renamed from: d, reason: collision with root package name */
    public static w f38275d;

    /* renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f38276a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f38277b;

    public w(ExecutorService executorService) {
        this.f38277b = executorService;
    }

    public static Context a() {
        try {
            pp.g.d();
            pp.g d10 = pp.g.d();
            d10.a();
            return d10.f31271a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized w b() {
        w wVar;
        synchronized (w.class) {
            try {
                if (f38275d == null) {
                    f38275d = new w(Executors.newSingleThreadExecutor());
                }
                wVar = f38275d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return wVar;
    }

    public final synchronized void c(Context context) {
        if (this.f38276a == null && context != null) {
            this.f38277b.execute(new yk.h(20, this, context));
        }
    }

    public final void d(long j10, String str) {
        if (this.f38276a == null) {
            c(a());
            if (this.f38276a == null) {
                return;
            }
        }
        this.f38276a.edit().putLong(str, j10).apply();
    }

    public final void e(String str, double d10) {
        if (this.f38276a == null) {
            c(a());
            if (this.f38276a == null) {
                return;
            }
        }
        this.f38276a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
    }

    public final void f(String str, String str2) {
        if (this.f38276a == null) {
            c(a());
            if (this.f38276a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f38276a.edit().remove(str).apply();
        } else {
            this.f38276a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z10) {
        if (this.f38276a == null) {
            c(a());
            if (this.f38276a == null) {
                return;
            }
        }
        this.f38276a.edit().putBoolean(str, z10).apply();
    }
}
