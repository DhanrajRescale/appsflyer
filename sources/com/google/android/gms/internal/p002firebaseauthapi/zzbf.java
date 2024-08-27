package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public final class zzbf implements zzca {
    private final OutputStream zza;

    private zzbf(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzca zza(OutputStream outputStream) {
        return new zzbf(outputStream);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final void zzb(zzrl zzrlVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzca
    public final void zzc(zztc zztcVar) throws IOException {
        try {
            zztcVar.zzp(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
