package zi;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final List f42517a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42518b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42519c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42520d;

    /* renamed from: e, reason: collision with root package name */
    public final c f42521e;

    public q(ArrayList arrayList, String durationId, ArrayList arrayList2, boolean z10, c cVar) {
        Intrinsics.checkNotNullParameter(durationId, "durationId");
        this.f42517a = arrayList;
        this.f42518b = arrayList2;
        this.f42519c = durationId;
        this.f42520d = z10;
        this.f42521e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return Intrinsics.a(this.f42517a, qVar.f42517a) && Intrinsics.a(this.f42518b, qVar.f42518b) && Intrinsics.a(this.f42519c, qVar.f42519c) && this.f42520d == qVar.f42520d && Intrinsics.a(this.f42521e, qVar.f42521e);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i10 = 0;
        List list = this.f42517a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i11 = hashCode * 31;
        List list2 = this.f42518b;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int d10 = v.e.d(this.f42520d, jr.h.g(this.f42519c, (i11 + hashCode2) * 31, 31), 31);
        c cVar = this.f42521e;
        if (cVar != null) {
            i10 = cVar.f42466a.hashCode();
        }
        return d10 + i10;
    }

    public final String toString() {
        return "StockChartV2(intervals=" + this.f42517a + ", dataPoints=" + this.f42518b + ", durationId=" + this.f42519c + ", showEmptyData=" + this.f42520d + ", emptyData=" + this.f42521e + ")";
    }
}
