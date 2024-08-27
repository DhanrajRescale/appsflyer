package zi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class k implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<k> CREATOR = new j(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f42492a;

    /* renamed from: b, reason: collision with root package name */
    public final List f42493b;

    public k(String header, List narrations) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(narrations, "narrations");
        this.f42492a = header;
        this.f42493b = narrations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.a(this.f42492a, kVar.f42492a) && Intrinsics.a(this.f42493b, kVar.f42493b);
    }

    public final int hashCode() {
        return this.f42493b.hashCode() + (this.f42492a.hashCode() * 31);
    }

    public final String toString() {
        return "NarrationUiData(header=" + this.f42492a + ", narrations=" + this.f42493b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f42492a);
        Iterator p10 = a3.a.p(this.f42493b, out);
        while (p10.hasNext()) {
            ((i) p10.next()).writeToParcel(out, i10);
        }
    }
}
