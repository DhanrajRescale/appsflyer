package up;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final tp.b f37329a;

    public f(AppMeasurementSdk appMeasurementSdk, tp.b bVar) {
        this.f37329a = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new e(this));
    }
}
