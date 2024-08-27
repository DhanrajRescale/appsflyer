package hp;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.w;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class m extends l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f18644f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f18645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f18646h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, TaskCompletionSource taskCompletionSource, l lVar) {
        super(taskCompletionSource);
        this.f18646h = oVar;
        this.f18645g = lVar;
    }

    @Override // hp.l
    public final void b() {
        h fVar;
        int i10 = this.f18644f;
        Object obj = this.f18645g;
        Object obj2 = this.f18646h;
        switch (i10) {
            case 0:
                o oVar = (o) obj2;
                l lVar = (l) obj;
                IInterface iInterface = oVar.f18662m;
                ArrayList arrayList = oVar.f18653d;
                k kVar = oVar.f18651b;
                if (iInterface == null && !oVar.f18656g) {
                    kVar.a("Initiate binding to the service.", new Object[0]);
                    arrayList.add(lVar);
                    l7.m mVar = new l7.m(2, oVar);
                    oVar.f18661l = mVar;
                    oVar.f18656g = true;
                    if (!oVar.f18650a.bindService(oVar.f18657h, mVar, 1)) {
                        kVar.a("Failed to bind to the service.", new Object[0]);
                        oVar.f18656g = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((l) it.next()).a(new w());
                        }
                        arrayList.clear();
                        return;
                    }
                    return;
                }
                if (oVar.f18656g) {
                    kVar.a("Waiting to bind to the service.", new Object[0]);
                    arrayList.add(lVar);
                    return;
                } else {
                    lVar.run();
                    return;
                }
            default:
                l7.m mVar2 = (l7.m) obj2;
                o oVar2 = (o) mVar2.f24140b;
                IBinder iBinder = (IBinder) obj;
                int i11 = g.f18641e;
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                    if (queryLocalInterface instanceof h) {
                        fVar = (h) queryLocalInterface;
                    } else {
                        fVar = new f(iBinder);
                    }
                }
                oVar2.f18662m = fVar;
                Object obj3 = mVar2.f24140b;
                o oVar3 = (o) obj3;
                oVar3.f18651b.a("linkToDeath", new Object[0]);
                try {
                    oVar3.f18662m.asBinder().linkToDeath(oVar3.f18659j, 0);
                } catch (RemoteException e10) {
                    Object[] objArr = new Object[0];
                    k kVar2 = oVar3.f18651b;
                    kVar2.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", k.b(kVar2.f18642a, "linkToDeath failed", objArr), e10);
                    }
                }
                o oVar4 = (o) obj3;
                oVar4.f18656g = false;
                Iterator it2 = oVar4.f18653d.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((o) obj3).f18653d.clear();
                return;
        }
    }

    public m(l7.m mVar, IBinder iBinder) {
        this.f18646h = mVar;
        this.f18645g = iBinder;
    }
}
