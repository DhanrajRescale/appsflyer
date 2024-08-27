package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static j f11593a;

    public static synchronized j a(Context context) {
        j jVar;
        synchronized (l.class) {
            try {
                if (f11593a == null) {
                    h hVar = new h(null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    hVar.a(context);
                    f11593a = hVar.b();
                }
                jVar = f11593a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
