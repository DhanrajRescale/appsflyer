package sh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import hb.e;
import kotlin.jvm.internal.Intrinsics;
import nn.d;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new e(21);

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    @NotNull
    private final String f34624a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("reward_type")
    private final String f34625b;

    /* renamed from: c, reason: collision with root package name */
    @SerializedName("message")
    private final String f34626c;

    public a(String id2, String str, String str2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f34624a = id2;
        this.f34625b = str;
        this.f34626c = str2;
    }

    public final th.a a() {
        String str = this.f34624a;
        String str2 = this.f34625b;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = this.f34626c;
        if (str4 != null) {
            str3 = str4;
        }
        return new th.a(str, str2, str3);
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
        return Intrinsics.a(this.f34624a, aVar.f34624a) && Intrinsics.a(this.f34625b, aVar.f34625b) && Intrinsics.a(this.f34626c, aVar.f34626c);
    }

    public final int hashCode() {
        int hashCode = this.f34624a.hashCode() * 31;
        String str = this.f34625b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f34626c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f34624a;
        String str2 = this.f34625b;
        return d.o(v.e.l("RewardClaimDto(id=", str, ", rewardType=", str2, ", message="), this.f34626c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f34624a);
        out.writeString(this.f34625b);
        out.writeString(this.f34626c);
    }
}
