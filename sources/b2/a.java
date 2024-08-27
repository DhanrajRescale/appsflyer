package b2;

import t0.t;

/* loaded from: classes.dex */
public final class a extends kp.j {

    /* renamed from: e, reason: collision with root package name */
    public g f3087e;

    @Override // kp.j
    public final boolean G(c cVar) {
        if (cVar == this.f3087e.getKey()) {
            return true;
        }
        return false;
    }

    @Override // kp.j
    public final Object P(i iVar) {
        if (iVar == this.f3087e.getKey()) {
            return this.f3087e.getValue();
        }
        t.C0("Check failed.");
        throw null;
    }
}
