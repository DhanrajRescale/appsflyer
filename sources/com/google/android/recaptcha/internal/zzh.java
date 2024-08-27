package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import vt.p0;

/* loaded from: classes2.dex */
public final class zzh extends Exception {

    @NotNull
    public static final zzg zza = new zzg(null);

    @NotNull
    private static final Map zzb;

    @NotNull
    private final zzf zzc;

    @NotNull
    private final zzd zzd;

    @NotNull
    private final Map zze = p0.g(new Pair(zzf.zze, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), new Pair(zzf.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), new Pair(zzf.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), new Pair(zzf.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), new Pair(zzf.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), new Pair(zzf.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)));

    static {
        Pair pair = new Pair(zzmf.JS_NETWORK_ERROR, new zzh(zzf.zze, zzd.zzm));
        zzmf zzmfVar = zzmf.JS_INTERNAL_ERROR;
        zzf zzfVar = zzf.zzc;
        zzb = p0.g(pair, new Pair(zzmfVar, new zzh(zzfVar, zzd.zzk)), new Pair(zzmf.JS_INVALID_SITE_KEY, new zzh(zzf.zzf, zzd.zzn)), new Pair(zzmf.JS_INVALID_SITE_KEY_TYPE, new zzh(zzf.zzg, zzd.zzo)), new Pair(zzmf.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzh(zzf.zzh, zzd.zzp)), new Pair(zzmf.JS_INVALID_ACTION, new zzh(zzf.zzi, zzd.zzq)), new Pair(zzmf.JS_PROGRAM_ERROR, new zzh(zzfVar, zzd.zzv)));
    }

    public zzh(@NotNull zzf zzfVar, @NotNull zzd zzdVar) {
        this.zzc = zzfVar;
        this.zzd = zzdVar;
    }

    @NotNull
    public final zzd zza() {
        return this.zzd;
    }

    @NotNull
    public final zzf zzb() {
        return this.zzc;
    }

    @NotNull
    public final RecaptchaException zzc() {
        RecaptchaException recaptchaException = (RecaptchaException) this.zze.get(this.zzc);
        if (recaptchaException == null) {
            return new RecaptchaException(RecaptchaErrorCode.UNKNOWN_ERROR, null, 2, null);
        }
        return recaptchaException;
    }
}
