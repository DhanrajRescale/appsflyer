package lp;

import java.util.Map;

/* loaded from: classes2.dex */
public final class e1 extends vl.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f24971g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bl.j f24972h;

    public e1(bl.j jVar) {
        this.f24972h = jVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [lp.f1, lp.u, lp.r] */
    public final f1 t0() {
        Map v10 = this.f24972h.v();
        d1 d1Var = new d1(this.f24971g);
        ?? uVar = new u();
        if (v10.isEmpty()) {
            uVar.f25046d = v10;
            uVar.f24977f = d1Var;
            return uVar;
        }
        throw new IllegalArgumentException();
    }
}
