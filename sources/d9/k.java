package d9;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    public static final k f14237a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static q8.l f14238b;

    @Override // d9.h
    public boolean a(z8.g gVar) {
        al.d dVar = gVar.f42187a;
        if (!(dVar instanceof z8.a) || ((z8.a) dVar).f42175b > 100) {
            al.d dVar2 = gVar.f42188b;
            if (!(dVar2 instanceof z8.a) || ((z8.a) dVar2).f42175b > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // d9.h
    public boolean b() {
        boolean z10;
        synchronized (g.f14226a) {
            try {
                int i10 = g.f14228c;
                g.f14228c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > g.f14229d + 30000) {
                    boolean z11 = false;
                    g.f14228c = 0;
                    g.f14229d = SystemClock.uptimeMillis();
                    String[] list = g.f14227b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z11 = true;
                    }
                    g.f14230e = z11;
                }
                z10 = g.f14230e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
