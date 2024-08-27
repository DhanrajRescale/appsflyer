package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f8386b;

    public /* synthetic */ a(int i10, Function1 function1) {
        this.f8385a = i10;
        this.f8386b = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8385a;
        AFLogger.b(this.f8386b);
    }
}
