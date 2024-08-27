package tp;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class e implements d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile e f36345c;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f36346a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f36347b;

    public e(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f36346a = appMeasurementSdk;
        this.f36347b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (up.b.c(str) && up.b.b(bundle, str2) && up.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f36346a.logEvent(str, str2, bundle);
        }
    }

    public final wn.e b(String str, b bVar) {
        Object obj;
        Preconditions.checkNotNull(bVar);
        if (!up.b.c(str)) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f36347b;
        if (!isEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean equals = AppMeasurement.FIAM_ORIGIN.equals(str);
        AppMeasurementSdk appMeasurementSdk = this.f36346a;
        if (equals) {
            obj = new up.d(appMeasurementSdk, bVar);
        } else if ("clx".equals(str)) {
            obj = new up.f(appMeasurementSdk, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new wn.e(6, this, str);
    }
}
