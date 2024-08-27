package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import da.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import nn.d;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class zzep {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzeo zzd;

    public zzep(zzeo zzeoVar) {
        this.zzd = zzeoVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z10;
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        if (strArr.length == strArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder p10 = e.p("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = zzb((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (p10.length() != 1) {
                    p10.append(", ");
                }
                p10.append(valueOf);
            }
        }
        p10.append("]");
        return p10.toString();
    }

    public final String zzb(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder p10 = e.p("Bundle[{");
        for (String str : bundle.keySet()) {
            if (p10.length() != 8) {
                p10.append(", ");
            }
            p10.append(zze(str));
            p10.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = zza(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = zza((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = zza(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            p10.append(valueOf);
        }
        p10.append("}]");
        return p10.toString();
    }

    public final String zzc(zzaw zzawVar) {
        String zzb2;
        if (!this.zzd.zza()) {
            return zzawVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzawVar.zzc);
        sb2.append(",name=");
        sb2.append(zzd(zzawVar.zza));
        sb2.append(",params=");
        zzau zzauVar = zzawVar.zzb;
        if (zzauVar == null) {
            zzb2 = null;
        } else if (!this.zzd.zza()) {
            zzb2 = zzauVar.toString();
        } else {
            zzb2 = zzb(zzauVar.zzc());
        }
        sb2.append(zzb2);
        return sb2.toString();
    }

    public final String zzd(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzhb.zzc, zzhb.zza, zza);
    }

    public final String zze(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        return zzg(str, zzhc.zzb, zzhc.zza, zzb);
    }

    public final String zzf(String str) {
        if (str == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return d.k("experiment_id(", str, ")");
        }
        return zzg(str, zzhd.zzb, zzhd.zza, zzc);
    }
}
