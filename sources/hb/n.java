package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class n implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<n> CREATOR = new e(7);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18205a;

    public n(boolean z10) {
        this.f18205a = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && this.f18205a == ((n) obj).f18205a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18205a);
    }

    public final String toString() {
        return "Bookmarks(isBookmark=" + this.f18205a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f18205a ? 1 : 0);
    }
}
