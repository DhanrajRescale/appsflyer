package ij;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qu.f0;

/* loaded from: classes.dex */
public final class j extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f20072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, k kVar, yt.a aVar) {
        super(2, aVar);
        this.f20071a = str;
        this.f20072b = kVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j(this.f20071a, this.f20072b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f20071a));
        intent.setFlags(268435456);
        k kVar = this.f20072b;
        kVar.f20073a.startActivity(intent);
        Context context = kVar.f20073a;
        Intrinsics.d(context, "null cannot be cast to non-null type android.app.Activity");
        ((Activity) context).finish();
        return Unit.f23355a;
    }
}
