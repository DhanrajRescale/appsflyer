package hb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new k6.d(27);

    /* renamed from: a, reason: collision with root package name */
    public final e0 f18183a;

    /* renamed from: b, reason: collision with root package name */
    public final d f18184b;

    /* renamed from: c, reason: collision with root package name */
    public final double f18185c;

    /* renamed from: d, reason: collision with root package name */
    public final double f18186d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18187e;

    /* renamed from: f, reason: collision with root package name */
    public final c f18188f;

    /* renamed from: g, reason: collision with root package name */
    public final List f18189g;

    /* renamed from: h, reason: collision with root package name */
    public final List f18190h;

    public i(e0 status, d dVar, double d10, double d11, boolean z10, c progressBar, List tradeSentiment, List tradeMeta) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(progressBar, "progressBar");
        Intrinsics.checkNotNullParameter(tradeSentiment, "tradeSentiment");
        Intrinsics.checkNotNullParameter(tradeMeta, "tradeMeta");
        this.f18183a = status;
        this.f18184b = dVar;
        this.f18185c = d10;
        this.f18186d = d11;
        this.f18187e = z10;
        this.f18188f = progressBar;
        this.f18189g = tradeSentiment;
        this.f18190h = tradeMeta;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f18183a == iVar.f18183a && Intrinsics.a(this.f18184b, iVar.f18184b) && Double.compare(this.f18185c, iVar.f18185c) == 0 && Double.compare(this.f18186d, iVar.f18186d) == 0 && this.f18187e == iVar.f18187e && Intrinsics.a(this.f18188f, iVar.f18188f) && Intrinsics.a(this.f18189g, iVar.f18189g) && Intrinsics.a(this.f18190h, iVar.f18190h);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f18183a.hashCode() * 31;
        d dVar = this.f18184b;
        if (dVar == null) {
            hashCode = 0;
        } else {
            hashCode = dVar.hashCode();
        }
        return this.f18190h.hashCode() + nn.d.e(this.f18189g, (this.f18188f.hashCode() + v.e.d(this.f18187e, nn.d.c(this.f18186d, nn.d.c(this.f18185c, (hashCode2 + hashCode) * 31, 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TradeContent(status=");
        sb2.append(this.f18183a);
        sb2.append(", stockMeta=");
        sb2.append(this.f18184b);
        sb2.append(", entryPrice=");
        sb2.append(this.f18185c);
        sb2.append(", targetPrice=");
        sb2.append(this.f18186d);
        sb2.append(", isBearish=");
        sb2.append(this.f18187e);
        sb2.append(", progressBar=");
        sb2.append(this.f18188f);
        sb2.append(", tradeSentiment=");
        sb2.append(this.f18189g);
        sb2.append(", tradeMeta=");
        return a3.a.l(sb2, this.f18190h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18183a.name());
        d dVar = this.f18184b;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i10);
        }
        out.writeDouble(this.f18185c);
        out.writeDouble(this.f18186d);
        out.writeInt(this.f18187e ? 1 : 0);
        this.f18188f.writeToParcel(out, i10);
        Iterator p10 = a3.a.p(this.f18189g, out);
        while (p10.hasNext()) {
            ((h) p10.next()).writeToParcel(out, i10);
        }
        Iterator p11 = a3.a.p(this.f18190h, out);
        while (p11.hasNext()) {
            ((g) p11.next()).writeToParcel(out, i10);
        }
    }
}
