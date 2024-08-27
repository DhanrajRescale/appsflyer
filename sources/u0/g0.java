package u0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import t0.i2;
import t0.q2;
import t0.x1;

/* loaded from: classes.dex */
public final class g0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final g0 f36628c = new j0(1, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        int i10;
        int i11;
        Object b10 = k0Var.b(0);
        int a10 = k0Var.a(0);
        if (b10 instanceof i2) {
            xVar.f35231b.add(((i2) b10).f35056a);
        }
        Object D = q2Var.D(q2Var.f35161s, a10, b10);
        if (D instanceof i2) {
            i2 i2Var = (i2) D;
            t0.d dVar = i2Var.f35057b;
            if (dVar != null && dVar.a()) {
                i10 = q2Var.c(dVar);
                i11 = q2Var.H(i10);
            } else {
                i10 = -1;
                i11 = -1;
            }
            xVar.d(i2Var.f35056a, a10, i10, i11);
            return;
        }
        if (D instanceof x1) {
            ((x1) D).c();
        }
    }

    @Override // u0.j0
    public final String b(int i10) {
        if (t0.t.P(i10, 0)) {
            return "groupSlotIndex";
        }
        return super.b(i10);
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return AppMeasurementSdk.ConditionalUserProperty.VALUE;
        }
        return super.c(i10);
    }
}
