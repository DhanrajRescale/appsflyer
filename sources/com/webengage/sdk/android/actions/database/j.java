package com.webengage.sdk.android.actions.database;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class j implements s {

    /* renamed from: a, reason: collision with root package name */
    private Context f12273a;

    /* renamed from: b, reason: collision with root package name */
    private m f12274b;

    public j(Context context, m mVar) {
        this.f12273a = context;
        this.f12274b = mVar;
    }

    private boolean a() {
        i b10 = i.b(this.f12273a);
        for (int d10 = b10.d(); d10 > 0 && r.d(); d10 -= 10) {
            this.f12274b.a(b10.a(10));
        }
        return true;
    }

    @Override // com.webengage.sdk.android.actions.database.s
    public boolean a(com.webengage.sdk.android.n nVar) {
        return a();
    }

    public boolean a(ArrayList<com.webengage.sdk.android.n> arrayList) {
        return a();
    }
}
