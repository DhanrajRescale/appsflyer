package u0;

import kotlin.Unit;
import t0.o2;
import t0.q2;

/* loaded from: classes.dex */
public final class s extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final s f36656c = new j0(0, 3, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        o2 o2Var = (o2) k0Var.b(1);
        t0.d dVar = (t0.d) k0Var.b(0);
        c cVar = (c) k0Var.b(2);
        q2 h10 = o2Var.h();
        try {
            if (cVar.f36619c.d0()) {
                cVar.f36618b.c0(fVar, h10, xVar);
                Unit unit = Unit.f23355a;
                h10.e(true);
                q2Var.d();
                dVar.getClass();
                q2Var.u(o2Var, o2Var.b(dVar));
                q2Var.j();
                return;
            }
            t0.t.F("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
            throw null;
        } catch (Throwable th2) {
            h10.e(false);
            throw th2;
        }
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "anchor";
        }
        if (t0.t.Q(i10, 1)) {
            return "from";
        }
        if (t0.t.Q(i10, 2)) {
            return "fixups";
        }
        return super.c(i10);
    }
}
