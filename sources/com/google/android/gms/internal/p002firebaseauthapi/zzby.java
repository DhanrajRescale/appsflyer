package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import nn.d;

/* loaded from: classes2.dex */
public final class zzby {
    private final zztc zza;
    private final List zzb;
    private final zznz zzc = zznz.zza;

    private zzby(zztc zztcVar, List list) {
        this.zza = zztcVar;
        this.zzb = list;
    }

    public static final zzby zza(zztc zztcVar) throws GeneralSecurityException {
        zzl(zztcVar);
        return new zzby(zztcVar, zzk(zztcVar));
    }

    public static final zzby zzh(zzbe zzbeVar, zzbd zzbdVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzrl zza = zzbeVar.zza();
        if (zza != null && zza.zzd().zzd() != 0) {
            try {
                zztc zzg = zztc.zzg(zzbdVar.zza(zza.zzd().zzq(), bArr), zzafx.zza());
                zzl(zzg);
                return zza(zzg);
            } catch (zzags unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        }
        throw new GeneralSecurityException("empty keyset");
    }

    private static zzln zzi(zztb zztbVar) {
        Integer valueOf;
        int zza = zztbVar.zza();
        if (zztbVar.zze() == zztv.RAW) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(zza);
        }
        try {
            return zzln.zza(zztbVar.zzb().zzf(), zztbVar.zzb().zze(), zztbVar.zzb().zzb(), zztbVar.zze(), valueOf);
        } catch (GeneralSecurityException e10) {
            throw new zzlx("Creating a protokey serialization failed", e10);
        }
    }

    private static Object zzj(zztb zztbVar, Class cls) throws GeneralSecurityException {
        try {
            zzsp zzb = zztbVar.zzb();
            int i10 = zzcq.zza;
            return zzcq.zze(zzb.zzf(), zzb.zze(), cls);
        } catch (GeneralSecurityException e10) {
            if (!e10.getMessage().contains("No key manager found for key type ") && !e10.getMessage().contains(" not supported by key manager of type ")) {
                throw e10;
            }
            return null;
        }
    }

    private static List zzk(zztc zztcVar) {
        zzbt zzbtVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zztcVar.zza());
        for (zztb zztbVar : zztcVar.zzh()) {
            int zza = zztbVar.zza();
            try {
                zzbl zza2 = zzkt.zzb().zza(zzi(zztbVar), zzcr.zza());
                int zzk = zztbVar.zzk() - 2;
                if (zzk != 1) {
                    if (zzk != 2) {
                        if (zzk == 3) {
                            zzbtVar = zzbt.zzc;
                        } else {
                            throw new GeneralSecurityException("Unknown key status");
                            break;
                        }
                    } else {
                        zzbtVar = zzbt.zzb;
                    }
                } else {
                    zzbtVar = zzbt.zza;
                }
                zzbt zzbtVar2 = zzbtVar;
                if (zza == zztcVar.zzb()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                arrayList.add(new zzbx(zza2, zzbtVar2, zza, z10, null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void zzl(zztc zztcVar) throws GeneralSecurityException {
        if (zztcVar != null && zztcVar.zza() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static final Object zzm(zzbl zzblVar, Class cls) throws GeneralSecurityException {
        try {
            int i10 = zzcq.zza;
            return zzks.zza().zzc(zzblVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public final String toString() {
        return zzcs.zza(this.zza).toString();
    }

    public final zzby zzb() throws GeneralSecurityException {
        if (this.zza != null) {
            zzsz zzc = zztc.zzc();
            for (zztb zztbVar : this.zza.zzh()) {
                zzsp zzb = zztbVar.zzb();
                if (zzb.zzb() == zzso.ASYMMETRIC_PRIVATE) {
                    String zzf = zzb.zzf();
                    zzaff zze = zzb.zze();
                    zzbm zza = zzcq.zza(zzf);
                    if (zza instanceof zzcn) {
                        zzsp zzf2 = ((zzcn) zza).zzf(zze);
                        String zzf3 = zzf2.zzf();
                        zzcq.zza(zzf3).zzc(zzf2.zze());
                        zzta zztaVar = (zzta) zztbVar.zzu();
                        zztaVar.zza(zzf2);
                        zzc.zzb((zztb) zztaVar.zzi());
                    } else {
                        throw new GeneralSecurityException(d.k("manager for key type ", zzf, " is not a PrivateKeyManager"));
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            zzc.zzc(this.zza.zzb());
            return zza((zztc) zzc.zzi());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    public final zztc zzc() {
        return this.zza;
    }

    public final zzth zzd() {
        return zzcs.zza(this.zza);
    }

    public final Object zze(Class cls) throws GeneralSecurityException {
        Object obj;
        boolean z10;
        Class zzd = zzcq.zzd(cls);
        if (zzd != null) {
            zztc zztcVar = this.zza;
            Charset charset = zzcs.zza;
            int zzb = zztcVar.zzb();
            int i10 = 0;
            boolean z11 = false;
            boolean z12 = true;
            for (zztb zztbVar : zztcVar.zzh()) {
                if (zztbVar.zzk() == 3) {
                    if (zztbVar.zzi()) {
                        if (zztbVar.zze() != zztv.UNKNOWN_PREFIX) {
                            if (zztbVar.zzk() != 2) {
                                if (zztbVar.zza() == zzb) {
                                    if (!z11) {
                                        z11 = true;
                                    } else {
                                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                                    }
                                }
                                if (zztbVar.zzb().zzb() != zzso.ASYMMETRIC_PUBLIC) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                z12 &= z10;
                                i10++;
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zztbVar.zza())));
                            }
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zztbVar.zza())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zztbVar.zza())));
                    }
                }
            }
            if (i10 != 0) {
                if (!z11 && !z12) {
                    throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                }
                zzcg zzcgVar = new zzcg(zzd, null);
                zzcgVar.zzc(this.zzc);
                for (int i11 = 0; i11 < this.zza.zza(); i11++) {
                    zztb zzd2 = this.zza.zzd(i11);
                    if (zzd2.zzk() == 3) {
                        Object zzj = zzj(zzd2, zzd);
                        if (this.zzb.get(i11) != null) {
                            obj = zzm(((zzbx) this.zzb.get(i11)).zza(), zzd);
                        } else {
                            obj = null;
                        }
                        if (obj == null && zzj == null) {
                            throw new GeneralSecurityException("Unable to get primitive " + zzd.toString() + " for key of type " + zzd2.zzb().zzf());
                        }
                        if (zzd2.zza() == this.zza.zzb()) {
                            zzcgVar.zzb(obj, zzj, zzd2);
                        } else {
                            zzcgVar.zza(obj, zzj, zzd2);
                        }
                    }
                }
                return zzks.zza().zzd(zzcgVar.zzd(), cls);
            }
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final void zzf(zzca zzcaVar, zzbd zzbdVar) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zztc zztcVar = this.zza;
        byte[] zzb = zzbdVar.zzb(zztcVar.zzq(), bArr);
        try {
            if (zztc.zzg(zzbdVar.zza(zzb, bArr), zzafx.zza()).equals(zztcVar)) {
                int length = zzb.length;
                zzrk zza = zzrl.zza();
                zza.zza(zzaff.zzn(zzb, 0, length));
                zza.zzb(zzcs.zza(zztcVar));
                zzcaVar.zzb((zzrl) zza.zzi());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzags unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public final void zzg(zzca zzcaVar) throws GeneralSecurityException, IOException {
        for (zztb zztbVar : this.zza.zzh()) {
            if (zztbVar.zzb().zzb() == zzso.UNKNOWN_KEYMATERIAL || zztbVar.zzb().zzb() == zzso.SYMMETRIC || zztbVar.zzb().zzb() == zzso.ASYMMETRIC_PRIVATE) {
                throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zztbVar.zzb().zzb().name(), zztbVar.zzb().zzf()));
            }
        }
        zzcaVar.zzc(this.zza);
    }
}
