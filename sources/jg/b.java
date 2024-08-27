package jg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import hb.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new e(20);

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("portfolio_id")
    private final String f21362a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private final String f21363b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("is_model")
    private final Boolean f21364c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("asset_class")
    private final String f21365d;

    /* renamed from: e, reason: collision with root package name */
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String f21366e;

    /* renamed from: f, reason: collision with root package name */
    @SerializedName("message")
    private final String f21367f;

    public b(String str, String str2, Boolean bool, String str3, String str4, String str5) {
        this.f21362a = str;
        this.f21363b = str2;
        this.f21364c = bool;
        this.f21365d = str3;
        this.f21366e = str4;
        this.f21367f = str5;
    }

    public final String a() {
        return this.f21367f;
    }

    public final String b() {
        return this.f21362a;
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
        return Intrinsics.a(this.f21362a, bVar.f21362a) && Intrinsics.a(this.f21363b, bVar.f21363b) && Intrinsics.a(this.f21364c, bVar.f21364c) && Intrinsics.a(this.f21365d, bVar.f21365d) && Intrinsics.a(this.f21366e, bVar.f21366e) && Intrinsics.a(this.f21367f, bVar.f21367f);
    }

    public final int hashCode() {
        String str = this.f21362a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f21363b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f21364c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.f21365d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f21366e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f21367f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f21362a;
        String str2 = this.f21363b;
        Boolean bool = this.f21364c;
        String str3 = this.f21365d;
        String str4 = this.f21366e;
        String str5 = this.f21367f;
        StringBuilder l10 = v.e.l("FnoModifyPortfolioResponseDto(portfolioId=", str, ", status=", str2, ", isModel=");
        l10.append(bool);
        l10.append(", assetClass=");
        l10.append(str3);
        l10.append(", name=");
        return a3.a.k(l10, str4, ", message=", str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f21362a);
        out.writeString(this.f21363b);
        Boolean bool = this.f21364c;
        if (bool == null) {
            out.writeInt(0);
        } else {
            a3.a.q(out, 1, bool);
        }
        out.writeString(this.f21365d);
        out.writeString(this.f21366e);
        out.writeString(this.f21367f);
    }
}
