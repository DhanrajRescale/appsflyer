package lt;

import at.m;
import at.n;
import java.util.Collection;
import java.util.concurrent.Callable;
import ll.o;
import mt.q;
import mt.u;

/* loaded from: classes2.dex */
public final class i extends m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25393a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25394b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f25395c;

    public /* synthetic */ i(int i10, Object obj, o oVar) {
        this.f25393a = i10;
        this.f25395c = obj;
        this.f25394b = oVar;
    }

    @Override // at.m
    public final void b(n nVar) {
        int i10 = this.f25393a;
        Object obj = this.f25394b;
        Object obj2 = this.f25395c;
        switch (i10) {
            case 0:
                ((at.c) obj2).a(new h(nVar, obj));
                return;
            case 1:
                ((at.e) ((at.f) obj2)).e(new q(nVar, obj));
                return;
            case 2:
                try {
                    Object call = ((Callable) obj).call();
                    gt.e.a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
                    ((at.e) ((at.f) obj2)).e(new u(nVar, (Collection) call));
                    return;
                } catch (Throwable th2) {
                    zq.f.l0(th2);
                    nVar.c(ft.c.f16242a);
                    nVar.onError(th2);
                    return;
                }
            default:
                at.o[] oVarArr = (at.o[]) obj2;
                int length = oVarArr.length;
                if (length == 1) {
                    ((m) oVarArr[0]).a(new nt.a(nVar, new ek.u(this, 21)));
                    return;
                }
                nt.m mVar = new nt.m(nVar, length, (et.d) obj);
                nVar.c(mVar);
                for (int i11 = 0; i11 < length && !mVar.c(); i11++) {
                    at.o oVar = oVarArr[i11];
                    if (oVar == null) {
                        mVar.b(i11, new NullPointerException("One of the sources is null"));
                        return;
                    }
                    ((m) oVar).a(mVar.f29159c[i11]);
                }
                return;
        }
    }

    public i(mt.f fVar) {
        this.f25393a = 2;
        this.f25395c = fVar;
        this.f25394b = new gt.a();
    }
}
