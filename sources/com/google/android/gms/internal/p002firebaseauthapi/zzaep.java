package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaeo;
import com.google.android.gms.internal.p002firebaseauthapi.zzaep;
import java.io.IOException;
import java.io.OutputStream;
import nn.d;

/* loaded from: classes2.dex */
public abstract class zzaep<MessageType extends zzaep<MessageType, BuilderType>, BuilderType extends zzaeo<MessageType, BuilderType>> implements zzahp {
    protected int zza = 0;

    public int zzn(zzaib zzaibVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahp
    public final zzaff zzo() {
        try {
            int zzs = zzs();
            zzaff zzaffVar = zzaff.zzb;
            byte[] bArr = new byte[zzs];
            zzafs zzC = zzafs.zzC(bArr, 0, zzs);
            zzJ(zzC);
            zzC.zzD();
            return new zzafc(bArr);
        } catch (IOException e10) {
            throw new RuntimeException(d.k("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public final void zzp(OutputStream outputStream) throws IOException {
        int zzs = zzs();
        int i10 = zzafs.zzf;
        if (zzs > 4096) {
            zzs = 4096;
        }
        zzafq zzafqVar = new zzafq(outputStream, zzs);
        zzJ(zzafqVar);
        zzafqVar.zzI();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahp
    public final byte[] zzq() {
        try {
            int zzs = zzs();
            byte[] bArr = new byte[zzs];
            zzafs zzC = zzafs.zzC(bArr, 0, zzs);
            zzJ(zzC);
            zzC.zzD();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(d.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
