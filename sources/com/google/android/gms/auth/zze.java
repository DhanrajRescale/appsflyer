package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zze implements zzj<TokenData> {
    private final /* synthetic */ Bundle val$options;
    private final /* synthetic */ Account zzo;
    private final /* synthetic */ String zzp;

    public zze(Account account, String str, Bundle bundle) {
        this.zzo = account;
        this.zzp = str;
        this.val$options = bundle;
    }

    @Override // com.google.android.gms.auth.zzj
    public final /* synthetic */ TokenData zzb(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Object zza;
        Logger logger;
        zza = zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder).zza(this.zzo, this.zzp, this.val$options));
        Bundle bundle = (Bundle) zza;
        TokenData zza2 = TokenData.zza(bundle, "tokenDetails");
        if (zza2 != null) {
            return zza2;
        }
        String string = bundle.getString("Error");
        Intent intent = (Intent) bundle.getParcelable("userRecoveryIntent");
        zzay zzc = zzay.zzc(string);
        if (zzay.zza(zzc)) {
            logger = zzd.zzn;
            String valueOf = String.valueOf(zzc);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 31);
            sb2.append("isUserRecoverableError status: ");
            sb2.append(valueOf);
            logger.w("GoogleAuthUtil", sb2.toString());
            throw new UserRecoverableAuthException(string, intent);
        }
        if (!zzay.NETWORK_ERROR.equals(zzc) && !zzay.SERVICE_UNAVAILABLE.equals(zzc) && !zzay.INTNERNAL_ERROR.equals(zzc)) {
            throw new GoogleAuthException(string);
        }
        throw new IOException(string);
    }
}
