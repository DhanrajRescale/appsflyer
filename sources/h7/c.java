package h7;

import au.i;
import el.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;
import ut.n;

/* loaded from: classes.dex */
public final class c extends i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f18027a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f18028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, yt.a aVar) {
        super(2, aVar);
        this.f18028b = bVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new c(this.f18028b, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = zt.a.f42823a;
        int i10 = this.f18027a;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            this.f18027a = 1;
            b bVar = this.f18028b;
            bVar.getClass();
            Object B = l.B(bVar.f18022a, new a(bVar, null), this);
            if (B != obj2) {
                B = Unit.f23355a;
            }
            if (B == obj2) {
                return obj2;
            }
        }
        return Unit.f23355a;
    }
}
