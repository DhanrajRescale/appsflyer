package yq;

import android.util.Log;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f41800c;

    /* renamed from: a, reason: collision with root package name */
    public final b f41801a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f41802b = false;

    public a() {
        b bVar;
        int i10 = 0;
        synchronized (b.class) {
            try {
                if (b.f41803b == null) {
                    b.f41803b = new b(i10);
                }
                bVar = b.f41803b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f41801a = bVar;
    }

    public static a d() {
        if (f41800c == null) {
            synchronized (a.class) {
                try {
                    if (f41800c == null) {
                        f41800c = new a();
                    }
                } finally {
                }
            }
        }
        return f41800c;
    }

    public final void a(String str) {
        if (this.f41802b) {
            this.f41801a.getClass();
            Log.d("FirebasePerformance", str);
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f41802b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f41801a.getClass();
            Log.d("FirebasePerformance", format);
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f41802b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f41801a.getClass();
            Log.e("FirebasePerformance", format);
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f41802b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f41801a.getClass();
            Log.i("FirebasePerformance", format);
        }
    }

    public final void f(String str) {
        if (this.f41802b) {
            this.f41801a.getClass();
            Log.w("FirebasePerformance", str);
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f41802b) {
            String format = String.format(Locale.ENGLISH, str, objArr);
            this.f41801a.getClass();
            Log.w("FirebasePerformance", format);
        }
    }
}
