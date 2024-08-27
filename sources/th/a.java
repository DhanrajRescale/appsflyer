package th;

import android.os.Parcel;
import android.os.Parcelable;
import hb.e;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new e(24);

    /* renamed from: a, reason: collision with root package name */
    public final String f36077a;

    /* renamed from: b, reason: collision with root package name */
    public final String f36078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f36079c;

    public a(String id2, String rewardType, String message) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f36077a = id2;
        this.f36078b = rewardType;
        this.f36079c = message;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.f36077a, aVar.f36077a) && Intrinsics.a(this.f36078b, aVar.f36078b) && Intrinsics.a(this.f36079c, aVar.f36079c);
    }

    public final int hashCode() {
        return this.f36079c.hashCode() + h.g(this.f36078b, this.f36077a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RewardClaim(id=");
        sb2.append(this.f36077a);
        sb2.append(", rewardType=");
        sb2.append(this.f36078b);
        sb2.append(", message=");
        return d.o(sb2, this.f36079c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f36077a);
        out.writeString(this.f36078b);
        out.writeString(this.f36079c);
    }
}
