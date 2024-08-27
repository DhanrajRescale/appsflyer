package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* loaded from: classes2.dex */
public final class zzal extends zzd implements zzai {
    public zzal(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zzai
    public final void zzc(zzaa zzaaVar, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzaaVar);
        zzf.zzc(zzc, beginSignInRequest);
        zzc(1, zzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzai
    public final void zzc(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, iStatusCallback);
        zzc.writeString(str);
        zzc(2, zzc);
    }

    @Override // com.google.android.gms.internal.p000authapi.zzai
    public final void zzc(zzae zzaeVar, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel zzc = zzc();
        zzf.zzc(zzc, zzaeVar);
        zzf.zzc(zzc, getSignInIntentRequest);
        zzc(3, zzc);
    }
}
