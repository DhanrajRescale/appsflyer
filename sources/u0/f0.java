package u0;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.functions.Function2;
import t0.q2;

/* loaded from: classes.dex */
public final class f0 extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f36626c = new j0(0, 2, 1);

    @Override // u0.j0
    public final void a(k0 k0Var, t0.f fVar, q2 q2Var, t0.x xVar) {
        ((Function2) k0Var.b(1)).invoke(fVar.h(), k0Var.b(0));
    }

    @Override // u0.j0
    public final String c(int i10) {
        if (t0.t.Q(i10, 0)) {
            return AppMeasurementSdk.ConditionalUserProperty.VALUE;
        }
        if (t0.t.Q(i10, 1)) {
            return "block";
        }
        return super.c(i10);
    }
}
