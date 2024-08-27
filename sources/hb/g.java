package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new e(1);

    /* renamed from: a, reason: collision with root package name */
    public final a0 f18171a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18172b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18173c;

    /* renamed from: d, reason: collision with root package name */
    public final b f18174d;

    public g(a0 type, String title, String description, b bVar) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f18171a = type;
        this.f18172b = title;
        this.f18173c = description;
        this.f18174d = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f18171a == gVar.f18171a && Intrinsics.a(this.f18172b, gVar.f18172b) && Intrinsics.a(this.f18173c, gVar.f18173c) && Intrinsics.a(this.f18174d, gVar.f18174d);
    }

    public final int hashCode() {
        int hashCode;
        int g10 = jr.h.g(this.f18173c, jr.h.g(this.f18172b, this.f18171a.hashCode() * 31, 31), 31);
        b bVar = this.f18174d;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return g10 + hashCode;
    }

    public final String toString() {
        return "TradeMeta(type=" + this.f18171a + ", title=" + this.f18172b + ", description=" + this.f18173c + ", change=" + this.f18174d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18171a.name());
        out.writeString(this.f18172b);
        out.writeString(this.f18173c);
        b bVar = this.f18174d;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i10);
        }
    }
}
