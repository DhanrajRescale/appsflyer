package u0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import t0.h2;
import t0.q2;

/* loaded from: classes.dex */
public final class w extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w f36660c = new j0(0, 1, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        xVar.f35231b.add((h2) k0Var.b(0));
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return AppMeasurementSdk.ConditionalUserProperty.VALUE;
        }
        return super.c(i10);
    }
}
