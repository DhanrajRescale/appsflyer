package os;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import ls.n0;

/* loaded from: classes2.dex */
public final class j implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    public int f30338a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f30339b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f30340c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f30341d = new float[3];

    /* renamed from: e, reason: collision with root package name */
    public final q f30342e;

    public j(q qVar) {
        this.f30342e = qVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        float f10;
        float[] fArr2 = sensorEvent.values;
        int i10 = 0;
        while (true) {
            fArr = this.f30341d;
            if (i10 >= 3) {
                break;
            }
            if (i10 < fArr.length) {
                f10 = fArr[i10];
            } else {
                f10 = s0.g.f34069a;
            }
            fArr[i10] = nn.d.b(fArr2[i10], f10, 0.7f, f10);
            i10++;
        }
        int i11 = this.f30339b;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = (f12 * f12) + (f11 * f11);
        float f14 = fArr[2];
        float f15 = (f14 * f14) + f13;
        this.f30339b = 0;
        if (f14 > 7.8f && f14 < 11.8f) {
            this.f30339b = -1;
        }
        if (f14 < -7.8f && f14 > -11.8f) {
            this.f30339b = 1;
        }
        if (f15 < 60.840004f || f15 > 139.24f) {
            this.f30339b = 0;
        }
        int i12 = this.f30339b;
        if (i11 != i12) {
            this.f30340c = sensorEvent.timestamp;
        }
        long j10 = sensorEvent.timestamp - this.f30340c;
        if (i12 != -1) {
            if (i12 != 0) {
                if (i12 == 1 && j10 > 250000000 && this.f30338a == 0) {
                    el.l.T0("MixpanelAPI.FlipGesture", "Flip gesture begun");
                    this.f30338a = 1;
                    return;
                }
                return;
            }
            if (j10 > 1000000000 && this.f30338a != 0) {
                el.l.T0("MixpanelAPI.FlipGesture", "Flip gesture abandoned");
                this.f30338a = 0;
                return;
            }
            return;
        }
        if (j10 > 250000000 && this.f30338a == 1) {
            el.l.T0("MixpanelAPI.FlipGesture", "Flip gesture completed");
            this.f30338a = 0;
            u uVar = this.f30342e.f30367c;
            n0 n0Var = uVar.f30394c;
            if (!n0Var.i()) {
                n0Var.m("$ab_gesture3", null);
            }
            t tVar = uVar.f30399h;
            tVar.sendMessage(tVar.obtainMessage(1));
        }
    }
}
