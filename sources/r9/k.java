package r9;

import android.graphics.PointF;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33513a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f33514b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f33515c;

    public k(PointF pointF, boolean z10, List list) {
        this.f33514b = pointF;
        this.f33515c = z10;
        this.f33513a = new ArrayList(list);
    }

    public final void a(float f10, float f11) {
        if (this.f33514b == null) {
            this.f33514b = new PointF();
        }
        this.f33514b.set(f10, f11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f33513a.size());
        sb2.append("closed=");
        return v.e.k(sb2, this.f33515c, UrlTreeKt.componentParamSuffixChar);
    }

    public k() {
        this.f33513a = new ArrayList();
    }
}
