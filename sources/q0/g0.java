package q0;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.firebase.ui.auth.FirebaseUiException;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w.x1;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f31491a;

    /* renamed from: b, reason: collision with root package name */
    public Object f31492b;

    /* renamed from: c, reason: collision with root package name */
    public Object f31493c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f31494d;

    /* renamed from: e, reason: collision with root package name */
    public Object f31495e;

    public g0(am.e eVar) {
        this.f31492b = eVar;
    }

    public final zl.d a() {
        zp.d dVar = (zp.d) this.f31493c;
        Object obj = this.f31492b;
        if (dVar != null && ((am.e) obj) == null) {
            return new zl.d(null, null, null, false, new FirebaseUiException(5), dVar);
        }
        am.e eVar = (am.e) obj;
        String str = eVar.f764a;
        if (zl.c.f42558d.contains(str) && TextUtils.isEmpty((String) this.f31494d)) {
            throw new IllegalStateException("Token cannot be null when using a non-email provider.");
        }
        if (str.equals("twitter.com") && TextUtils.isEmpty((String) this.f31495e)) {
            throw new IllegalStateException("Secret cannot be null when using the Twitter provider.");
        }
        return new zl.d(eVar, (String) this.f31494d, (String) this.f31495e, this.f31491a, null, (zp.d) this.f31493c);
    }

    public final void b(p1.h hVar, float f10, long j10) {
        float floatValue = ((Number) ((w.d) this.f31493c).d()).floatValue();
        if (floatValue > s0.g.f34069a) {
            long c10 = n1.t.c(j10, floatValue);
            if (this.f31491a) {
                float e10 = m1.f.e(hVar.d());
                float c11 = m1.f.c(hVar.d());
                p1.b f02 = hVar.f0();
                long b10 = f02.b();
                f02.a().h();
                f02.f30498a.f30504a.a().q(s0.g.f34069a, s0.g.f34069a, e10, c11, 1);
                p1.h.T(hVar, c10, f10, 0L, 124);
                f02.a().s();
                f02.c(b10);
                return;
            }
            p1.h.T(hVar, c10, f10, 0L, 124);
        }
    }

    public final void c(a0.j jVar, qu.f0 f0Var) {
        float f10;
        boolean z10 = jVar instanceof a0.h;
        if (z10) {
            ((List) this.f31494d).add(jVar);
        } else if (jVar instanceof a0.i) {
            ((List) this.f31494d).remove(((a0.i) jVar).f15a);
        } else if (jVar instanceof a0.d) {
            ((List) this.f31494d).add(jVar);
        } else if (jVar instanceof a0.e) {
            ((List) this.f31494d).remove(((a0.e) jVar).f8a);
        } else if (jVar instanceof a0.b) {
            ((List) this.f31494d).add(jVar);
        } else if (jVar instanceof a0.c) {
            ((List) this.f31494d).remove(((a0.c) jVar).f7a);
        } else if (jVar instanceof a0.a) {
            ((List) this.f31494d).remove(((a0.a) jVar).f6a);
        } else {
            return;
        }
        a0.j jVar2 = (a0.j) vt.g0.D((List) this.f31494d);
        if (!Intrinsics.a((a0.j) this.f31495e, jVar2)) {
            if (jVar2 != null) {
                i iVar = (i) ((Function0) this.f31492b).mo2invoke();
                if (z10) {
                    f10 = iVar.f31502c;
                } else if (jVar instanceof a0.d) {
                    f10 = iVar.f31501b;
                } else if (jVar instanceof a0.b) {
                    f10 = iVar.f31500a;
                } else {
                    f10 = s0.g.f34069a;
                }
                x1 x1Var = x.f31552a;
                boolean z11 = jVar2 instanceof a0.h;
                x1 x1Var2 = x.f31552a;
                if (!z11) {
                    if (jVar2 instanceof a0.d) {
                        x1Var2 = new x1(45, w.e0.f38472c, 2);
                    } else if (jVar2 instanceof a0.b) {
                        x1Var2 = new x1(45, w.e0.f38472c, 2);
                    }
                }
                yk.g.H(f0Var, null, null, new e0(this, f10, x1Var2, null), 3);
            } else {
                a0.j jVar3 = (a0.j) this.f31495e;
                x1 x1Var3 = x.f31552a;
                boolean z12 = jVar3 instanceof a0.h;
                x1 x1Var4 = x.f31552a;
                if (!z12 && !(jVar3 instanceof a0.d) && (jVar3 instanceof a0.b)) {
                    x1Var4 = new x1(150, w.e0.f38472c, 2);
                }
                yk.g.H(f0Var, null, null, new f0(this, x1Var4, null), 3);
            }
            this.f31495e = jVar2;
        }
    }

    public final synchronized void d() {
        try {
            if (this.f31491a) {
                return;
            }
            Boolean g10 = g();
            this.f31494d = g10;
            if (g10 == null) {
                com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(this);
                this.f31493c = mVar;
                bq.k kVar = (bq.k) ((jq.c) this.f31492b);
                kVar.a(kVar.f7265c, mVar);
            }
            this.f31491a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean e() {
        if (this.f31491a) {
            return false;
        }
        ReentrantLock reentrantLock = (ReentrantLock) this.f31495e;
        try {
            reentrantLock.lock();
            if (this.f31491a) {
                return false;
            }
            this.f31491a = true;
            List R = vt.g0.R((List) this.f31494d);
            ((List) this.f31494d).clear();
            reentrantLock.unlock();
            Function1 function1 = (Function1) this.f31493c;
            Iterator it = R.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final synchronized boolean f() {
        boolean j10;
        try {
            d();
            Serializable serializable = this.f31494d;
            if (((Boolean) serializable) != null) {
                j10 = ((Boolean) serializable).booleanValue();
            } else {
                j10 = ((FirebaseMessaging) this.f31495e).f11687a.j();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return j10;
    }

    public final Boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        pp.g gVar = ((FirebaseMessaging) this.f31495e).f11687a;
        gVar.a();
        Context context = gVar.f31271a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public g0(boolean z10, Function0 function0) {
        this.f31491a = z10;
        this.f31492b = function0;
        this.f31493c = w.e.a(s0.g.f34069a);
        this.f31494d = new ArrayList();
    }
}
