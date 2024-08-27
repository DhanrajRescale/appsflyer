package wo;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static o f39407e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f39408a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f39409b = new Handler(Looper.getMainLooper(), new jk.g(this, 1));

    /* renamed from: c, reason: collision with root package name */
    public n f39410c;

    /* renamed from: d, reason: collision with root package name */
    public n f39411d;

    public static o b() {
        if (f39407e == null) {
            f39407e = new o();
        }
        return f39407e;
    }

    public final boolean a(n nVar, int i10) {
        g gVar = (g) nVar.f39404a.get();
        if (gVar == null) {
            return false;
        }
        this.f39409b.removeCallbacksAndMessages(nVar);
        Handler handler = k.f39381z;
        handler.sendMessage(handler.obtainMessage(1, i10, 0, gVar.f39363a));
        return true;
    }

    public final boolean c(g gVar) {
        n nVar = this.f39410c;
        if (nVar != null && gVar != null && nVar.f39404a.get() == gVar) {
            return true;
        }
        return false;
    }

    public final void d(g gVar) {
        synchronized (this.f39408a) {
            try {
                if (c(gVar)) {
                    n nVar = this.f39410c;
                    if (!nVar.f39406c) {
                        nVar.f39406c = true;
                        this.f39409b.removeCallbacksAndMessages(nVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(g gVar) {
        synchronized (this.f39408a) {
            try {
                if (c(gVar)) {
                    n nVar = this.f39410c;
                    if (nVar.f39406c) {
                        nVar.f39406c = false;
                        f(nVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(n nVar) {
        int i10 = nVar.f39405b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            if (i10 == -1) {
                i10 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            } else {
                i10 = 2750;
            }
        }
        Handler handler = this.f39409b;
        handler.removeCallbacksAndMessages(nVar);
        handler.sendMessageDelayed(Message.obtain(handler, 0, nVar), i10);
    }

    public final void g() {
        n nVar = this.f39411d;
        if (nVar != null) {
            this.f39410c = nVar;
            this.f39411d = null;
            g gVar = (g) nVar.f39404a.get();
            if (gVar != null) {
                Handler handler = k.f39381z;
                handler.sendMessage(handler.obtainMessage(0, gVar.f39363a));
            } else {
                this.f39410c = null;
            }
        }
    }
}
