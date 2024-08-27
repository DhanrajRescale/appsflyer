package com.google.android.gms.internal.p002firebaseauthapi;

/* loaded from: classes2.dex */
public final class zzcv {
    public static final zzsu zza = zzb(16);
    public static final zzsu zzb = zzb(32);
    public static final zzsu zzc = zza(16, 16);
    public static final zzsu zzd = zza(32, 16);
    public static final zzsu zze = zzc(16, 16, 32, 16, 5);
    public static final zzsu zzf = zzc(32, 16, 32, 32, 5);
    public static final zzsu zzg;
    public static final zzsu zzh;

    static {
        zzst zza2 = zzsu.zza();
        new zzfx();
        zza2.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zztv zztvVar = zztv.TINK;
        zza2.zza(zztvVar);
        zzg = (zzsu) zza2.zzi();
        zzst zza3 = zzsu.zza();
        new zzgp();
        zza3.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza3.zza(zztvVar);
        zzh = (zzsu) zza3.zzi();
    }

    public static zzsu zza(int i10, int i11) {
        zzpk zzb2 = zzpl.zzb();
        zzb2.zza(i10);
        zzpn zzb3 = zzpo.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzpo) zzb3.zzi());
        zzpl zzplVar = (zzpl) zzb2.zzi();
        zzst zza2 = zzsu.zza();
        zza2.zzc(zzplVar.zzo());
        new zzeb();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza2.zza(zztv.TINK);
        return (zzsu) zza2.zzi();
    }

    public static zzsu zzb(int i10) {
        zzpt zzb2 = zzpu.zzb();
        zzb2.zza(i10);
        zzpu zzpuVar = (zzpu) zzb2.zzi();
        zzst zza2 = zzsu.zza();
        zza2.zzc(zzpuVar.zzo());
        new zzes();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza2.zza(zztv.TINK);
        return (zzsu) zza2.zzi();
    }

    public static zzsu zzc(int i10, int i11, int i12, int i13, int i14) {
        zzpb zzb2 = zzpc.zzb();
        zzpe zzb3 = zzpf.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzpf) zzb3.zzi());
        zzb2.zza(i10);
        zzpc zzpcVar = (zzpc) zzb2.zzi();
        zzrs zzb4 = zzrt.zzb();
        zzrv zzb5 = zzrw.zzb();
        zzb5.zzb(5);
        zzb5.zza(i13);
        zzb4.zzb((zzrw) zzb5.zzi());
        zzb4.zza(32);
        zzrt zzrtVar = (zzrt) zzb4.zzi();
        zzov zza2 = zzow.zza();
        zza2.zza(zzpcVar);
        zza2.zzb(zzrtVar);
        zzow zzowVar = (zzow) zza2.zzi();
        zzst zza3 = zzsu.zza();
        zza3.zzc(zzowVar.zzo());
        new zzdg();
        zza3.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza3.zza(zztv.TINK);
        return (zzsu) zza3.zzi();
    }
}
