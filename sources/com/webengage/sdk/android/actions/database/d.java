package com.webengage.sdk.android.actions.database;

import android.content.Context;

/* loaded from: classes2.dex */
class d implements s {

    /* renamed from: a, reason: collision with root package name */
    e f12248a;

    /* renamed from: b, reason: collision with root package name */
    m f12249b;

    /* renamed from: c, reason: collision with root package name */
    Context f12250c;

    public d(e eVar, m mVar, Context context) {
        this.f12248a = eVar;
        this.f12249b = mVar;
        this.f12250c = context;
    }

    @Override // com.webengage.sdk.android.actions.database.s
    public boolean a(com.webengage.sdk.android.n nVar) {
        this.f12248a.a(nVar);
        if (this.f12248a.a() < 5 || !r.d()) {
            return true;
        }
        this.f12249b.a(this.f12248a.a(5));
        return true;
    }
}
