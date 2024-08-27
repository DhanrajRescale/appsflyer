package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class f implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    /* renamed from: a, reason: collision with root package name */
    public final double f18169a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18170b;

    public f(double d10, long j10) {
        this.f18169a = d10;
        this.f18170b = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Double.compare(this.f18169a, fVar.f18169a) == 0 && this.f18170b == fVar.f18170b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18170b) + (Double.hashCode(this.f18169a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TradeData(value=");
        sb2.append(this.f18169a);
        sb2.append(", timestamp=");
        return a3.a.j(sb2, this.f18170b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.f18169a);
        out.writeLong(this.f18170b);
    }
}
