package com.google.android.recaptcha.internal;

import au.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ut.n;
import yt.a;

/* loaded from: classes2.dex */
final class zzo extends i implements Function2 {
    public zzo(a aVar) {
        super(2, aVar);
    }

    @Override // au.a
    @NotNull
    public final a create(Object obj, @NotNull a aVar) {
        return new zzo(aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new zzo((a) obj2).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(@NotNull Object obj) {
        zt.a aVar = zt.a.f42823a;
        n.b(obj);
        Thread.currentThread().setPriority(8);
        return Unit.f23355a;
    }
}
