package lf;

import com.assetgro.stockgro.ui.home.v2.TransparentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j0 extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransparentActivity f24737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(String str, TransparentActivity transparentActivity, yt.a aVar) {
        super(2, aVar);
        this.f24736b = str;
        this.f24737c = transparentActivity;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new j0(this.f24736b, this.f24737c, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((qu.f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f24735a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            long parseInt = Integer.parseInt(this.f24736b) * 1000;
            this.f24735a = 1;
            if (kp.j.K(parseInt, this) == aVar) {
                return aVar;
            }
        }
        TransparentActivity transparentActivity = this.f24737c;
        transparentActivity.finish();
        transparentActivity.overridePendingTransition(0, 0);
        return Unit.f23355a;
    }
}
