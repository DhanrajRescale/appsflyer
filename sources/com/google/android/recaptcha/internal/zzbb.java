package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import au.i;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import ut.n;
import vt.g0;
import yt.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbb extends i implements Function2 {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzbc zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbb(String[] strArr, zzbc zzbcVar, String str, a aVar) {
        super(2, aVar);
        this.zza = strArr;
        this.zzb = zzbcVar;
        this.zzc = str;
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzbb(this.zza, this.zzb, this.zzc, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbb) create((f0) obj, (a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        WebView webView;
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        String[] strArr = this.zza;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("\"" + str + "\"");
        }
        webView = this.zzb.zza;
        webView.evaluateJavascript(this.zzc + "(" + g0.B(arrayList, ",", null, null, null, 62) + ")", null);
        return Unit.f23355a;
    }
}
