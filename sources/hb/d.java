package hb;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new k6.d(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f18156a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18157b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18158c;

    /* renamed from: d, reason: collision with root package name */
    public final double f18159d;

    /* renamed from: e, reason: collision with root package name */
    public final b f18160e;

    /* renamed from: f, reason: collision with root package name */
    public final List f18161f;

    public d(String identifier, String name, String imageUrl, double d10, b change, List tradeData) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(change, "change");
        Intrinsics.checkNotNullParameter(tradeData, "tradeData");
        this.f18156a = identifier;
        this.f18157b = name;
        this.f18158c = imageUrl;
        this.f18159d = d10;
        this.f18160e = change;
        this.f18161f = tradeData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f18156a, dVar.f18156a) && Intrinsics.a(this.f18157b, dVar.f18157b) && Intrinsics.a(this.f18158c, dVar.f18158c) && Double.compare(this.f18159d, dVar.f18159d) == 0 && Intrinsics.a(this.f18160e, dVar.f18160e) && Intrinsics.a(this.f18161f, dVar.f18161f);
    }

    public final int hashCode() {
        return this.f18161f.hashCode() + ((this.f18160e.hashCode() + nn.d.c(this.f18159d, jr.h.g(this.f18158c, jr.h.g(this.f18157b, this.f18156a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StockMeta(identifier=");
        sb2.append(this.f18156a);
        sb2.append(", name=");
        sb2.append(this.f18157b);
        sb2.append(", imageUrl=");
        sb2.append(this.f18158c);
        sb2.append(", lastTradePrice=");
        sb2.append(this.f18159d);
        sb2.append(", change=");
        sb2.append(this.f18160e);
        sb2.append(", tradeData=");
        return a3.a.l(sb2, this.f18161f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18156a);
        out.writeString(this.f18157b);
        out.writeString(this.f18158c);
        out.writeDouble(this.f18159d);
        this.f18160e.writeToParcel(out, i10);
        Iterator p10 = a3.a.p(this.f18161f, out);
        while (p10.hasNext()) {
            ((f) p10.next()).writeToParcel(out, i10);
        }
    }
}
