package m4;

import androidx.lifecycle.e0;
import androidx.lifecycle.t;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final n f27482a;

    public l(m mVar, int i10, ReferenceQueue referenceQueue) {
        this.f27482a = new n(mVar, i10, this, referenceQueue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [m4.g, m4.b] */
    @Override // m4.e
    public final void a(e0 e0Var) {
        a aVar = (a) e0Var;
        synchronized (aVar) {
            try {
                if (aVar.f27468a == null) {
                    aVar.f27468a = new b();
                }
            } finally {
            }
        }
        g gVar = aVar.f27468a;
        synchronized (gVar) {
            try {
                int lastIndexOf = gVar.f27469a.lastIndexOf(this);
                if (lastIndexOf >= 0) {
                    if (gVar.a(lastIndexOf)) {
                    }
                }
                gVar.f27469a.add(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.e
    public final void b(t tVar) {
    }

    @Override // m4.e
    public final void c(Object obj) {
        a aVar = (a) obj;
        synchronized (aVar) {
            try {
                g gVar = aVar.f27468a;
                if (gVar != null) {
                    synchronized (gVar) {
                        try {
                            if (gVar.f27472d == 0) {
                                gVar.f27469a.remove(this);
                            } else {
                                int lastIndexOf = gVar.f27469a.lastIndexOf(this);
                                if (lastIndexOf >= 0) {
                                    gVar.e(lastIndexOf);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }
}
