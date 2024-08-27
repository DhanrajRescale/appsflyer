package zp;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes2.dex */
public final class o extends d implements Cloneable {

    @NonNull
    public static final Parcelable.Creator<o> CREATOR = new com.google.android.material.datepicker.a(18);

    /* renamed from: a, reason: collision with root package name */
    public final String f42766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42768c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42769d;

    /* renamed from: e, reason: collision with root package name */
    public final String f42770e;

    public o(String str, String str2, String str3, String str4, boolean z10) {
        boolean z11 = true;
        if ((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f42766a = str;
        this.f42767b = str2;
        this.f42768c = str3;
        this.f42769d = z10;
        this.f42770e = str4;
    }

    @Override // zp.d
    public final String J() {
        return "phone";
    }

    @Override // zp.d
    public final d R() {
        return new o(this.f42766a, this.f42767b, this.f42768c, this.f42770e, this.f42769d);
    }

    public final Object clone() {
        return new o(this.f42766a, this.f42767b, this.f42768c, this.f42770e, this.f42769d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f42766a, false);
        SafeParcelWriter.writeString(parcel, 2, this.f42767b, false);
        SafeParcelWriter.writeString(parcel, 4, this.f42768c, false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.f42769d);
        SafeParcelWriter.writeString(parcel, 6, this.f42770e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
