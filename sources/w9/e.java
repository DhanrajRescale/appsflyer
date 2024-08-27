package w9;

import android.graphics.PointF;
import java.util.ArrayList;
import l9.l;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f38891a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(float f10, float f11) {
        boolean z10;
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        if ((i10 ^ i11) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i13 = i10 % i11;
        if (!z10 && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static float d(float f10, float f11, float f12) {
        return nn.d.b(f11, f10, f12, f10);
    }

    public static void e(p9.e eVar, int i10, ArrayList arrayList, p9.e eVar2, l lVar) {
        if (eVar.a(i10, lVar.d())) {
            String d10 = lVar.d();
            eVar2.getClass();
            p9.e eVar3 = new p9.e(eVar2);
            eVar3.f30794a.add(d10);
            p9.e eVar4 = new p9.e(eVar3);
            eVar4.f30795b = lVar;
            arrayList.add(eVar4);
        }
    }
}
