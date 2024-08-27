package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class h implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<h> CREATOR = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final c0 f18175a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18176b;

    /* renamed from: c, reason: collision with root package name */
    public final double f18177c;

    /* renamed from: d, reason: collision with root package name */
    public final double f18178d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f18179e;

    /* renamed from: f, reason: collision with root package name */
    public final b0 f18180f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18181g;

    /* renamed from: h, reason: collision with root package name */
    public final String f18182h;

    public h(c0 name, int i10, double d10, double d11, d0 type, b0 color, String textPrefix, String textSuffix) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(textPrefix, "textPrefix");
        Intrinsics.checkNotNullParameter(textSuffix, "textSuffix");
        this.f18175a = name;
        this.f18176b = i10;
        this.f18177c = d10;
        this.f18178d = d11;
        this.f18179e = type;
        this.f18180f = color;
        this.f18181g = textPrefix;
        this.f18182h = textSuffix;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f18175a == hVar.f18175a && this.f18176b == hVar.f18176b && Double.compare(this.f18177c, hVar.f18177c) == 0 && Double.compare(this.f18178d, hVar.f18178d) == 0 && this.f18179e == hVar.f18179e && this.f18180f == hVar.f18180f && Intrinsics.a(this.f18181g, hVar.f18181g) && Intrinsics.a(this.f18182h, hVar.f18182h);
    }

    public final int hashCode() {
        return this.f18182h.hashCode() + jr.h.g(this.f18181g, (this.f18180f.hashCode() + ((this.f18179e.hashCode() + nn.d.c(this.f18178d, nn.d.c(this.f18177c, da.e.f(this.f18176b, this.f18175a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TradeSentiment(name=");
        sb2.append(this.f18175a);
        sb2.append(", order=");
        sb2.append(this.f18176b);
        sb2.append(", value=");
        sb2.append(this.f18177c);
        sb2.append(", percentage=");
        sb2.append(this.f18178d);
        sb2.append(", type=");
        sb2.append(this.f18179e);
        sb2.append(", color=");
        sb2.append(this.f18180f);
        sb2.append(", textPrefix=");
        sb2.append(this.f18181g);
        sb2.append(", textSuffix=");
        return nn.d.o(sb2, this.f18182h, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18175a.name());
        out.writeInt(this.f18176b);
        out.writeDouble(this.f18177c);
        out.writeDouble(this.f18178d);
        out.writeString(this.f18179e.name());
        out.writeString(this.f18180f.name());
        out.writeString(this.f18181g);
        out.writeString(this.f18182h);
    }
}
