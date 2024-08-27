package um;

import android.graphics.Color;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k extends l {
    public int E;
    public ArrayList F;
    public final int G;
    public float H;
    public final float I;
    public final float J;
    public final ll.e K;
    public boolean L;
    public boolean M;

    public k(List list, String str) {
        super(list, str);
        this.f37278v = true;
        this.f37279w = true;
        this.f37280x = 0.5f;
        this.f37281y = null;
        this.f37280x = cn.h.c(0.5f);
        this.f37282z = Color.rgb(140, 234, 255);
        this.B = 85;
        this.C = 2.5f;
        this.D = false;
        this.E = 1;
        this.F = null;
        this.G = -1;
        this.H = 8.0f;
        this.I = 4.0f;
        this.J = 0.2f;
        this.K = new ll.e(14);
        this.L = true;
        this.M = true;
        ArrayList arrayList = new ArrayList();
        this.F = arrayList;
        arrayList.clear();
        this.F.add(Integer.valueOf(Color.rgb(140, 234, 255)));
    }

    public final void n(int i10) {
        if (this.F == null) {
            this.F = new ArrayList();
        }
        this.F.clear();
        this.F.add(Integer.valueOf(i10));
    }

    public final void o(float f10) {
        if (f10 >= 1.0f) {
            this.H = cn.h.c(f10);
        } else {
            Log.e("LineDataSet", "Circle radius cannot be < 1");
        }
    }
}
