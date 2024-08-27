package ge;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import qu.f0;

/* loaded from: classes.dex */
public final class e extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public f f17307a;

    /* renamed from: b, reason: collision with root package name */
    public String f17308b;

    /* renamed from: c, reason: collision with root package name */
    public int f17309c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f17310d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f17311e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, f fVar, yt.a aVar) {
        super(2, aVar);
        this.f17310d = str;
        this.f17311e = fVar;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        return new e(this.f17310d, this.f17311e, aVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((f0) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        f fVar;
        String str;
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f17309c;
        if (i10 != 0) {
            if (i10 == 1) {
                str = this.f17308b;
                fVar = this.f17307a;
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            String str2 = this.f17310d;
            if (str2 != null) {
                fVar = this.f17311e;
                fVar.getClass();
                this.f17307a = fVar;
                this.f17308b = str2;
                this.f17309c = 1;
                if (kp.j.K(500L, this) == aVar) {
                    return aVar;
                }
                str = str2;
            }
            return Unit.f23355a;
        }
        fVar.f17312a.invoke(str);
        return Unit.f23355a;
    }
}
