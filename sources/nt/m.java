package nt;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class m extends AtomicInteger implements ct.b {
    private static final long serialVersionUID = -5556924161382950569L;

    /* renamed from: a, reason: collision with root package name */
    public final at.n f29157a;

    /* renamed from: b, reason: collision with root package name */
    public final et.d f29158b;

    /* renamed from: c, reason: collision with root package name */
    public final n[] f29159c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f29160d;

    public m(at.n nVar, int i10, et.d dVar) {
        super(i10);
        this.f29157a = nVar;
        this.f29158b = dVar;
        n[] nVarArr = new n[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            nVarArr[i11] = new n(this, i11);
        }
        this.f29159c = nVarArr;
        this.f29160d = new Object[i10];
    }

    @Override // ct.b
    public final void a() {
        if (getAndSet(0) > 0) {
            for (n nVar : this.f29159c) {
                nVar.getClass();
                ft.b.b(nVar);
            }
        }
    }

    public final void b(int i10, Throwable th2) {
        if (getAndSet(0) > 0) {
            n[] nVarArr = this.f29159c;
            int length = nVarArr.length;
            for (int i11 = 0; i11 < i10; i11++) {
                n nVar = nVarArr[i11];
                nVar.getClass();
                ft.b.b(nVar);
            }
            while (true) {
                i10++;
                if (i10 < length) {
                    n nVar2 = nVarArr[i10];
                    nVar2.getClass();
                    ft.b.b(nVar2);
                } else {
                    this.f29157a.onError(th2);
                    return;
                }
            }
        } else {
            yk.g.M(th2);
        }
    }

    public final boolean c() {
        if (get() <= 0) {
            return true;
        }
        return false;
    }
}
