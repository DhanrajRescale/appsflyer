package tr;

import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d extends at.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36358a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f36359b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f36358a = i10;
        this.f36359b = obj;
    }

    @Override // at.e
    public final void f(at.g gVar) {
        boolean z10;
        switch (this.f36358a) {
            case 0:
                nv.h clone = ((nv.h) this.f36359b).clone();
                gVar.c(new c(clone));
                try {
                    Object execute = clone.execute();
                    if (!clone.isCanceled()) {
                        gVar.b(execute);
                    }
                    if (!clone.isCanceled()) {
                        try {
                            gVar.onComplete();
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = true;
                            zq.f.l0(th);
                            if (z10) {
                                yk.g.M(th);
                                return;
                            }
                            if (!clone.isCanceled()) {
                                try {
                                    gVar.onError(th);
                                    return;
                                } catch (Throwable th3) {
                                    zq.f.l0(th3);
                                    yk.g.M(new CompositeException(th, th3));
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    z10 = false;
                }
            default:
                ct.b bVar = ft.c.f16242a;
                try {
                    Iterator it = ((Iterable) this.f36359b).iterator();
                    try {
                        if (!it.hasNext()) {
                            gVar.c(bVar);
                            gVar.onComplete();
                            return;
                        }
                        mt.g gVar2 = new mt.g(gVar, it);
                        gVar.c(gVar2);
                        if (gVar2.f28014d) {
                            return;
                        }
                        while (!gVar2.f28013c) {
                            try {
                                Object next = gVar2.f28012b.next();
                                gt.e.a(next, "The iterator returned a null value");
                                gVar2.f28011a.b(next);
                                if (!gVar2.f28013c) {
                                    try {
                                        if (!gVar2.f28012b.hasNext()) {
                                            if (!gVar2.f28013c) {
                                                gVar2.f28011a.onComplete();
                                                return;
                                            }
                                            return;
                                        }
                                    } catch (Throwable th5) {
                                        zq.f.l0(th5);
                                        gVar2.f28011a.onError(th5);
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Throwable th6) {
                                zq.f.l0(th6);
                                gVar2.f28011a.onError(th6);
                                return;
                            }
                        }
                        return;
                    } catch (Throwable th7) {
                        zq.f.l0(th7);
                        gVar.c(bVar);
                        gVar.onError(th7);
                        return;
                    }
                } catch (Throwable th8) {
                    zq.f.l0(th8);
                    gVar.c(bVar);
                    gVar.onError(th8);
                    return;
                }
        }
    }
}
