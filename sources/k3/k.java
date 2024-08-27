package k3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k extends q {
    @Override // k3.e
    public final void a(e eVar) {
        j3.a aVar = (j3.a) this.f22030b;
        int i10 = aVar.f20818u0;
        g gVar = this.f22036h;
        Iterator it = gVar.f22010l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((g) it.next()).f22005g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 != 0 && i10 != 2) {
            gVar.d(i11 + aVar.f20820w0);
        } else {
            gVar.d(i12 + aVar.f20820w0);
        }
    }

    @Override // k3.q
    public final void d() {
        j3.d dVar = this.f22030b;
        if (dVar instanceof j3.a) {
            g gVar = this.f22036h;
            gVar.f22000b = true;
            j3.a aVar = (j3.a) dVar;
            int i10 = aVar.f20818u0;
            boolean z10 = aVar.f20819v0;
            int i11 = 0;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            gVar.f22003e = 7;
                            while (i11 < aVar.f20927t0) {
                                j3.d dVar2 = aVar.f20926s0[i11];
                                if (z10 || dVar2.f20865i0 != 8) {
                                    g gVar2 = dVar2.f20856e.f22037i;
                                    gVar2.f22009k.add(gVar);
                                    gVar.f22010l.add(gVar2);
                                }
                                i11++;
                            }
                            m(this.f22030b.f20856e.f22036h);
                            m(this.f22030b.f20856e.f22037i);
                            return;
                        }
                        return;
                    }
                    gVar.f22003e = 6;
                    while (i11 < aVar.f20927t0) {
                        j3.d dVar3 = aVar.f20926s0[i11];
                        if (z10 || dVar3.f20865i0 != 8) {
                            g gVar3 = dVar3.f20856e.f22036h;
                            gVar3.f22009k.add(gVar);
                            gVar.f22010l.add(gVar3);
                        }
                        i11++;
                    }
                    m(this.f22030b.f20856e.f22036h);
                    m(this.f22030b.f20856e.f22037i);
                    return;
                }
                gVar.f22003e = 5;
                while (i11 < aVar.f20927t0) {
                    j3.d dVar4 = aVar.f20926s0[i11];
                    if (z10 || dVar4.f20865i0 != 8) {
                        g gVar4 = dVar4.f20854d.f22037i;
                        gVar4.f22009k.add(gVar);
                        gVar.f22010l.add(gVar4);
                    }
                    i11++;
                }
                m(this.f22030b.f20854d.f22036h);
                m(this.f22030b.f20854d.f22037i);
                return;
            }
            gVar.f22003e = 4;
            while (i11 < aVar.f20927t0) {
                j3.d dVar5 = aVar.f20926s0[i11];
                if (z10 || dVar5.f20865i0 != 8) {
                    g gVar5 = dVar5.f20854d.f22036h;
                    gVar5.f22009k.add(gVar);
                    gVar.f22010l.add(gVar5);
                }
                i11++;
            }
            m(this.f22030b.f20854d.f22036h);
            m(this.f22030b.f20854d.f22037i);
        }
    }

    @Override // k3.q
    public final void e() {
        j3.d dVar = this.f22030b;
        if (dVar instanceof j3.a) {
            int i10 = ((j3.a) dVar).f20818u0;
            g gVar = this.f22036h;
            if (i10 != 0 && i10 != 1) {
                dVar.f20851b0 = gVar.f22005g;
            } else {
                dVar.f20849a0 = gVar.f22005g;
            }
        }
    }

    @Override // k3.q
    public final void f() {
        this.f22031c = null;
        this.f22036h.c();
    }

    @Override // k3.q
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f22036h;
        gVar2.f22009k.add(gVar);
        gVar.f22010l.add(gVar2);
    }
}
