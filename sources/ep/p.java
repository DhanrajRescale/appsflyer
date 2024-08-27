package ep;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p extends l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f15800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l7.m f15801c;

    public p(l7.m mVar, IBinder iBinder) {
        this.f15801c = mVar;
        this.f15800b = iBinder;
    }

    @Override // ep.l
    public final void a() {
        h fVar;
        l7.m mVar = this.f15801c;
        q qVar = (q) mVar.f24140b;
        int i10 = g.f15789a;
        IBinder iBinder = this.f15800b;
        if (iBinder == null) {
            fVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof h) {
                fVar = (h) queryLocalInterface;
            } else {
                fVar = new f(iBinder);
            }
        }
        qVar.f15815m = fVar;
        Object obj = mVar.f24140b;
        q qVar2 = (q) obj;
        qVar2.f15804b.k("linkToDeath", new Object[0]);
        try {
            qVar2.f15815m.asBinder().linkToDeath(qVar2.f15812j, 0);
        } catch (RemoteException e10) {
            qVar2.f15804b.j("linkToDeath failed", e10, new Object[0]);
        }
        q qVar3 = (q) obj;
        qVar3.f15809g = false;
        Iterator it = qVar3.f15806d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((q) obj).f15806d.clear();
    }
}
