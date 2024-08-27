package zi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class i implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<i> CREATOR = new hb.e(29);

    /* renamed from: a, reason: collision with root package name */
    public final String f42487a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42488b;

    /* renamed from: c, reason: collision with root package name */
    public int f42489c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42490d;

    public i(String title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f42487a = title;
        this.f42488b = description;
        this.f42489c = -1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.a(this.f42487a, iVar.f42487a) && Intrinsics.a(this.f42488b, iVar.f42488b);
    }

    public final int hashCode() {
        return this.f42488b.hashCode() + (this.f42487a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Narration(title=");
        sb2.append(this.f42487a);
        sb2.append(", description=");
        return nn.d.o(sb2, this.f42488b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f42487a);
        out.writeString(this.f42488b);
    }
}
