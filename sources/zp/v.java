package zp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class v extends d {

    @NonNull
    public static final Parcelable.Creator<v> CREATOR = new com.google.android.material.datepicker.a(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f42784a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42785b;

    public v(String str, String str2) {
        this.f42784a = Preconditions.checkNotEmpty(str);
        this.f42785b = Preconditions.checkNotEmpty(str2);
    }

    @Override // zp.d
    public final String J() {
        return "twitter.com";
    }

    @Override // zp.d
    public final d R() {
        return new v(this.f42784a, this.f42785b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42784a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42785b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
