package um;

/* loaded from: classes2.dex */
public final class m extends g {
    public m(n nVar) {
        super(nVar);
    }

    @Override // um.g
    public final ym.b b(int i10) {
        if (i10 == 0) {
            return i();
        }
        return null;
    }

    @Override // um.g
    public final i e(wm.c cVar) {
        return i().g((int) cVar.f39307a);
    }

    public final n i() {
        return (n) this.f37256i.get(0);
    }

    public final float j() {
        float f10 = s0.g.f34069a;
        for (int i10 = 0; i10 < i().f37272p.size(); i10++) {
            f10 += ((o) i().g(i10)).f37246a;
        }
        return f10;
    }
}
