package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzad extends zzc implements zzaa {
    public zzad() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzc
    public final boolean zzc(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc((Status) zzf.zzc(parcel, Status.CREATOR), (BeginSignInResult) zzf.zzc(parcel, BeginSignInResult.CREATOR));
            return true;
        }
        return false;
    }
}
