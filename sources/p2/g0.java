package p2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import c2.p0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class g0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final View f30559a;

    /* renamed from: b, reason: collision with root package name */
    public final p f30560b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f30561c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30562d;

    /* renamed from: e, reason: collision with root package name */
    public Function1 f30563e;

    /* renamed from: f, reason: collision with root package name */
    public Function1 f30564f;

    /* renamed from: g, reason: collision with root package name */
    public c0 f30565g;

    /* renamed from: h, reason: collision with root package name */
    public o f30566h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f30567i;

    /* renamed from: j, reason: collision with root package name */
    public final ut.g f30568j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f30569k;

    /* renamed from: l, reason: collision with root package name */
    public final e f30570l;

    /* renamed from: m, reason: collision with root package name */
    public final v0.h f30571m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.activity.b f30572n;

    public g0(View view, x1.f0 f0Var) {
        q qVar = new q(view);
        k5.b0 b0Var = new k5.b0(Choreographer.getInstance(), 3);
        this.f30559a = view;
        this.f30560b = qVar;
        this.f30561c = b0Var;
        this.f30563e = d.f30527d;
        this.f30564f = d.f30528e;
        this.f30565g = new c0(HttpUrl.FRAGMENT_ENCODE_SET, j2.f0.f20710b, 4);
        this.f30566h = o.f30595f;
        this.f30567i = new ArrayList();
        ut.i iVar = ut.i.f37392a;
        this.f30568j = ut.h.b(new p0(this, 6));
        this.f30570l = new e(f0Var, qVar);
        this.f30571m = new v0.h(new e0[16]);
    }

    @Override // p2.x
    public final void a(c0 c0Var, v vVar, j2.e0 e0Var, t.g0 g0Var, m1.d dVar, m1.d dVar2) {
        e eVar = this.f30570l;
        eVar.f30542i = c0Var;
        eVar.f30544k = vVar;
        eVar.f30543j = e0Var;
        eVar.f30545l = g0Var;
        eVar.f30546m = dVar;
        eVar.f30547n = dVar2;
        if (eVar.f30537d || eVar.f30536c) {
            eVar.a();
        }
    }

    @Override // p2.x
    public final void b(c0 c0Var, o oVar, c.g gVar, i0.h0 h0Var) {
        this.f30562d = true;
        this.f30565g = c0Var;
        this.f30566h = oVar;
        this.f30563e = gVar;
        this.f30564f = h0Var;
        i(e0.f30551a);
    }

    @Override // p2.x
    public final void c() {
        i(e0.f30551a);
    }

    @Override // p2.x
    public final void d() {
        i(e0.f30553c);
    }

    @Override // p2.x
    public final void e() {
        this.f30562d = false;
        this.f30563e = d.f30529f;
        this.f30564f = d.f30530g;
        this.f30569k = null;
        i(e0.f30552b);
    }

    @Override // p2.x
    public final void f(m1.d dVar) {
        Rect rect;
        this.f30569k = new Rect(ku.c.b(dVar.f27239a), ku.c.b(dVar.f27240b), ku.c.b(dVar.f27241c), ku.c.b(dVar.f27242d));
        if (this.f30567i.isEmpty() && (rect = this.f30569k) != null) {
            this.f30559a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // p2.x
    public final void g() {
        i(e0.f30554d);
    }

    @Override // p2.x
    public final void h(c0 c0Var, c0 c0Var2) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        long j10 = this.f30565g.f30523b;
        long j11 = c0Var2.f30523b;
        boolean a10 = j2.f0.a(j10, j11);
        j2.f0 f0Var = c0Var2.f30524c;
        if (a10 && Intrinsics.a(this.f30565g.f30524c, f0Var)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f30565g = c0Var2;
        ArrayList arrayList = this.f30567i;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            y yVar = (y) ((WeakReference) arrayList.get(i13)).get();
            if (yVar != null) {
                yVar.f30614d = c0Var2;
            }
        }
        e eVar = this.f30570l;
        eVar.f30542i = null;
        eVar.f30544k = null;
        eVar.f30543j = null;
        eVar.f30545l = d.f30525b;
        eVar.f30546m = null;
        eVar.f30547n = null;
        boolean a11 = Intrinsics.a(c0Var, c0Var2);
        p pVar = this.f30560b;
        int i14 = -1;
        if (a11) {
            if (z10) {
                int e10 = j2.f0.e(j11);
                int d10 = j2.f0.d(j11);
                j2.f0 f0Var2 = this.f30565g.f30524c;
                if (f0Var2 != null) {
                    i12 = j2.f0.e(f0Var2.f20712a);
                } else {
                    i12 = -1;
                }
                j2.f0 f0Var3 = this.f30565g.f30524c;
                if (f0Var3 != null) {
                    i14 = j2.f0.d(f0Var3.f20712a);
                }
                q qVar = (q) pVar;
                ((InputMethodManager) qVar.f30602b.getValue()).updateSelection(qVar.f30601a, e10, d10, i12, i14);
                return;
            }
            return;
        }
        if (c0Var != null && (!Intrinsics.a(c0Var.f30522a.f20699a, c0Var2.f30522a.f20699a) || (j2.f0.a(c0Var.f30523b, j11) && !Intrinsics.a(c0Var.f30524c, f0Var)))) {
            q qVar2 = (q) pVar;
            ((InputMethodManager) qVar2.f30602b.getValue()).restartInput(qVar2.f30601a);
            return;
        }
        int size2 = arrayList.size();
        for (int i15 = 0; i15 < size2; i15++) {
            y yVar2 = (y) ((WeakReference) arrayList.get(i15)).get();
            if (yVar2 != null) {
                c0 c0Var3 = this.f30565g;
                if (yVar2.f30618h) {
                    yVar2.f30614d = c0Var3;
                    if (yVar2.f30616f) {
                        q qVar3 = (q) pVar;
                        ((InputMethodManager) qVar3.f30602b.getValue()).updateExtractedText(qVar3.f30601a, yVar2.f30615e, hl.f.h1(c0Var3));
                    }
                    j2.f0 f0Var4 = c0Var3.f30524c;
                    if (f0Var4 != null) {
                        i10 = j2.f0.e(f0Var4.f20712a);
                    } else {
                        i10 = -1;
                    }
                    j2.f0 f0Var5 = c0Var3.f30524c;
                    if (f0Var5 != null) {
                        i11 = j2.f0.d(f0Var5.f20712a);
                    } else {
                        i11 = -1;
                    }
                    long j12 = c0Var3.f30523b;
                    int e11 = j2.f0.e(j12);
                    int d11 = j2.f0.d(j12);
                    q qVar4 = (q) pVar;
                    ((InputMethodManager) qVar4.f30602b.getValue()).updateSelection(qVar4.f30601a, e11, d11, i10, i11);
                }
            }
        }
    }

    public final void i(e0 e0Var) {
        this.f30571m.b(e0Var);
        if (this.f30572n == null) {
            androidx.activity.b bVar = new androidx.activity.b(this, 9);
            this.f30561c.execute(bVar);
            this.f30572n = bVar;
        }
    }
}
