package kt;

import io.reactivex.exceptions.CompositeException;

/* loaded from: classes2.dex */
public final class h implements at.b, ct.b {

    /* renamed from: a, reason: collision with root package name */
    public final at.b f23501a;

    /* renamed from: b, reason: collision with root package name */
    public ct.b f23502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f23503c;

    public h(i iVar, at.b bVar) {
        this.f23503c = iVar;
        this.f23501a = bVar;
    }

    @Override // ct.b
    public final void a() {
        try {
            this.f23503c.f23510g.run();
        } catch (Throwable th2) {
            zq.f.l0(th2);
            yk.g.M(th2);
        }
        this.f23502b.a();
    }

    @Override // at.b
    public final void c(ct.b bVar) {
        at.b bVar2 = this.f23501a;
        try {
            this.f23503c.f23505b.b(bVar);
            if (ft.b.f(this.f23502b, bVar)) {
                this.f23502b = bVar;
                bVar2.c(this);
            }
        } catch (Throwable th2) {
            zq.f.l0(th2);
            bVar.a();
            this.f23502b = ft.b.f16240a;
            bVar2.c(ft.c.f16242a);
            bVar2.onError(th2);
        }
    }

    @Override // at.b
    public final void onComplete() {
        at.b bVar = this.f23501a;
        i iVar = this.f23503c;
        if (this.f23502b == ft.b.f16240a) {
            return;
        }
        try {
            iVar.f23507d.run();
            iVar.f23508e.run();
            bVar.onComplete();
            try {
                iVar.f23509f.run();
            } catch (Throwable th2) {
                zq.f.l0(th2);
                yk.g.M(th2);
            }
        } catch (Throwable th3) {
            zq.f.l0(th3);
            bVar.onError(th3);
        }
    }

    @Override // at.b
    public final void onError(Throwable th2) {
        i iVar = this.f23503c;
        if (this.f23502b == ft.b.f16240a) {
            yk.g.M(th2);
            return;
        }
        try {
            iVar.f23506c.b(th2);
            iVar.f23508e.run();
        } catch (Throwable th3) {
            zq.f.l0(th3);
            th2 = new CompositeException(th2, th3);
        }
        this.f23501a.onError(th2);
        try {
            iVar.f23509f.run();
        } catch (Throwable th4) {
            zq.f.l0(th4);
            yk.g.M(th4);
        }
    }
}
