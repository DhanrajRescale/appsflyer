package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes2.dex */
public final class zzjp {
    private Context zza = null;
    private String zzb = null;
    private String zzc = null;
    private String zzd = null;
    private zzbd zze = null;
    private zzbu zzf = null;
    private zzbz zzg;

    private final zzbd zzj() throws GeneralSecurityException {
        if (!zzjr.zzd()) {
            Log.w(zzjr.zzc(), "Android Keystore requires at least Android M");
            return null;
        }
        zzjt zzjtVar = new zzjt();
        try {
            boolean zzc = zzjt.zzc(this.zzd);
            try {
                return zzjtVar.zza(this.zzd);
            } catch (GeneralSecurityException | ProviderException e10) {
                if (zzc) {
                    Log.w(zzjr.zzc(), "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.zzd), e10);
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            Log.w(zzjr.zzc(), "cannot use Android Keystore, it'll be disabled", e11);
            return null;
        }
    }

    private final zzbz zzk(byte[] bArr) throws GeneralSecurityException, IOException {
        try {
            this.zze = new zzjt().zza(this.zzd);
            try {
                return zzbz.zzf(zzby.zzh(zzbe.zzc(bArr), this.zze));
            } catch (IOException | GeneralSecurityException e10) {
                try {
                    return zzl(bArr);
                } catch (IOException unused) {
                    throw e10;
                }
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            try {
                zzbz zzl = zzl(bArr);
                Log.w(zzjr.zzc(), "cannot use Android Keystore, it'll be disabled", e11);
                return zzl;
            } catch (IOException unused2) {
                throw e11;
            }
        }
    }

    private static final zzbz zzl(byte[] bArr) throws GeneralSecurityException, IOException {
        return zzbz.zzf(zzbg.zzb(zzbe.zzc(bArr)));
    }

    public final zzjp zzd(zzsu zzsuVar) {
        String zzf = zzsuVar.zzf();
        byte[] zzq = zzsuVar.zze().zzq();
        zztv zzd = zzsuVar.zzd();
        int i10 = zzjr.zza;
        zztv zztvVar = zztv.UNKNOWN_PREFIX;
        int ordinal = zzd.ordinal();
        int i11 = 1;
        if (ordinal != 1) {
            i11 = 2;
            if (ordinal != 2) {
                i11 = 3;
                if (ordinal != 3) {
                    i11 = 4;
                    if (ordinal != 4) {
                        throw new IllegalArgumentException("Unknown output prefix type");
                    }
                }
            }
        }
        this.zzf = zzbu.zze(zzf, zzq, i11);
        return this;
    }

    public final zzjp zze(String str) {
        if (str.startsWith("android-keystore://")) {
            this.zzd = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public final zzjp zzf(Context context, String str, String str2) throws IOException {
        if (context != null) {
            this.zza = context;
            this.zzb = "GenericIdpKeyset";
            this.zzc = str2;
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final synchronized zzjr zzg() throws GeneralSecurityException, IOException {
        SharedPreferences sharedPreferences;
        byte[] bArr;
        zzjr zzjrVar;
        try {
            if (this.zzb != null) {
                synchronized (zzjr.zzb()) {
                    try {
                        Context context = this.zza;
                        String str = this.zzb;
                        String str2 = this.zzc;
                        if (str != null) {
                            Context applicationContext = context.getApplicationContext();
                            if (str2 == null) {
                                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                            } else {
                                sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                            }
                            zzjq zzjqVar = null;
                            try {
                                String string = sharedPreferences.getString(str, null);
                                if (string == null) {
                                    bArr = null;
                                } else if (string.length() % 2 == 0) {
                                    int length = string.length() / 2;
                                    bArr = new byte[length];
                                    for (int i10 = 0; i10 < length; i10++) {
                                        int i11 = i10 + i10;
                                        int digit = Character.digit(string.charAt(i11), 16);
                                        int digit2 = Character.digit(string.charAt(i11 + 1), 16);
                                        if (digit != -1 && digit2 != -1) {
                                            bArr[i10] = (byte) ((digit * 16) + digit2);
                                        } else {
                                            throw new IllegalArgumentException("input is not hexadecimal");
                                        }
                                    }
                                } else {
                                    throw new IllegalArgumentException("Expected a string of even length");
                                }
                                if (bArr == null) {
                                    if (this.zzd != null) {
                                        this.zze = zzj();
                                    }
                                    if (this.zzf != null) {
                                        zzbz zze = zzbz.zze();
                                        zze.zzc(this.zzf);
                                        zze.zzd(zze.zzb().zzd().zzb(0).zza());
                                        zzju zzjuVar = new zzju(this.zza, this.zzb, this.zzc);
                                        if (this.zze != null) {
                                            zze.zzb().zzf(zzjuVar, this.zze);
                                        } else {
                                            zzbg.zza(zze.zzb(), zzjuVar);
                                        }
                                        this.zzg = zze;
                                    } else {
                                        throw new GeneralSecurityException("cannot read or generate keyset");
                                    }
                                } else {
                                    if (this.zzd != null && zzjr.zzd()) {
                                        this.zzg = zzk(bArr);
                                    }
                                    this.zzg = zzl(bArr);
                                }
                                zzjrVar = new zzjr(this, zzjqVar);
                            } catch (ClassCastException | IllegalArgumentException unused) {
                                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
                            }
                        } else {
                            throw new IllegalArgumentException("keysetName cannot be null");
                        }
                    } finally {
                    }
                }
            } else {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzjrVar;
    }
}
