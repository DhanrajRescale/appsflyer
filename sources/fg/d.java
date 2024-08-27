package fg;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<d> CREATOR = new hb.e(18);

    /* renamed from: a, reason: collision with root package name */
    public final c f16066a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16067b;

    public d(c cVar, String str) {
        this.f16066a = cVar;
        this.f16067b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.a(this.f16066a, dVar.f16066a) && Intrinsics.a(this.f16067b, dVar.f16067b);
    }

    public final int hashCode() {
        c cVar = this.f16066a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        String str = this.f16067b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "OtpVerifyScreenDataWrapper(otpVerifyScreenData=" + this.f16066a + ", errorMessage=" + this.f16067b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        c cVar = this.f16066a;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i10);
        }
        out.writeString(this.f16067b);
    }
}
