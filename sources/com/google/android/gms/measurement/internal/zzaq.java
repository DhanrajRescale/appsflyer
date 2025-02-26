package com.google.android.gms.measurement.internal;

import a3.a;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import r3.k;

/* loaded from: classes2.dex */
public final class zzaq extends zzgy {
    private long zza;
    private String zzb;
    private AccountManager zzc;
    private Boolean zzd;
    private long zze;

    public zzaq(zzge zzgeVar) {
        super(zzgeVar);
    }

    public final long zza() {
        zzg();
        return this.zze;
    }

    public final long zzb() {
        zzv();
        return this.zza;
    }

    public final String zzc() {
        zzv();
        return this.zzb;
    }

    public final void zzd() {
        zzg();
        this.zzd = null;
        this.zze = 0L;
    }

    public final boolean zze() {
        Account[] result;
        zzg();
        long currentTimeMillis = this.zzt.zzax().currentTimeMillis();
        if (currentTimeMillis - this.zze > 86400000) {
            this.zzd = null;
        }
        Boolean bool = this.zzd;
        if (bool == null) {
            if (k.checkSelfPermission(this.zzt.zzaw(), "android.permission.GET_ACCOUNTS") != 0) {
                this.zzt.zzaA().zzm().zza("Permission error checking for dasher/unicorn accounts");
                this.zze = currentTimeMillis;
                this.zzd = Boolean.FALSE;
                return false;
            }
            if (this.zzc == null) {
                this.zzc = AccountManager.get(this.zzt.zzaw());
            }
            try {
                result = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException e10) {
                e = e10;
                this.zzt.zzaA().zzh().zzb("Exception checking account types", e);
                this.zze = currentTimeMillis;
                this.zzd = Boolean.FALSE;
                return false;
            } catch (OperationCanceledException e11) {
                e = e11;
                this.zzt.zzaA().zzh().zzb("Exception checking account types", e);
                this.zze = currentTimeMillis;
                this.zzd = Boolean.FALSE;
                return false;
            } catch (IOException e12) {
                e = e12;
                this.zzt.zzaA().zzh().zzb("Exception checking account types", e);
                this.zze = currentTimeMillis;
                this.zzd = Boolean.FALSE;
                return false;
            }
            if (result != null && result.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.zzc.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.zzd = Boolean.TRUE;
                this.zze = currentTimeMillis;
                return true;
            }
            this.zze = currentTimeMillis;
            this.zzd = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzgy
    public final boolean zzf() {
        Calendar calendar = Calendar.getInstance();
        this.zza = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.zzb = a.g(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }
}
