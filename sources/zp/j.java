package zp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class j extends d {

    @NonNull
    public static final Parcelable.Creator<j> CREATOR = new com.google.android.material.datepicker.a(17);

    /* renamed from: a, reason: collision with root package name */
    public final String f42764a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42765b;

    public j(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f42764a = str;
        this.f42765b = str2;
    }

    @Override // zp.d
    public final String J() {
        return "google.com";
    }

    @Override // zp.d
    public final d R() {
        return new j(this.f42764a, this.f42765b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42764a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42765b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
