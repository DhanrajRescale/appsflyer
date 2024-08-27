package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class o implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<o> CREATOR = new e(8);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18206a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18207b;

    public o(int i10, boolean z10) {
        this.f18206a = z10;
        this.f18207b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f18206a == oVar.f18206a && this.f18207b == oVar.f18207b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18207b) + (Boolean.hashCode(this.f18206a) * 31);
    }

    public final String toString() {
        return "Comments(canComment=" + this.f18206a + ", count=" + this.f18207b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f18206a ? 1 : 0);
        out.writeInt(this.f18207b);
    }
}
