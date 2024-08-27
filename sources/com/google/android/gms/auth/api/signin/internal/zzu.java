package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class zzu extends com.google.android.gms.internal.p000authapi.zzc implements zzr {
    public zzu() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzc
    public final boolean zzc(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 101:
                zzc((GoogleSignInAccount) com.google.android.gms.internal.p000authapi.zzf.zzc(parcel, GoogleSignInAccount.CREATOR), (Status) com.google.android.gms.internal.p000authapi.zzf.zzc(parcel, Status.CREATOR));
                break;
            case 102:
                zze((Status) com.google.android.gms.internal.p000authapi.zzf.zzc(parcel, Status.CREATOR));
                break;
            case 103:
                zzf((Status) com.google.android.gms.internal.p000authapi.zzf.zzc(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
