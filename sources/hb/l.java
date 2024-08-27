package hb;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new e(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f18203a;

    public l(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f18203a = url;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.a(this.f18203a, ((l) obj).f18203a);
    }

    public final int hashCode() {
        return this.f18203a.hashCode();
    }

    public final String toString() {
        return nn.d.o(new StringBuilder("Thumbnail(url="), this.f18203a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f18203a);
    }
}
