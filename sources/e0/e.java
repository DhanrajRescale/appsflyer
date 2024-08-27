package e0;

import kotlin.jvm.functions.Function0;
import t0.n1;
import t0.o3;

/* loaded from: classes.dex */
public final class e extends j0 {
    public static final yq.b F = new yq.b(8, 0);
    public static final d1.r G = t0.t.g0(b.f14645a, d.f14655b);
    public final n1 E;

    public e(int i10, float f10, Function0 function0) {
        super(i10, f10);
        this.E = t0.t.n0(function0, o3.f35116a);
    }

    @Override // e0.j0
    public final int j() {
        return ((Number) ((Function0) this.E.getValue()).mo2invoke()).intValue();
    }
}
