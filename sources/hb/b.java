package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new k6.d(26);

    /* renamed from: a, reason: collision with root package name */
    public final double f18137a;

    /* renamed from: b, reason: collision with root package name */
    public final double f18138b;

    /* renamed from: c, reason: collision with root package name */
    public final a f18139c;

    public b(double d10, double d11, a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f18137a = d10;
        this.f18138b = d11;
        this.f18139c = type;
    }

    public final double a() {
        return this.f18138b;
    }

    public final a b() {
        return this.f18139c;
    }

    public final double c() {
        return this.f18137a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Double.compare(this.f18137a, bVar.f18137a) == 0 && Double.compare(this.f18138b, bVar.f18138b) == 0 && this.f18139c == bVar.f18139c;
    }

    public final int hashCode() {
        return this.f18139c.hashCode() + nn.d.c(this.f18138b, Double.hashCode(this.f18137a) * 31, 31);
    }

    public final String toString() {
        return "Change(value=" + this.f18137a + ", percentage=" + this.f18138b + ", type=" + this.f18139c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.f18137a);
        out.writeDouble(this.f18138b);
        out.writeString(this.f18139c.name());
    }
}
