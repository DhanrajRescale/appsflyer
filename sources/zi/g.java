package zi;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import vt.y;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f42476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42477b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42478c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42479d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42480e;

    /* renamed from: f, reason: collision with root package name */
    public final List f42481f;

    /* renamed from: g, reason: collision with root package name */
    public final List f42482g;

    /* renamed from: h, reason: collision with root package name */
    public final List f42483h;

    /* renamed from: i, reason: collision with root package name */
    public final k f42484i;

    public g(String str, String representationType, boolean z10, String str2, String str3, ArrayList columnHeaders, ArrayList rowHeaders, ArrayList dataSet, k kVar) {
        Intrinsics.checkNotNullParameter(representationType, "representationType");
        Intrinsics.checkNotNullParameter(columnHeaders, "columnHeaders");
        Intrinsics.checkNotNullParameter(rowHeaders, "rowHeaders");
        Intrinsics.checkNotNullParameter(dataSet, "dataSet");
        this.f42476a = str;
        this.f42477b = representationType;
        this.f42478c = z10;
        this.f42479d = str2;
        this.f42480e = str3;
        this.f42481f = columnHeaders;
        this.f42482g = rowHeaders;
        this.f42483h = dataSet;
        this.f42484i = kVar;
    }

    public final d a() {
        List list;
        List list2 = this.f42482g;
        List list3 = this.f42481f;
        boolean z10 = this.f42478c;
        if (z10) {
            list = list3;
        } else {
            list = list2;
        }
        if (!z10) {
            list2 = list3;
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : this.f42483h) {
            int i11 = i10 + 1;
            if (i10 >= 0) {
                List list4 = (List) obj;
                if (!Intrinsics.a(((a) list3.get(i10)).f42461c, Boolean.TRUE)) {
                    arrayList.add(list4);
                }
                i10 = i11;
            } else {
                y.j();
                throw null;
            }
        }
        if (z10) {
            int size = ((List) arrayList.get(0)).size();
            int size2 = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                ArrayList arrayList3 = new ArrayList(size2);
                for (int i13 = 0; i13 < size2; i13++) {
                    arrayList3.add(((List) arrayList.get(i13)).get(i12));
                }
                arrayList2.add(arrayList3);
            }
            arrayList = arrayList2;
        }
        return new d(list2, list, arrayList, this.f42480e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.a(this.f42476a, gVar.f42476a) && Intrinsics.a(this.f42477b, gVar.f42477b) && this.f42478c == gVar.f42478c && Intrinsics.a(this.f42479d, gVar.f42479d) && Intrinsics.a(this.f42480e, gVar.f42480e) && Intrinsics.a(this.f42481f, gVar.f42481f) && Intrinsics.a(this.f42482g, gVar.f42482g) && Intrinsics.a(this.f42483h, gVar.f42483h) && Intrinsics.a(this.f42484i, gVar.f42484i);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i10 = 0;
        String str = this.f42476a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d10 = v.e.d(this.f42478c, jr.h.g(this.f42477b, hashCode * 31, 31), 31);
        String str2 = this.f42479d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (d10 + hashCode2) * 31;
        String str3 = this.f42480e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int e10 = nn.d.e(this.f42483h, nn.d.e(this.f42482g, nn.d.e(this.f42481f, (i11 + hashCode3) * 31, 31), 31), 31);
        k kVar = this.f42484i;
        if (kVar != null) {
            i10 = kVar.hashCode();
        }
        return e10 + i10;
    }

    public final String toString() {
        return "MarketSectionData(sectionSentiment=" + this.f42476a + ", representationType=" + this.f42477b + ", isChartRepresentationTransposed=" + this.f42478c + ", description=" + this.f42479d + ", intersectionTitle=" + this.f42480e + ", columnHeaders=" + this.f42481f + ", rowHeaders=" + this.f42482g + ", dataSet=" + this.f42483h + ", universalNarration=" + this.f42484i + ")";
    }
}
