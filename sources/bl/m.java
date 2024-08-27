package bl;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.FacebookSdk;
import kotlin.jvm.internal.Intrinsics;
import nl.y;

/* loaded from: classes.dex */
public final class m implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public androidx.fragment.app.g f7122a;

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(sensor, "sensor");
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        boolean z10;
        if (sl.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            androidx.fragment.app.g gVar = this.f7122a;
            if (gVar != null) {
                float[] fArr = event.values;
                int i10 = 0;
                double d10 = fArr[0] / 9.80665f;
                double d11 = fArr[1] / 9.80665f;
                double d12 = fArr[2] / 9.80665f;
                if (Math.sqrt((d12 * d12) + (d11 * d11) + (d10 * d10)) > 2.3d) {
                    y yVar = (y) gVar.f1704b;
                    String appId = (String) gVar.f1705c;
                    e eVar = e.f7087a;
                    if (!sl.a.b(e.class)) {
                        try {
                            Intrinsics.checkNotNullParameter(appId, "$appId");
                            if (yVar != null && yVar.f28972g) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            boolean codelessSetupEnabled = FacebookSdk.getCodelessSetupEnabled();
                            if (z10 && codelessSetupEnabled) {
                                e eVar2 = e.f7087a;
                                if (!sl.a.b(eVar2)) {
                                    try {
                                        if (!e.f7094h) {
                                            e.f7094h = true;
                                            FacebookSdk.getExecutor().execute(new d(appId, i10));
                                        }
                                    } catch (Throwable th2) {
                                        sl.a.a(eVar2, th2);
                                    }
                                }
                            }
                        } catch (Throwable th3) {
                            sl.a.a(e.class, th3);
                        }
                    }
                }
            }
        } catch (Throwable th4) {
            sl.a.a(this, th4);
        }
    }
}
