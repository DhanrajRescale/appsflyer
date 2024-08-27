package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;
import qu.f0;
import yk.g;

/* loaded from: classes2.dex */
public final class zzbc {

    @NotNull
    private final WebView zza;

    @NotNull
    private final f0 zzb;

    public zzbc(@NotNull WebView webView, @NotNull f0 f0Var) {
        this.zza = webView;
        this.zzb = f0Var;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        g.H(this.zzb, null, null, new zzbb(strArr, this, str, null), 3);
    }
}
