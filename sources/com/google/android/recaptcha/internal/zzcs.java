package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import qu.q;
import qu.t;
import ut.a;

/* loaded from: classes2.dex */
public final class zzcs extends WebViewClient {
    final /* synthetic */ zzda zza;

    public zzcs(zzda zzdaVar) {
        this.zza = zzdaVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(@NotNull WebView webView, @NotNull String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@NotNull WebView webView, @NotNull String str) {
        String str2;
        String str3;
        String str4;
        Context context;
        zzr zzrVar;
        zzdk zzdkVar;
        zzai zzaiVar = zzai.zza;
        zzkw zzkwVar = zzkw.INIT_NETWORK;
        str2 = this.zza.zzg;
        str3 = this.zza.zzh;
        str4 = this.zza.zzh;
        zzaf zzafVar = new zzaf(zzkwVar, str2, str3, str4, null);
        context = this.zza.zze;
        zzrVar = this.zza.zzf;
        zzai.zzc(zzafVar, context, zzrVar);
        zzdkVar = this.zza.zzn;
        long zza = zzdkVar.zza(TimeUnit.MICROSECONDS);
        zzj zzjVar = zzj.zza;
        zzj.zza(zzl.zzl.zza(), zza);
    }

    @Override // android.webkit.WebViewClient
    @a
    public final void onReceivedError(@NotNull WebView webView, int i10, @NotNull String str, @NotNull String str2) {
        Map map;
        super.onReceivedError(webView, i10, str, str2);
        zzf zzfVar = zzf.zze;
        map = this.zza.zzj;
        zzd zzdVar = (zzd) map.get(Integer.valueOf(i10));
        if (zzdVar == null) {
            zzdVar = zzd.zzb;
        }
        zzh zzhVar = new zzh(zzfVar, zzdVar);
        this.zza.zzm().hashCode();
        zzhVar.getMessage();
        q qVar = (q) this.zza.zzm();
        qVar.getClass();
        qVar.Z(new t(zzhVar, false));
    }

    @Override // android.webkit.WebViewClient
    @a
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull String str) {
        zzdb zzdbVar = zzdb.zza;
        if (!zzdb.zza(Uri.parse(str))) {
            Uri parse = Uri.parse(str);
            zzh zzhVar = new zzh(zzf.zzc, zzd.zzu);
            this.zza.zzm().hashCode();
            parse.toString();
            q qVar = (q) this.zza.zzm();
            qVar.getClass();
            qVar.Z(new t(zzhVar, false));
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
