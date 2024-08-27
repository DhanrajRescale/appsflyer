package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final j f11588a = this;

    /* renamed from: b, reason: collision with root package name */
    private final hp.b f11589b;

    /* renamed from: c, reason: collision with root package name */
    private final hp.b f11590c;

    /* renamed from: d, reason: collision with root package name */
    private final hp.b f11591d;

    /* renamed from: e, reason: collision with root package name */
    private final hp.b f11592e;

    public j(Context context, i iVar) {
        p pVar;
        e4.k kVar = new e4.k(context);
        this.f11589b = kVar;
        pVar = o.f11598a;
        hp.b b10 = hp.q.b(pVar);
        this.f11590c = b10;
        hp.b b11 = hp.q.b(new v(kVar, b10));
        this.f11591d = b11;
        this.f11592e = hp.q.b(new n(b11));
    }

    public final IntegrityManager a() {
        return (IntegrityManager) this.f11592e.a();
    }
}
