package zi;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f42467a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42468b;

    /* renamed from: c, reason: collision with root package name */
    public final List f42469c;

    /* renamed from: d, reason: collision with root package name */
    public final List f42470d;

    public d(List columnHeaders, List rowHeaders, ArrayList dataSet, String str) {
        Intrinsics.checkNotNullParameter(columnHeaders, "columnHeaders");
        Intrinsics.checkNotNullParameter(rowHeaders, "rowHeaders");
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        this.f42467a = str;
        this.f42468b = columnHeaders;
        this.f42469c = rowHeaders;
        this.f42470d = dataSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f42467a, dVar.f42467a) && Intrinsics.a(this.f42468b, dVar.f42468b) && Intrinsics.a(this.f42469c, dVar.f42469c) && Intrinsics.a(this.f42470d, dVar.f42470d);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f42467a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f42470d.hashCode() + nn.d.e(this.f42469c, nn.d.e(this.f42468b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        return "MarketBarData(intersectionTitle=" + this.f42467a + ", columnHeaders=" + this.f42468b + ", rowHeaders=" + this.f42469c + ", dataSet=" + this.f42470d + ")";
    }
}
