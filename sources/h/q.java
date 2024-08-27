package h;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f17721a = new n0(new o0(0));

    /* renamed from: b, reason: collision with root package name */
    public static final int f17722b = -100;

    /* renamed from: c, reason: collision with root package name */
    public static y3.l f17723c = null;

    /* renamed from: d, reason: collision with root package name */
    public static y3.l f17724d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Boolean f17725e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f17726f = false;

    /* renamed from: g, reason: collision with root package name */
    public static final t.g f17727g = new t.g(0);

    /* renamed from: h, reason: collision with root package name */
    public static final Object f17728h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final Object f17729i = new Object();

    public static boolean c(Context context) {
        if (f17725e == null) {
            try {
                int i10 = l0.f17711a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) l0.class), k0.a() | 128).metaData;
                if (bundle != null) {
                    f17725e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f17725e = Boolean.FALSE;
            }
        }
        return f17725e.booleanValue();
    }

    public static void f(q qVar) {
        synchronized (f17728h) {
            try {
                t.g gVar = f17727g;
                gVar.getClass();
                t.b bVar = new t.b(gVar);
                while (bVar.hasNext()) {
                    q qVar2 = (q) ((WeakReference) bVar.next()).get();
                    if (qVar2 == qVar || qVar2 == null) {
                        bVar.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void d(Bundle bundle);

    public abstract void e();

    public abstract boolean g(int i10);

    public abstract void h(int i10);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);
}
