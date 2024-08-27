package mt;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class v extends AtomicInteger implements ct.b {
    private static final long serialVersionUID = 2983708048395377667L;

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28059a;

    /* renamed from: b, reason: collision with root package name */
    public final et.d f28060b;

    /* renamed from: c, reason: collision with root package name */
    public final w[] f28061c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f28062d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28063e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f28064f;

    public v(at.g gVar, et.d dVar, int i10, boolean z10) {
        this.f28059a = gVar;
        this.f28060b = dVar;
        this.f28061c = new w[i10];
        this.f28062d = new Object[i10];
        this.f28063e = z10;
    }

    @Override // ct.b
    public final void a() {
        if (!this.f28064f) {
            this.f28064f = true;
            for (w wVar : this.f28061c) {
                ft.b.b(wVar.f28069e);
            }
            if (getAndIncrement() == 0) {
                for (w wVar2 : this.f28061c) {
                    wVar2.f28066b.clear();
                }
            }
        }
    }

    public final void b() {
        w[] wVarArr = this.f28061c;
        for (w wVar : wVarArr) {
            wVar.f28066b.clear();
        }
        for (w wVar2 : wVarArr) {
            ft.b.b(wVar2.f28069e);
        }
    }

    public final void c() {
        Throwable th2;
        boolean z10;
        if (getAndIncrement() != 0) {
            return;
        }
        w[] wVarArr = this.f28061c;
        at.g gVar = this.f28059a;
        Object[] objArr = this.f28062d;
        boolean z11 = this.f28063e;
        int i10 = 1;
        while (true) {
            int i11 = 0;
            int i12 = 0;
            for (w wVar : wVarArr) {
                if (objArr[i12] == null) {
                    boolean z12 = wVar.f28067c;
                    Object i13 = wVar.f28066b.i();
                    if (i13 == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (this.f28064f) {
                        b();
                        return;
                    }
                    if (z12) {
                        if (z11) {
                            if (z10) {
                                Throwable th3 = wVar.f28068d;
                                this.f28064f = true;
                                b();
                                if (th3 != null) {
                                    gVar.onError(th3);
                                    return;
                                } else {
                                    gVar.onComplete();
                                    return;
                                }
                            }
                        } else {
                            Throwable th4 = wVar.f28068d;
                            if (th4 != null) {
                                this.f28064f = true;
                                b();
                                gVar.onError(th4);
                                return;
                            } else if (z10) {
                                this.f28064f = true;
                                b();
                                gVar.onComplete();
                                return;
                            }
                        }
                    }
                    if (!z10) {
                        objArr[i12] = i13;
                    } else {
                        i11++;
                    }
                } else if (wVar.f28067c && !z11 && (th2 = wVar.f28068d) != null) {
                    this.f28064f = true;
                    b();
                    gVar.onError(th2);
                    return;
                }
                i12++;
            }
            if (i11 != 0) {
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            } else {
                try {
                    Object apply = this.f28060b.apply(objArr.clone());
                    gt.e.a(apply, "The zipper returned a null value");
                    gVar.b(apply);
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th5) {
                    zq.f.l0(th5);
                    b();
                    gVar.onError(th5);
                    return;
                }
            }
        }
    }
}
