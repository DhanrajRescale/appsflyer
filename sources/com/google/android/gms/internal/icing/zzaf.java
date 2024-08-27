package com.google.android.gms.internal.icing;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class zzaf {
    public static zzx zza(Action action, long j10, String str, int i10) {
        String str2;
        Uri uri;
        String str3;
        String str4;
        Uri uri2;
        int i11;
        Bundle bundle = new Bundle();
        bundle.putAll(action.zza());
        Bundle bundle2 = bundle.getBundle("object");
        if (bundle2 != null) {
            String string = bundle2.getString("id");
            if (string != null) {
                uri = Uri.parse(string);
            } else {
                uri = null;
            }
            str3 = bundle2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            str4 = bundle2.getString("type");
            str2 = bundle2.getString("url");
        } else {
            str2 = null;
            uri = null;
            str3 = null;
            str4 = null;
        }
        if (str2 != null) {
            uri2 = Uri.parse(str2);
        } else {
            uri2 = null;
        }
        Intent zzb = zzal.zzb(str, uri2);
        zzf zzb2 = zzx.zzb(zzb, str3, uri, str4, null);
        byte[] byteArray = bundle.getByteArray(".private:ssbContext");
        if (byteArray != null) {
            zzb2.zza(zzk.zza(byteArray));
            bundle.remove(".private:ssbContext");
        }
        String string2 = bundle.getString(".private:accountName");
        if (string2 != null) {
            zzb2.zzd(new Account(string2, "com.google"));
            bundle.remove(".private:accountName");
        }
        boolean z10 = false;
        if (bundle.containsKey(".private:isContextOnly") && bundle.getBoolean(".private:isContextOnly")) {
            bundle.remove(".private:isContextOnly");
            i11 = 4;
        } else {
            i11 = 0;
        }
        if (bundle.containsKey(".private:isDeviceOnly")) {
            z10 = bundle.getBoolean(".private:isDeviceOnly", false);
            bundle.remove(".private:isDeviceOnly");
        }
        zzgf zzb3 = zzb(bundle);
        zzr zzrVar = new zzr(".private:action");
        zzrVar.zzb(true);
        zzrVar.zzd(".private:action");
        zzrVar.zza("blob");
        zzb2.zza(new zzk(zzb3.zzh(), zzrVar.zze()));
        zzw zzwVar = new zzw();
        zzwVar.zza(zzx.zza(str, zzb));
        zzwVar.zzb(j10);
        zzwVar.zzc(i11);
        zzwVar.zzd(zzb2.zze());
        zzwVar.zze(z10);
        zzwVar.zzf(i10);
        return zzwVar.zzg();
    }

    public static zzgf zzb(Bundle bundle) {
        zzge zza = zzgf.zza();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                zzgg zza2 = zzgh.zza();
                zza2.zzb((String) obj);
                zzgh zzj = zza2.zzj();
                zzgc zza3 = zzgd.zza();
                zza3.zza(str);
                zza3.zzb(zzj);
                zza.zzb(zza3.zzj());
            } else if (obj instanceof Bundle) {
                zzgg zza4 = zzgh.zza();
                zza4.zzc(zzb((Bundle) obj));
                zzgh zzj2 = zza4.zzj();
                zzgc zza5 = zzgd.zza();
                zza5.zza(str);
                zza5.zzb(zzj2);
                zza.zzb(zza5.zzj());
            } else {
                int i10 = 0;
                if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    int length = strArr.length;
                    while (i10 < length) {
                        String str2 = strArr[i10];
                        if (str2 != null) {
                            zzgg zza6 = zzgh.zza();
                            zza6.zzb(str2);
                            zzgh zzj3 = zza6.zzj();
                            zzgc zza7 = zzgd.zza();
                            zza7.zza(str);
                            zza7.zzb(zzj3);
                            zza.zzb(zza7.zzj());
                        }
                        i10++;
                    }
                } else if (obj instanceof Bundle[]) {
                    Bundle[] bundleArr = (Bundle[]) obj;
                    int length2 = bundleArr.length;
                    while (i10 < length2) {
                        Bundle bundle2 = bundleArr[i10];
                        if (bundle2 != null) {
                            zzgg zza8 = zzgh.zza();
                            zza8.zzc(zzb(bundle2));
                            zzgh zzj4 = zza8.zzj();
                            zzgc zza9 = zzgd.zza();
                            zza9.zza(str);
                            zza9.zzb(zzj4);
                            zza.zzb(zza9.zzj());
                        }
                        i10++;
                    }
                } else if (obj instanceof Boolean) {
                    zzgg zza10 = zzgh.zza();
                    zza10.zza(((Boolean) obj).booleanValue());
                    zzgh zzj5 = zza10.zzj();
                    zzgc zza11 = zzgd.zza();
                    zza11.zza(str);
                    zza11.zzb(zzj5);
                    zza.zzb(zza11.zzj());
                } else {
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 19);
                    sb2.append("Unsupported value: ");
                    sb2.append(valueOf);
                    Log.e("SearchIndex", sb2.toString());
                }
            }
        }
        String string = bundle.getString("type");
        if (string != null) {
            zza.zza(string);
        }
        return zza.zzj();
    }
}
