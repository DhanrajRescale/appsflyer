package com.webengage.sdk.android;

import android.content.Context;
import java.lang.Thread;

/* loaded from: classes2.dex */
class u0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f12682a;

    /* renamed from: b, reason: collision with root package name */
    private Context f12683b;

    /* renamed from: c, reason: collision with root package name */
    private f f12684c;

    public u0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context, f fVar) {
        this.f12683b = null;
        this.f12684c = null;
        this.f12682a = uncaughtExceptionHandler;
        this.f12683b = context.getApplicationContext();
        this.f12684c = fVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        Logger.e("WebEngage", "App has crashed\n" + th2);
        f fVar = this.f12684c;
        if (fVar != null) {
            fVar.a(true);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f12682a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        }
    }
}
