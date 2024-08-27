package up;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f37326a;

    /* renamed from: b, reason: collision with root package name */
    public final tp.b f37327b;

    public d(AppMeasurementSdk appMeasurementSdk, tp.b bVar) {
        this.f37327b = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new c(this));
        this.f37326a = new HashSet();
    }
}
