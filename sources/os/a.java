package os;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30288a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30289b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f30288a = i10;
        this.f30289b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30288a) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (((d) this.f30289b).f30303d) {
                    try {
                        Iterator it = ((d) this.f30289b).f30303d.entrySet().iterator();
                        while (it.hasNext()) {
                            c cVar = (c) ((Map.Entry) it.next()).getValue();
                            if (currentTimeMillis - cVar.f30294a > 1000) {
                                ((d) this.f30289b).f30300a.m(cVar.f30295b, cVar.f30296c);
                                it.remove();
                            }
                        }
                        if (!((d) this.f30289b).f30303d.isEmpty()) {
                            ((d) this.f30289b).f30301b.postDelayed(this, 500L);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                ((com.google.firebase.messaging.t) this.f30289b).e();
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(d dVar) {
        this(dVar, 0);
        this.f30288a = 0;
    }
}
