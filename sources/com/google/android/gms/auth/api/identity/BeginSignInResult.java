package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "BeginSignInResultCreator")
/* loaded from: classes2.dex */
public final class BeginSignInResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BeginSignInResult> CREATOR = new zzd();

    @SafeParcelable.Field(getter = "getPendingIntent", id = 1)
    private final PendingIntent zzbc;

    @SafeParcelable.Constructor
    public BeginSignInResult(@SafeParcelable.Param(id = 1) PendingIntent pendingIntent) {
        this.zzbc = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    public final PendingIntent getPendingIntent() {
        return this.zzbc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getPendingIntent(), i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
