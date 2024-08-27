package ij;

import android.view.View;
import android.view.animation.Animation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class d extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f20051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Animation f20053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Animation f20054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, int i10, Animation animation, Animation animation2, yt.a aVar) {
        super(2, aVar);
        this.f20051a = list;
        this.f20052b = i10;
        this.f20053c = animation;
        this.f20054d = animation2;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new d(this.f20051a, this.f20052b, this.f20053c, this.f20054d, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        ut.n.b(obj);
        List list = this.f20051a;
        int i10 = this.f20052b;
        ((View) list.get(i10)).startAnimation(this.f20053c);
        ((View) list.get(i10)).setVisibility(8);
        int size = (i10 + 1) % list.size();
        ((View) list.get(size)).startAnimation(this.f20054d);
        ((View) list.get(size)).setVisibility(0);
        return Unit.f23355a;
    }
}
