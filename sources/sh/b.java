package sh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import hb.e;
import jr.h;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new e(22);

    /* renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    @NotNull
    private final String f34627a;

    /* renamed from: b, reason: collision with root package name */
    @SerializedName("expiry_text")
    private final String f34628b;

    public b(String id2, String str) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f34627a = id2;
        this.f34628b = str;
    }

    public final th.b a() {
        String str = this.f34627a;
        String str2 = this.f34628b;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new th.b(str, str2, HttpUrl.FRAGMENT_ENCODE_SET, false);
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
        return Intrinsics.a(this.f34627a, bVar.f34627a) && Intrinsics.a(this.f34628b, bVar.f34628b);
    }

    public final int hashCode() {
        int hashCode = this.f34627a.hashCode() * 31;
        String str = this.f34628b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return h.s("ScratchCardDto(id=", this.f34627a, ", expiryDate=", this.f34628b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f34627a);
        out.writeString(this.f34628b);
    }
}
