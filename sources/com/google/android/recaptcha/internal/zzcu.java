package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import qu.h;
import qu.q;
import qu.t;
import ut.l;
import ut.n;

/* loaded from: classes2.dex */
public final class zzcu {
    final /* synthetic */ zzda zza;
    private Long zzb;

    @NotNull
    private final zzdk zzc = zzdk.zzb();

    public zzcu(zzda zzdaVar) {
        this.zza = zzdaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzoed(@NotNull String str) {
        Map map;
        zzb();
        zzlz zzg = zzlz.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        zzg.zzk();
        map = this.zza.zzk;
        h hVar = (h) map.remove(zzg.zzj());
        String zzk = zzg.zzk();
        if (zzk != null && zzk.length() != 0) {
            if (hVar != null) {
                String zzk2 = zzg.zzk();
                l.Companion companion = l.INSTANCE;
                hVar.resumeWith(zzk2);
                return;
            }
            return;
        }
        zzg.zzi().name();
        zzg zzgVar = zzh.zza;
        zzh zza = zzg.zza(zzg.zzi());
        zzg.zzj();
        if (hVar != null) {
            l.Companion companion2 = l.INSTANCE;
            hVar.resumeWith(n.a(zza));
        }
    }

    @JavascriptInterface
    public final void zzoid(@NotNull String str) {
        zzb();
        zzmd zzg = zzmd.zzg(zzeb.zzh().zzj(str));
        zzg.zzi().name();
        if (zzg.zzi() == zzmf.JS_CODE_SUCCESS) {
            this.zza.zzm().hashCode();
            if (!((q) this.zza.zzm()).Z(Unit.f23355a)) {
                this.zza.zzm().hashCode();
                return;
            }
            return;
        }
        zzg.zzi().name();
        zzg zzgVar = zzh.zza;
        zzh zza = zzg.zza(zzg.zzi());
        this.zza.zzm().hashCode();
        q qVar = (q) this.zza.zzm();
        qVar.getClass();
        qVar.Z(new t(zza, false));
    }

    @JavascriptInterface
    public final void zzrp(@NotNull String str) {
        zzb();
        this.zza.zzd().zza(str);
    }
}
