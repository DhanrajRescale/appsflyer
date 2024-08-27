package th;

import android.os.Parcel;
import android.os.Parcelable;
import hb.e;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new e(25);

    /* renamed from: a, reason: collision with root package name */
    public final String f36080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36081b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36082c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f36083d;

    public b(String id2, String expiryDate, String claimRewardText, boolean z10) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(claimRewardText, "claimRewardText");
        this.f36080a = id2;
        this.f36081b = expiryDate;
        this.f36082c = claimRewardText;
        this.f36083d = z10;
    }

    public static b a(b bVar, String claimRewardText) {
        String id2 = bVar.f36080a;
        String expiryDate = bVar.f36081b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(expiryDate, "expiryDate");
        Intrinsics.checkNotNullParameter(claimRewardText, "claimRewardText");
        return new b(id2, expiryDate, claimRewardText, true);
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
        return Intrinsics.a(this.f36080a, bVar.f36080a) && Intrinsics.a(this.f36081b, bVar.f36081b) && Intrinsics.a(this.f36082c, bVar.f36082c) && this.f36083d == bVar.f36083d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36083d) + h.g(this.f36082c, h.g(this.f36081b, this.f36080a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScratchCard(id=");
        sb2.append(this.f36080a);
        sb2.append(", expiryDate=");
        sb2.append(this.f36081b);
        sb2.append(", claimRewardText=");
        sb2.append(this.f36082c);
        sb2.append(", isScratched=");
        return da.e.o(sb2, this.f36083d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f36080a);
        out.writeString(this.f36081b);
        out.writeString(this.f36082c);
        out.writeInt(this.f36083d ? 1 : 0);
    }
}
