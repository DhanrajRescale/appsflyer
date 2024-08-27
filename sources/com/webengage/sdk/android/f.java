package com.webengage.sdk.android;

import android.content.Context;
import java.util.List;

/* loaded from: classes2.dex */
class f extends h implements com.webengage.sdk.android.actions.database.n {
    public f(Context context) {
        super(context);
    }

    public void a(int i10) {
        a("com.webengage.static.version_code", Integer.valueOf(i10));
    }

    public void b(boolean z10) {
        a("install_referrer_set", Boolean.valueOf(z10));
    }

    public void i(String str) {
        a("com.webengage.static.cuid", (Object) str);
    }

    public void j(String str) {
        a("com.webengage.static.interfaceID", (Object) str);
    }

    public void k(String str) {
        a("com.webengage.static.luid", (Object) str);
    }

    public void l(String str) {
        a("com.webengage.session.suid", (Object) str);
    }

    @Override // com.webengage.sdk.android.actions.database.n
    public void a(List<Object> list, Object obj, String str, com.webengage.sdk.android.actions.database.o oVar) {
    }

    public void a(boolean z10) {
        a("webengage_volatile_prefs.txt", "com.webengage.static.app_crashed", (Object) Boolean.valueOf(z10), true);
    }
}
