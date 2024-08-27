package t0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class i implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f35042a;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f35044c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f35043b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public List f35045d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public List f35046e = new ArrayList();

    public i(x.a aVar) {
        this.f35042a = aVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // t0.a1
    public final Object U(Function1 function1, yt.a frame) {
        Function0 function0;
        qu.i iVar = new qu.i(1, zt.f.b(frame));
        iVar.s();
        iu.z zVar = new iu.z();
        synchronized (this.f35043b) {
            Throwable th2 = this.f35044c;
            if (th2 != null) {
                l.Companion companion = ut.l.INSTANCE;
                iVar.resumeWith(ut.n.a(th2));
            } else {
                zVar.f20560a = new h(function1, iVar);
                boolean isEmpty = this.f35045d.isEmpty();
                List list = this.f35045d;
                Object obj = zVar.f20560a;
                if (obj != null) {
                    list.add((h) obj);
                    iVar.u(new x.z(20, this, zVar));
                    if (isEmpty && (function0 = this.f35042a) != null) {
                        try {
                            function0.mo2invoke();
                        } catch (Throwable th3) {
                            synchronized (this.f35043b) {
                                try {
                                    if (this.f35044c == null) {
                                        this.f35044c = th3;
                                        List list2 = this.f35045d;
                                        int size = list2.size();
                                        for (int i10 = 0; i10 < size; i10++) {
                                            yt.a aVar = ((h) list2.get(i10)).f35030b;
                                            l.Companion companion2 = ut.l.INSTANCE;
                                            aVar.resumeWith(ut.n.a(th3));
                                        }
                                        this.f35045d.clear();
                                        Unit unit = Unit.f23355a;
                                    }
                                } catch (Throwable th4) {
                                    throw th4;
                                }
                            }
                        }
                    }
                } else {
                    Intrinsics.k("awaiter");
                    throw null;
                }
            }
        }
        Object p10 = iVar.p();
        if (p10 == zt.a.f42823a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return p10;
    }

    public final void e(long j10) {
        Object a10;
        synchronized (this.f35043b) {
            try {
                List list = this.f35045d;
                this.f35045d = this.f35046e;
                this.f35046e = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = (h) list.get(i10);
                    hVar.getClass();
                    try {
                        l.Companion companion = ut.l.INSTANCE;
                        a10 = hVar.f35029a.invoke(Long.valueOf(j10));
                    } catch (Throwable th2) {
                        l.Companion companion2 = ut.l.INSTANCE;
                        a10 = ut.n.a(th2);
                    }
                    hVar.f35030b.resumeWith(a10);
                }
                list.clear();
                Unit unit = Unit.f23355a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.a(this, iVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.coroutines.g.a(this, context);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(kotlin.coroutines.i iVar) {
        return kotlin.coroutines.h.b(this, iVar);
    }
}
