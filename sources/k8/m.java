package k8;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.u;
import d4.i2;
import java.util.UUID;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22688a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l8.j f22689b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f22690c;

    public /* synthetic */ m(n nVar, l8.j jVar, int i10) {
        this.f22688a = i10;
        this.f22690c = nVar;
        this.f22689b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [op.a, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22688a;
        l8.j jVar = this.f22689b;
        n nVar = this.f22690c;
        switch (i10) {
            case 0:
                jVar.l(nVar.f22695d.getForegroundInfoAsync());
                return;
            default:
                try {
                    androidx.work.m mVar = (androidx.work.m) jVar.get();
                    if (mVar != null) {
                        u w10 = u.w();
                        String str = n.f22691g;
                        Object[] objArr = new Object[1];
                        j8.k kVar = nVar.f22694c;
                        ListenableWorker listenableWorker = nVar.f22695d;
                        objArr[0] = kVar.f21076c;
                        w10.u(str, String.format("Updating notification for %s", objArr), new Throwable[0]);
                        listenableWorker.setRunInForeground(true);
                        l8.j jVar2 = nVar.f22692a;
                        androidx.work.n nVar2 = nVar.f22696e;
                        Context context = nVar.f22693b;
                        UUID id2 = listenableWorker.getId();
                        o oVar = (o) nVar2;
                        oVar.getClass();
                        ?? obj = new Object();
                        ((h.c) oVar.f22698a).n(new i2(oVar, obj, id2, mVar, context, 1));
                        jVar2.l(obj);
                        return;
                    }
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", nVar.f22694c.f21076c));
                } catch (Throwable th2) {
                    nVar.f22692a.k(th2);
                    return;
                }
        }
    }
}
