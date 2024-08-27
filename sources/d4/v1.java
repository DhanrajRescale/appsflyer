package d4;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v1 extends au.h implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public int f13847b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f13849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(View view, yt.a aVar) {
        super(aVar);
        this.f13849d = view;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        v1 v1Var = new v1(this.f13849d, aVar);
        v1Var.f13848c = obj;
        return v1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v1) create((pu.i) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f13847b;
        View view = this.f13849d;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    ut.n.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                pu.i iVar = (pu.i) this.f13848c;
                ut.n.b(obj);
                if (view instanceof ViewGroup) {
                    t1 a10 = pu.j.a(new u1((ViewGroup) view, null));
                    this.f13848c = null;
                    this.f13847b = 2;
                    iVar.getClass();
                    Object c10 = iVar.c(a10.iterator(), this);
                    if (c10 != aVar) {
                        c10 = Unit.f23355a;
                    }
                    if (c10 == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.f23355a;
        }
        ut.n.b(obj);
        pu.i iVar2 = (pu.i) this.f13848c;
        this.f13848c = iVar2;
        this.f13847b = 1;
        iVar2.b(view, this);
        return aVar;
    }
}
