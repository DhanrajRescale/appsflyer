package k3;

/* loaded from: classes.dex */
public final class j extends q {
    @Override // k3.e
    public final void a(e eVar) {
        g gVar = this.f22036h;
        if (!gVar.f22001c || gVar.f22008j) {
            return;
        }
        gVar.d((int) ((((g) gVar.f22010l.get(0)).f22005g * ((j3.h) this.f22030b).f20920s0) + 0.5f));
    }

    @Override // k3.q
    public final void d() {
        j3.d dVar = this.f22030b;
        j3.h hVar = (j3.h) dVar;
        int i10 = hVar.f20921t0;
        int i11 = hVar.f20922u0;
        int i12 = hVar.f20924w0;
        g gVar = this.f22036h;
        if (i12 == 1) {
            if (i10 != -1) {
                gVar.f22010l.add(dVar.V.f20854d.f22036h);
                this.f22030b.V.f20854d.f22036h.f22009k.add(gVar);
                gVar.f22004f = i10;
            } else if (i11 != -1) {
                gVar.f22010l.add(dVar.V.f20854d.f22037i);
                this.f22030b.V.f20854d.f22037i.f22009k.add(gVar);
                gVar.f22004f = -i11;
            } else {
                gVar.f22000b = true;
                gVar.f22010l.add(dVar.V.f20854d.f22037i);
                this.f22030b.V.f20854d.f22037i.f22009k.add(gVar);
            }
            m(this.f22030b.f20854d.f22036h);
            m(this.f22030b.f20854d.f22037i);
            return;
        }
        if (i10 != -1) {
            gVar.f22010l.add(dVar.V.f20856e.f22036h);
            this.f22030b.V.f20856e.f22036h.f22009k.add(gVar);
            gVar.f22004f = i10;
        } else if (i11 != -1) {
            gVar.f22010l.add(dVar.V.f20856e.f22037i);
            this.f22030b.V.f20856e.f22037i.f22009k.add(gVar);
            gVar.f22004f = -i11;
        } else {
            gVar.f22000b = true;
            gVar.f22010l.add(dVar.V.f20856e.f22037i);
            this.f22030b.V.f20856e.f22037i.f22009k.add(gVar);
        }
        m(this.f22030b.f20856e.f22036h);
        m(this.f22030b.f20856e.f22037i);
    }

    @Override // k3.q
    public final void e() {
        j3.d dVar = this.f22030b;
        int i10 = ((j3.h) dVar).f20924w0;
        g gVar = this.f22036h;
        if (i10 == 1) {
            dVar.f20849a0 = gVar.f22005g;
        } else {
            dVar.f20851b0 = gVar.f22005g;
        }
    }

    @Override // k3.q
    public final void f() {
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
