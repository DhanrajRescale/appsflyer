package com.google.android.gms.internal.icing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

@ShowFirstParty
@SafeParcelable.Class(creator = "FeatureCreator")
@SafeParcelable.Reserved({CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT})
/* loaded from: classes2.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    final Bundle zzb;

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = i10;
        this.zzb = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        if (this.zza != zzmVar.zza) {
            return false;
        }
        Bundle bundle = this.zzb;
        if (bundle == null) {
            if (zzmVar.zzb == null) {
                return true;
            }
            return false;
        }
        if (zzmVar.zzb == null || bundle.size() != zzmVar.zzb.size()) {
            return false;
        }
        for (String str : this.zzb.keySet()) {
            if (!zzmVar.zzb.containsKey(str) || !Objects.equal(this.zzb.getString(str), zzmVar.zzb.getString(str))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(this.zza));
        Bundle bundle = this.zzb;
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                arrayList.add(str);
                String string = this.zzb.getString(str);
                if (string != null) {
                    arrayList.add(string);
                }
            }
        }
        return Objects.hashCode(arrayList.toArray(new Object[0]));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
