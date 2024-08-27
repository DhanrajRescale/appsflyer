package ep;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15797b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f15796a = i10;
        this.f15797b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f15796a) {
            case 0:
                q qVar = (q) this.f15797b;
                qVar.f15804b.k("reportBinderDeath", new Object[0]);
                a3.a.u(qVar.f15811i.get());
                qVar.f15804b.k("%s : Binder has died.", qVar.f15805c);
                Iterator it = qVar.f15806d.iterator();
                while (it.hasNext()) {
                    l lVar = (l) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(qVar.f15805c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = lVar.f15792a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                qVar.f15806d.clear();
                synchronized (qVar.f15808f) {
                    qVar.d();
                }
                return;
            default:
                hp.o oVar = (hp.o) this.f15797b;
                oVar.f18651b.a("reportBinderDeath", new Object[0]);
                a3.a.u(oVar.f18658i.get());
                oVar.f18651b.a("%s : Binder has died.", oVar.f18652c);
                ArrayList arrayList = oVar.f18653d;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((hp.l) it2.next()).a(new RemoteException(String.valueOf(oVar.f18652c).concat(" : Binder has died.")));
                }
                arrayList.clear();
                oVar.b();
                return;
        }
    }
}
