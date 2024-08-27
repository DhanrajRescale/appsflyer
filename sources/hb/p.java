package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class p implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<p> CREATOR = new e(10);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18208a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18209b;

    public p(int i10, boolean z10) {
        this.f18208a = z10;
        this.f18209b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f18208a == pVar.f18208a && this.f18209b == pVar.f18209b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18209b) + (Boolean.hashCode(this.f18208a) * 31);
    }

    public final String toString() {
        return "Likes(isLiked=" + this.f18208a + ", count=" + this.f18209b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f18208a ? 1 : 0);
        out.writeInt(this.f18209b);
    }
}
