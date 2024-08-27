package com.google.android.gms.search;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import v.e;

@SafeParcelable.Class(creator = "GoogleNowAuthStateCreator")
@SafeParcelable.Reserved({CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT})
/* loaded from: classes2.dex */
public class GoogleNowAuthState extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleNowAuthState> CREATOR = new zza();

    @SafeParcelable.Field(getter = "getAuthCode", id = 1)
    String zza;

    @SafeParcelable.Field(getter = "getAccessToken", id = 2)
    String zzb;

    @SafeParcelable.Field(getter = "getNextAllowedTimeMillis", id = 3)
    long zzc;

    @SafeParcelable.Constructor
    public GoogleNowAuthState(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) String str2, @SafeParcelable.Param(id = 3) long j10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
    }

    public String getAccessToken() {
        return this.zzb;
    }

    public String getAuthCode() {
        return this.zza;
    }

    public long getNextAllowedTimeMillis() {
        return this.zzc;
    }

    @NonNull
    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        long j10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 74 + String.valueOf(str2).length());
        e.v(sb2, "mAuthCode = ", str, "\nmAccessToken = ", str2);
        sb2.append("\nmNextAllowedTimeMillis = ");
        sb2.append(j10);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getAuthCode(), false);
        SafeParcelWriter.writeString(parcel, 2, getAccessToken(), false);
        SafeParcelWriter.writeLong(parcel, 3, getNextAllowedTimeMillis());
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
