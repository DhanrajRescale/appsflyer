package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzh implements Parcelable.Creator<zzg> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzg createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzk[] zzkVarArr = null;
        Account account = null;
        boolean z10 = false;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                if (fieldId != 2) {
                    if (fieldId != 3) {
                        if (fieldId != 4) {
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                        } else {
                            account = (Account) SafeParcelReader.createParcelable(parcel, readHeader, Account.CREATOR);
                        }
                    } else {
                        z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                    }
                } else {
                    str = SafeParcelReader.createString(parcel, readHeader);
                }
            } else {
                zzkVarArr = (zzk[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzk.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzg(zzkVarArr, str, z10, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzg[] newArray(int i10) {
        return new zzg[i10];
    }
}
