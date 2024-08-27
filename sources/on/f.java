package on;

import android.content.Context;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import ek.u;
import ie.n;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipInputStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements qn.a, cq.f, mq.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f30130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30131c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f30132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f30133e;

    public /* synthetic */ f(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f30129a = i10;
        this.f30131c = obj;
        this.f30132d = obj2;
        this.f30130b = j10;
        this.f30133e = obj3;
    }

    @Override // cq.f
    public final ScheduledFuture a(final u uVar) {
        int i10 = this.f30129a;
        long j10 = this.f30130b;
        Object obj = this.f30133e;
        Object obj2 = this.f30132d;
        Object obj3 = this.f30131c;
        switch (i10) {
            case 1:
                final cq.e eVar = (cq.e) obj3;
                final Callable callable = (Callable) obj2;
                eVar.getClass();
                final int i11 = 1;
                Callable callable2 = new Callable() { // from class: j9.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i12 = i11;
                        Object obj4 = uVar;
                        Object obj5 = callable;
                        Object obj6 = eVar;
                        switch (i12) {
                            case 0:
                                return o.g((Context) obj6, (ZipInputStream) obj5, (String) obj4);
                            default:
                                cq.e eVar2 = (cq.e) obj6;
                                eVar2.getClass();
                                return eVar2.f13053a.submit(new yk.h(16, (Callable) obj5, (ek.u) obj4));
                        }
                    }
                };
                return eVar.f13054b.schedule(callable2, j10, (TimeUnit) obj);
            default:
                cq.e eVar2 = (cq.e) obj3;
                eVar2.getClass();
                cq.c cVar = new cq.c(eVar2, (Runnable) obj2, uVar, 2);
                return eVar2.f13054b.schedule(cVar, j10, (TimeUnit) obj);
        }
    }

    @Override // mq.a
    public final void e(mq.c cVar) {
        CrashlyticsNativeComponentDeferredProxy.lambda$prepareNativeSession$1((String) this.f30131c, (String) this.f30132d, this.f30130b, (StaticSessionData) this.f30133e, cVar);
    }

    @Override // qn.a
    public final Object execute() {
        h hVar = (h) this.f30131c;
        Iterable iterable = (Iterable) this.f30132d;
        jn.i iVar = (jn.i) this.f30133e;
        pn.j jVar = (pn.j) hVar.f30140c;
        jVar.getClass();
        if (iterable.iterator().hasNext()) {
            jVar.c(new n(4, jVar, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + pn.j.j(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
        jVar.c(new j5.j(((rn.c) hVar.f30144g).a() + this.f30130b, iVar));
        return null;
    }

    public /* synthetic */ f(h hVar, Iterable iterable, jn.i iVar, long j10) {
        this.f30129a = 0;
        this.f30131c = hVar;
        this.f30132d = iterable;
        this.f30133e = iVar;
        this.f30130b = j10;
    }
}
