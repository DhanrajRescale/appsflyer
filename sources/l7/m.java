package l7;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class m implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f24140b;

    public /* synthetic */ m(int i10, Object obj) {
        this.f24139a = i10;
        this.f24140b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, jp.e] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i10 = this.f24139a;
        f fVar = null;
        jp.g gVar = null;
        Object obj = this.f24140b;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                int i11 = q.f24145b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof f)) {
                        fVar = (f) queryLocalInterface;
                    } else {
                        ?? obj2 = new Object();
                        obj2.f24114a = iBinder;
                        fVar = obj2;
                    }
                }
                oVar.f24143a = fVar;
                oVar.getClass();
                oVar.getClass();
                throw null;
            case 1:
                ep.q qVar = (ep.q) obj;
                qVar.f15804b.k("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                qVar.a().post(new ep.p(this, iBinder));
                return;
            case 2:
                hp.o oVar2 = (hp.o) obj;
                oVar2.f18651b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                oVar2.a().post(new hp.m(this, iBinder));
                return;
            default:
                jp.p pVar = (jp.p) obj;
                pVar.getClass();
                try {
                    int i12 = jp.f.f21536a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IServiceBroker");
                        if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof jp.g)) {
                            gVar = (jp.g) queryLocalInterface2;
                        } else {
                            ?? obj3 = new Object();
                            obj3.f21535a = iBinder;
                            gVar = obj3;
                        }
                    }
                    pVar.b(gVar, new jp.o(pVar));
                    return;
                } catch (RemoteException unused) {
                    Log.w("YouTubeClient", "service died");
                    return;
                }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i10 = this.f24139a;
        int i11 = 1;
        Object obj = this.f24140b;
        switch (i10) {
            case 0:
                o oVar = (o) obj;
                oVar.getClass();
                oVar.getClass();
                throw null;
            case 1:
                ep.q qVar = (ep.q) obj;
                qVar.f15804b.k("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                qVar.a().post(new ep.o(this, i11));
                return;
            case 2:
                hp.o oVar2 = (hp.o) obj;
                oVar2.f18651b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                oVar2.a().post(new hp.n(this, i11));
                return;
            default:
                jp.p pVar = (jp.p) obj;
                pVar.f21553c = null;
                pVar.e();
                return;
        }
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.f24139a = i10;
        this.f24140b = obj;
    }
}
