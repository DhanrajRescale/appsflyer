package bn;

import p2.m;

/* loaded from: classes2.dex */
public abstract class c extends d {

    /* renamed from: g, reason: collision with root package name */
    public final m f7147g;

    public c(qm.a aVar, cn.i iVar) {
        super(aVar, iVar);
        this.f7147g = new m(this);
    }

    public final boolean n(um.i iVar, um.e eVar) {
        if (iVar == null) {
            return false;
        }
        float indexOf = eVar.f37272p.indexOf(iVar);
        float size = eVar.f37272p.size();
        this.f7148c.getClass();
        if (indexOf >= size * 1.0f) {
            return false;
        }
        return true;
    }
}
