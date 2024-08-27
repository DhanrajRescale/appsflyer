package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import nn.d;

@ShowFirstParty
@SafeParcelable.Class(creator = "DocumentSectionCreator")
@SafeParcelable.Reserved({CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT})
/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    private static final zzs zzf;

    @SafeParcelable.Field(id = 1)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    final zzs zzc;

    @SafeParcelable.Field(defaultValue = "-1", id = 4)
    public final int zzd;

    @SafeParcelable.Field(id = 5)
    public final byte[] zze;
    public static final int zza = Integer.parseInt("-1");
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();

    static {
        zzr zzrVar = new zzr("SsbContext");
        zzrVar.zzb(true);
        zzrVar.zza("blob");
        zzf = zzrVar.zze();
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 3) zzs zzsVar, @SafeParcelable.Param(id = 4) int i10, @SafeParcelable.Param(id = 5) byte[] bArr) {
        String str2;
        int i11 = zza;
        boolean z10 = true;
        if (i10 != i11 && zzq.zza(i10) == null) {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("Invalid section type ");
        sb2.append(i10);
        Preconditions.checkArgument(z10, sb2.toString());
        this.zzb = str;
        this.zzc = zzsVar;
        this.zzd = i10;
        this.zze = bArr;
        if (i10 == i11 || zzq.zza(i10) != null) {
            str2 = (str == null || bArr == null) ? null : "Both content and blobContent set";
        } else {
            str2 = d.h(32, "Invalid section type ", i10);
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static zzk zza(byte[] bArr) {
        return new zzk(null, zzf, zza, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i10, false);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.writeByteArray(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzk(byte[] bArr, zzs zzsVar) {
        this(null, zzsVar, zza, bArr);
    }
}
