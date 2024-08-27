package com.google.android.gms.internal.icing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class zzt implements Parcelable.Creator<zzs> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzm[] zzmVarArr = null;
        String str4 = null;
        zzu zzuVar = null;
        boolean z10 = false;
        boolean z11 = false;
        int i10 = 1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 11) {
                if (fieldId != 12) {
                    switch (fieldId) {
                        case 1:
                            str = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case 2:
                            str2 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case 3:
                            z10 = SafeParcelReader.readBoolean(parcel, readHeader);
                            break;
                        case 4:
                            i10 = SafeParcelReader.readInt(parcel, readHeader);
                            break;
                        case 5:
                            z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                            break;
                        case 6:
                            str3 = SafeParcelReader.createString(parcel, readHeader);
                            break;
                        case 7:
                            zzmVarArr = (zzm[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzm.CREATOR);
                            break;
                        default:
                            SafeParcelReader.skipUnknownField(parcel, readHeader);
                            break;
                    }
                } else {
                    zzuVar = (zzu) SafeParcelReader.createParcelable(parcel, readHeader, zzu.CREATOR);
                }
            } else {
                str4 = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzs(str, str2, z10, i10, z11, str3, zzmVarArr, str4, zzuVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzs[] newArray(int i10) {
        return new zzs[i10];
    }
}
