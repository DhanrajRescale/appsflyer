package jg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import hb.e;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new e(19);

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("asset_class")
    @NotNull
    private final String f21358a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("portfolio_name")
    private final String f21359b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("portfolio_id")
    @NotNull
    private final String f21360c;

    /* renamed from: d, reason: collision with root package name */
    @SerializedName("is_model")
    private boolean f21361d;

    public a(String assetClass, String str, String portfolioId, boolean z10) {
        Intrinsics.checkNotNullParameter(assetClass, "assetClass");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f21358a = assetClass;
        this.f21359b = str;
        this.f21360c = portfolioId;
        this.f21361d = z10;
    }

    public final String a() {
        return this.f21360c;
    }

    public final String b() {
        return this.f21359b;
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
        return Intrinsics.a(this.f21358a, aVar.f21358a) && Intrinsics.a(this.f21359b, aVar.f21359b) && Intrinsics.a(this.f21360c, aVar.f21360c) && this.f21361d == aVar.f21361d;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f21358a.hashCode() * 31;
        String str = this.f21359b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.f21361d) + h.g(this.f21360c, (hashCode2 + hashCode) * 31, 31);
    }

    public final String toString() {
        String str = this.f21358a;
        String str2 = this.f21359b;
        String str3 = this.f21360c;
        boolean z10 = this.f21361d;
        StringBuilder l10 = v.e.l("FnoModifyPortfolioRequestDto(assetClass=", str, ", portfolioName=", str2, ", portfolioId=");
        l10.append(str3);
        l10.append(", isModel=");
        l10.append(z10);
        l10.append(")");
        return l10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f21358a);
        out.writeString(this.f21359b);
        out.writeString(this.f21360c);
        out.writeInt(this.f21361d ? 1 : 0);
    }

    public /* synthetic */ a(String str, String str2, boolean z10, int i10) {
        this((i10 & 1) != 0 ? "OPTIONS" : null, (i10 & 2) != 0 ? null : str, str2, (i10 & 8) != 0 ? true : z10);
    }
}
