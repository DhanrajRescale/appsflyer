package u0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import t0.i2;
import t0.q2;

/* loaded from: classes.dex */
public final class e extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f36623c = new j0(0, 2, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        t0.d dVar = (t0.d) k0Var.b(0);
        Object b10 = k0Var.b(1);
        if (b10 instanceof i2) {
            xVar.f35231b.add(((i2) b10).f35056a);
        }
        if (q2Var.f35156n == 0) {
            int i10 = q2Var.f35151i;
            int i11 = q2Var.f35152j;
            int c10 = q2Var.c(dVar);
            int f10 = q2Var.f(q2Var.f35144b, q2Var.o(c10 + 1));
            q2Var.f35151i = f10;
            q2Var.f35152j = f10;
            q2Var.s(1, c10);
            if (i10 >= f10) {
                i10++;
                i11++;
            }
            q2Var.f35145c[f10] = b10;
            q2Var.f35151i = i10;
            q2Var.f35152j = i11;
            return;
        }
        t0.t.F("Can only append a slot if not current inserting");
        throw null;
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return "anchor";
        }
        if (t0.t.Q(i10, 1)) {
            return AppMeasurementSdk.ConditionalUserProperty.VALUE;
        }
        return super.c(i10);
    }
}
