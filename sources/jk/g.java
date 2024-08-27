package jk;

import android.os.Handler;
import android.os.Message;
import wo.n;
import wo.o;

/* loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21437a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21438b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f21437a = i10;
        this.f21438b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f21437a) {
            case 0:
                int i10 = message.what;
                Object obj = this.f21438b;
                if (i10 == 1) {
                    ((h) obj).b((e) message.obj);
                    return true;
                }
                if (i10 == 2) {
                    ((h) obj).f21442d.k((e) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                o oVar = (o) this.f21438b;
                n nVar = (n) message.obj;
                synchronized (oVar.f39408a) {
                    try {
                        if (oVar.f39410c != nVar) {
                            if (oVar.f39411d == nVar) {
                            }
                        }
                        oVar.a(nVar, 2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return true;
        }
    }
}
