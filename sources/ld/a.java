package ld;

import com.assetgro.stockgro.data.model.UserChatGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x.p2;
import x1.z;
import y.i3;

/* loaded from: classes.dex */
public final class a extends au.i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f24525a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f24527c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UserChatGroup f24529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function2 function2, int i10, UserChatGroup userChatGroup, yt.a aVar) {
        super(2, aVar);
        this.f24527c = function2;
        this.f24528d = i10;
        this.f24529e = userChatGroup;
    }

    @Override // au.a
    public final yt.a create(Object obj, yt.a aVar) {
        a aVar2 = new a(this.f24527c, this.f24528d, this.f24529e, aVar);
        aVar2.f24526b = obj;
        return aVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (yt.a) obj2)).invokeSuspend(Unit.f23355a);
    }

    @Override // au.a
    public final Object invokeSuspend(Object obj) {
        zt.a aVar = zt.a.f42823a;
        int i10 = this.f24525a;
        if (i10 != 0) {
            if (i10 == 1) {
                ut.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ut.n.b(obj);
            z zVar = (z) this.f24526b;
            p2 p2Var = new p2(this.f24527c, this.f24528d, this.f24529e, 3);
            this.f24525a = 1;
            if (i3.d(zVar, p2Var, null, this, 13) == aVar) {
                return aVar;
            }
        }
        return Unit.f23355a;
    }
}
