package m4;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.g0;
import androidx.lifecycle.e0;
import androidx.lifecycle.t;
import h.q0;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public abstract class m extends a implements w7.a {

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f27484o = true;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f27488b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27489c;

    /* renamed from: d, reason: collision with root package name */
    public final n[] f27490d;

    /* renamed from: e, reason: collision with root package name */
    public final View f27491e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27492f;

    /* renamed from: g, reason: collision with root package name */
    public final Choreographer f27493g;

    /* renamed from: h, reason: collision with root package name */
    public final i f27494h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f27495i;

    /* renamed from: j, reason: collision with root package name */
    public m f27496j;

    /* renamed from: k, reason: collision with root package name */
    public t f27497k;

    /* renamed from: l, reason: collision with root package name */
    public k f27498l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f27499m;

    /* renamed from: n, reason: collision with root package name */
    public static final int f27483n = Build.VERSION.SDK_INT;

    /* renamed from: p, reason: collision with root package name */
    public static final ni.j f27485p = new ni.j(5);

    /* renamed from: q, reason: collision with root package name */
    public static final ReferenceQueue f27486q = new ReferenceQueue();

    /* renamed from: r, reason: collision with root package name */
    public static final h f27487r = new h(0);

    public m(Object obj, View view, int i10) {
        if (obj == null) {
            this.f27488b = new q0(this, 7);
            int i11 = 0;
            this.f27489c = false;
            this.f27490d = new n[i10];
            this.f27491e = view;
            if (Looper.myLooper() != null) {
                if (f27484o) {
                    this.f27493g = Choreographer.getInstance();
                    this.f27494h = new i(this, i11);
                    return;
                } else {
                    this.f27494h = null;
                    this.f27495i = new Handler(Looper.myLooper());
                    return;
                }
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static int e(TextView textView, int i10) {
        return textView.getContext().getColor(i10);
    }

    public static m g(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
        if (obj == null) {
            return d.b(layoutInflater, i10, viewGroup, z10);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0096, code lost:
    
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0094, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r23 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01fb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.view.View r21, java.lang.Object[] r22, h.c r23, android.util.SparseIntArray r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.m.i(android.view.View, java.lang.Object[], h.c, android.util.SparseIntArray, boolean):void");
    }

    public static Object[] j(View view, int i10, h.c cVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        i(view, objArr, cVar, sparseIntArray, true);
        return objArr;
    }

    public static float n(Float f10) {
        if (f10 == null) {
            return s0.g.f34069a;
        }
        return f10.floatValue();
    }

    public static boolean o(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public abstract void b();

    public final void c() {
        if (this.f27492f) {
            m();
        } else {
            if (!f()) {
                return;
            }
            this.f27492f = true;
            b();
            this.f27492f = false;
        }
    }

    public final void d() {
        m mVar = this.f27496j;
        if (mVar == null) {
            c();
        } else {
            mVar.d();
        }
    }

    public abstract boolean f();

    public abstract void h();

    public abstract boolean k(int i10, int i11, Object obj);

    public final void l(int i10, e0 e0Var, ni.j jVar) {
        if (e0Var == null) {
            return;
        }
        n[] nVarArr = this.f27490d;
        n nVar = nVarArr[i10];
        if (nVar == null) {
            nVar = jVar.b(this, i10, f27486q);
            nVarArr[i10] = nVar;
            t tVar = this.f27497k;
            if (tVar != null) {
                nVar.f27500a.b(tVar);
            }
        }
        nVar.a();
        nVar.f27502c = e0Var;
        nVar.f27500a.a(e0Var);
    }

    public final void m() {
        m mVar = this.f27496j;
        if (mVar != null) {
            mVar.m();
            return;
        }
        t tVar = this.f27497k;
        if (tVar != null && !tVar.getLifecycle().b().a(androidx.lifecycle.n.f1950d)) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f27489c) {
                    return;
                }
                this.f27489c = true;
                if (f27484o) {
                    this.f27493g.postFrameCallback(this.f27494h);
                } else {
                    this.f27495i.post(this.f27488b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void p(t tVar) {
        if (tVar instanceof g0) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        t tVar2 = this.f27497k;
        if (tVar2 == tVar) {
            return;
        }
        if (tVar2 != null) {
            tVar2.getLifecycle().c(this.f27498l);
        }
        this.f27497k = tVar;
        if (tVar != null) {
            if (this.f27498l == null) {
                this.f27498l = new k(this);
            }
            tVar.getLifecycle().a(this.f27498l);
        }
        for (n nVar : this.f27490d) {
            if (nVar != null) {
                nVar.f27500a.b(tVar);
            }
        }
    }

    public final void q(int i10, e0 e0Var) {
        this.f27499m = true;
        try {
            ni.j jVar = f27485p;
            if (e0Var == null) {
                n nVar = this.f27490d[i10];
                if (nVar != null) {
                    nVar.a();
                }
            } else {
                n nVar2 = this.f27490d[i10];
                if (nVar2 == null) {
                    l(i10, e0Var, jVar);
                } else if (nVar2.f27502c != e0Var) {
                    if (nVar2 != null) {
                        nVar2.a();
                    }
                    l(i10, e0Var, jVar);
                }
            }
        } finally {
            this.f27499m = false;
        }
    }
}
