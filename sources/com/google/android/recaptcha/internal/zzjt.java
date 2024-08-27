package com.google.android.recaptcha.internal;

import da.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjt extends IllegalArgumentException {
    public zzjt(int i10, int i11) {
        super(e.m("Unpaired surrogate at index ", i10, " of ", i11));
    }
}
