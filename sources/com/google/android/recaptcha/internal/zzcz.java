package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import au.i;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import qu.p;
import qu.q;
import ut.l;
import ut.n;
import v.e;
import yk.g;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcz extends i implements Function2 {
    int zza;
    final /* synthetic */ zzda zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzda zzdaVar, a aVar) {
        super(2, aVar);
        this.zzb = zzdaVar;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzcz(this.zzb, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Context context;
        String str;
        Context context2;
        String str2;
        String str3;
        String str4;
        String str5;
        Context context3;
        zzr zzrVar;
        String str6;
        String str7;
        String str8;
        String str9;
        zzdk zzdkVar;
        zzdk zzdkVar2;
        zzr zzrVar2;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.zza;
        n.b(obj);
        if (i10 == 0) {
            zzu zzuVar = zzu.zza;
            context = this.zzb.zze;
            String zza = zzu.zza(context);
            str = this.zzb.zzd;
            context2 = this.zzb.zze;
            String packageName = context2.getPackageName();
            str2 = this.zzb.zzh;
            int i11 = Build.VERSION.SDK_INT;
            String encode = URLEncoder.encode(str, "UTF-8");
            String encode2 = URLEncoder.encode(packageName, "UTF-8");
            String encode3 = URLEncoder.encode(zza, "UTF-8");
            String encode4 = URLEncoder.encode("18.1.2", "UTF-8");
            String encode5 = URLEncoder.encode(str2, "UTF-8");
            StringBuilder l10 = e.l("k=", encode, "&pk=", encode2, "&mst=");
            e.v(l10, encode3, "&msv=", encode4, "&msi=");
            l10.append(encode5);
            l10.append("&mov=");
            l10.append(i11);
            byte[] bytes = l10.toString().getBytes(Charset.forName("UTF-8"));
            zzai zzaiVar = zzai.zza;
            zzkw zzkwVar = zzkw.INIT_NATIVE;
            str3 = this.zzb.zzg;
            str4 = this.zzb.zzh;
            str5 = this.zzb.zzh;
            zzaf zzafVar = new zzaf(zzkwVar, str3, str4, str5, null);
            context3 = this.zzb.zze;
            zzrVar = this.zzb.zzf;
            zzai.zzc(zzafVar, context3, zzrVar);
            zzkw zzkwVar2 = zzkw.INIT_NETWORK;
            str6 = this.zzb.zzg;
            str7 = this.zzb.zzh;
            str8 = this.zzb.zzh;
            zzaf zzafVar2 = new zzaf(zzkwVar2, str6, str7, str8, null);
            str9 = this.zzb.zzd;
            zzai.zzb(zzafVar2, str9, new zzs());
            g.H(zzp.zza(), null, null, new zzcy(this.zzb, zza, null), 3);
            zzdkVar = this.zzb.zzn;
            zzdkVar.zzd();
            zzdkVar2 = this.zzb.zzn;
            zzdkVar2.zze();
            zzda zzdaVar = this.zzb;
            WebView zzb = zzdaVar.zzb();
            zzrVar2 = zzdaVar.zzf;
            zzb.postUrl(zzrVar2.zza(), bytes);
            new Integer(this.zzb.zzm().hashCode());
            p zzm = this.zzb.zzm();
            this.zza = 1;
            if (((q) zzm).u(this) == aVar) {
                return aVar;
            }
        }
        return new l(Unit.f23355a);
    }
}
