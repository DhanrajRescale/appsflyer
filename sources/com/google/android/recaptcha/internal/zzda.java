package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import qu.p;
import vt.p0;
import yu.a;
import yu.e;

/* loaded from: classes2.dex */
public final class zzda {

    @NotNull
    public static final zzct zza = new zzct(null);
    public p zzb;

    @NotNull
    private final WebView zzc;

    @NotNull
    private final String zzd;

    @NotNull
    private final Context zze;

    @NotNull
    private final zzr zzf;

    @NotNull
    private final String zzg;

    @NotNull
    private final String zzh;

    @NotNull
    private final zzaj zzi;

    @NotNull
    private final Map zzj;

    @NotNull
    private final Map zzk;

    @NotNull
    private final Map zzl;

    @NotNull
    private final zzas zzm;

    @NotNull
    private final zzdk zzn;

    @NotNull
    private final a zzo;

    @NotNull
    private final zzcu zzp;

    public zzda(@NotNull WebView webView, @NotNull String str, @NotNull Context context, @NotNull zzr zzrVar, @NotNull String str2, @NotNull String str3, @NotNull zzaj zzajVar, @NotNull f0 f0Var) {
        this.zzc = webView;
        this.zzd = str;
        this.zze = context;
        this.zzf = zzrVar;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzajVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzk = linkedHashMap;
        this.zzl = linkedHashMap;
        this.zzm = new zzba(new zzbc(webView, f0Var), zzp.zzc(), context);
        this.zzn = zzdk.zzc();
        this.zzo = e.a();
        zzcu zzcuVar = new zzcu(this);
        this.zzp = zzcuVar;
        this.zzj = zzq();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzcuVar, "RN");
        webView.setWebViewClient(new zzcs(this));
    }

    private final zzh zzo(Exception exc) {
        if (exc instanceof TimeoutCancellationException) {
            return new zzh(zzf.zzc, zzd.zzj);
        }
        if (exc instanceof zzh) {
            return (zzh) exc;
        }
        return new zzh(zzf.zzc, zzd.zzu);
    }

    private final void zzp(List list, zzh zzhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzkw zzkwVar = (zzkw) it.next();
            zzai zzaiVar = zzai.zza;
            String str = this.zzg;
            String str2 = this.zzh;
            zzai.zzd(new zzaf(zzkwVar, str, str2, str2, null), String.valueOf(zzhVar.zzb().zza()), zzhVar.zza().zza(), this.zze, this.zzf, null);
        }
    }

    private static final Map zzq() {
        LinkedHashMap h10 = p0.h(new Pair(-4, zzd.zzA), new Pair(-12, zzd.zzB), new Pair(-6, zzd.zzw), new Pair(-11, zzd.zzy), new Pair(-13, zzd.zzC), new Pair(-14, zzd.zzD), new Pair(-2, zzd.zzx), new Pair(-7, zzd.zzE), new Pair(-5, zzd.zzF), new Pair(-9, zzd.zzG), new Pair(-8, zzd.zzQ), new Pair(-15, zzd.zzz), new Pair(-1, zzd.zzH), new Pair(-3, zzd.zzJ), new Pair(-10, zzd.zzK));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            h10.put(-16, zzd.zzI);
        }
        if (i10 >= 27) {
            h10.put(1, zzd.zzM);
            h10.put(2, zzd.zzN);
            h10.put(0, zzd.zzO);
            h10.put(3, zzd.zzP);
        }
        if (i10 >= 29) {
            h10.put(4, zzd.zzL);
        }
        return h10;
    }

    @NotNull
    public final WebView zzb() {
        return this.zzc;
    }

    @NotNull
    public final zzas zzd() {
        return this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r12, @org.jetbrains.annotations.NotNull yt.a r13) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzf(com.google.android.recaptcha.RecaptchaAction, yt.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r11v4, types: [qu.p, qu.x1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zzg(@org.jetbrains.annotations.NotNull yt.a r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.zza
            zt.a r1 = zt.a.f42823a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            com.google.android.recaptcha.internal.zzda r0 = r0.zzd
            ut.n.b(r11)     // Catch: java.lang.Exception -> L29
            goto L7a
        L29:
            r11 = move-exception
            goto L82
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L33:
            ut.n.b(r11)
            com.google.android.recaptcha.internal.zzai r11 = com.google.android.recaptcha.internal.zzai.zza
            com.google.android.recaptcha.internal.zzaf r11 = new com.google.android.recaptcha.internal.zzaf
            com.google.android.recaptcha.internal.zzkw r5 = com.google.android.recaptcha.internal.zzkw.INIT_NATIVE
            java.lang.String r6 = r10.zzg
            java.lang.String r8 = r10.zzh
            r9 = 0
            r4 = r11
            r7 = r8
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.String r2 = r10.zzd
            com.google.android.recaptcha.internal.zzs r4 = new com.google.android.recaptcha.internal.zzs
            r4.<init>()
            com.google.android.recaptcha.internal.zzai.zzb(r11, r2, r4)
            qu.q r11 = new qu.q
            r11.<init>(r3)
            r2 = 0
            r11.V(r2)
            r10.zzb = r11
            qu.p r11 = r10.zzm()
            int r11 = r11.hashCode()
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r11)
            com.google.android.recaptcha.internal.zzcz r11 = new com.google.android.recaptcha.internal.zzcz     // Catch: java.lang.Exception -> L80
            r11.<init>(r10, r2)     // Catch: java.lang.Exception -> L80
            r0.zzd = r10     // Catch: java.lang.Exception -> L80
            r0.zzc = r3     // Catch: java.lang.Exception -> L80
            r2 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r11 = pp.b.E(r2, r11, r0)     // Catch: java.lang.Exception -> L80
            if (r11 == r1) goto L7f
            r0 = r10
        L7a:
            ut.l r11 = (ut.l) r11     // Catch: java.lang.Exception -> L29
            java.lang.Object r11 = r11.f37395a     // Catch: java.lang.Exception -> L29
            goto Lcd
        L7f:
            return r1
        L80:
            r11 = move-exception
            r0 = r10
        L82:
            r11.getMessage()
            boolean r1 = r11 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r1 == 0) goto L96
            com.google.android.recaptcha.internal.zzkw r2 = com.google.android.recaptcha.internal.zzkw.INIT_TOTAL
            com.google.android.recaptcha.internal.zzkw r3 = com.google.android.recaptcha.internal.zzkw.INIT_NETWORK
            com.google.android.recaptcha.internal.zzkw[] r2 = new com.google.android.recaptcha.internal.zzkw[]{r2, r3}
            java.util.List r2 = vt.y.g(r2)
            goto L9c
        L96:
            com.google.android.recaptcha.internal.zzkw r2 = com.google.android.recaptcha.internal.zzkw.INIT_TOTAL
            java.util.List r2 = vt.x.a(r2)
        L9c:
            com.google.android.recaptcha.internal.zzcu r3 = r0.zzp
            java.lang.Long r3 = r3.zza()
            if (r1 != 0) goto La5
            goto Lbc
        La5:
            if (r3 != 0) goto La8
            goto Lb2
        La8:
            long r3 = r3.longValue()
            r5 = 8000(0x1f40, double:3.9525E-320)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lbc
        Lb2:
            com.google.android.recaptcha.internal.zzh r11 = new com.google.android.recaptcha.internal.zzh
            com.google.android.recaptcha.internal.zzf r1 = com.google.android.recaptcha.internal.zzf.zze
            com.google.android.recaptcha.internal.zzd r3 = com.google.android.recaptcha.internal.zzd.zzT
            r11.<init>(r1, r3)
            goto Lc0
        Lbc:
            com.google.android.recaptcha.internal.zzh r11 = r0.zzo(r11)
        Lc0:
            r0.zzp(r2, r11)
            ut.l$a r0 = ut.l.INSTANCE
            com.google.android.recaptcha.RecaptchaException r11 = r11.zzc()
            ut.m r11 = ut.n.a(r11)
        Lcd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzg(yt.a):java.lang.Object");
    }

    @NotNull
    public final p zzm() {
        p pVar = this.zzb;
        if (pVar != null) {
            return pVar;
        }
        return null;
    }
}
