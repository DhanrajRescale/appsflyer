package fg;

import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.data.remote.request.WithdrawInitiateDto;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new hb.e(17);

    /* renamed from: a, reason: collision with root package name */
    public final WithdrawInitiateDto f16062a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16063b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16064c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16065d;

    public c(WithdrawInitiateDto data, String sessionId, String mobileNumber, int i10) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(mobileNumber, "mobileNumber");
        this.f16062a = data;
        this.f16063b = sessionId;
        this.f16064c = mobileNumber;
        this.f16065d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.a(this.f16062a, cVar.f16062a) && Intrinsics.a(this.f16063b, cVar.f16063b) && Intrinsics.a(this.f16064c, cVar.f16064c) && this.f16065d == cVar.f16065d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16065d) + jr.h.g(this.f16064c, jr.h.g(this.f16063b, this.f16062a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "OtpVerifyScreenData(data=" + this.f16062a + ", sessionId=" + this.f16063b + ", mobileNumber=" + this.f16064c + ", otpTime=" + this.f16065d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f16062a.writeToParcel(out, i10);
        out.writeString(this.f16063b);
        out.writeString(this.f16064c);
        out.writeInt(this.f16065d);
    }
}
