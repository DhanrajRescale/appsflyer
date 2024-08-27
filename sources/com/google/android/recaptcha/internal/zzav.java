package com.google.android.recaptcha.internal;

import iu.k;
import kotlin.jvm.functions.Function1;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzav extends k implements Function1 {
    final /* synthetic */ zzba zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzav(zzba zzbaVar) {
        super(1);
        this.zza = zzbaVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }
}
