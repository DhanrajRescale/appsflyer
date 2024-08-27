package zk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import ek.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import yk.h;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public static final e f42546e = new e(23, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final HashMap f42547f = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f42550c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f42548a = new LinkedHashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f42549b = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f42551d = new AtomicBoolean(false);

    public d(Activity activity) {
        this.f42550c = new WeakReference(activity);
    }

    public final void a(View view) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            h hVar = new h(2, view, this);
            if (!sl.a.b(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        hVar.run();
                    } else {
                        this.f42549b.post(hVar);
                    }
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r12) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.d.b(android.view.View):void");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (sl.a.b(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th2) {
                sl.a.a(this, th2);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
