package d2;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class h1 extends qu.b0 {

    /* renamed from: m, reason: collision with root package name */
    public static final ut.g f13427m = ut.h.a(m0.f13530l);

    /* renamed from: n, reason: collision with root package name */
    public static final f1 f13428n = new f1(0);

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f13429c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f13430d;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13435i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13436j;

    /* renamed from: l, reason: collision with root package name */
    public final j1 f13438l;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13431e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final vt.q f13432f = new vt.q();

    /* renamed from: g, reason: collision with root package name */
    public List f13433g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public List f13434h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final g1 f13437k = new g1(this);

    public h1(Choreographer choreographer, Handler handler) {
        this.f13429c = choreographer;
        this.f13430d = handler;
        this.f13438l = new j1(choreographer, this);
    }

    public static final void f0(h1 h1Var) {
        Object t10;
        Runnable runnable;
        boolean z10;
        Object t11;
        do {
            synchronized (h1Var.f13431e) {
                vt.q qVar = h1Var.f13432f;
                if (qVar.isEmpty()) {
                    t10 = null;
                } else {
                    t10 = qVar.t();
                }
                runnable = (Runnable) t10;
            }
            while (runnable != null) {
                runnable.run();
                synchronized (h1Var.f13431e) {
                    vt.q qVar2 = h1Var.f13432f;
                    if (qVar2.isEmpty()) {
                        t11 = null;
                    } else {
                        t11 = qVar2.t();
                    }
                    runnable = (Runnable) t11;
                }
            }
            synchronized (h1Var.f13431e) {
                if (h1Var.f13432f.isEmpty()) {
                    z10 = false;
                    h1Var.f13435i = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }

    @Override // qu.b0
    public final void b0(CoroutineContext coroutineContext, Runnable runnable) {
        synchronized (this.f13431e) {
            try {
                this.f13432f.h(runnable);
                if (!this.f13435i) {
                    this.f13435i = true;
                    this.f13430d.post(this.f13437k);
                    if (!this.f13436j) {
                        this.f13436j = true;
                        this.f13429c.postFrameCallback(this.f13437k);
                    }
                }
                Unit unit = Unit.f23355a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
