package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes2.dex */
final class h implements k {

    /* renamed from: a, reason: collision with root package name */
    private Context f11587a;

    private h() {
    }

    public /* synthetic */ h(g gVar) {
    }

    public final h a(Context context) {
        context.getClass();
        this.f11587a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.k
    public final j b() {
        Context context = this.f11587a;
        if (context != null) {
            return new j(context, null);
        }
        throw new IllegalStateException(String.valueOf(Context.class.getCanonicalName()).concat(" must be set"));
    }
}
