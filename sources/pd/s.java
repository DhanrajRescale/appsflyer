package pd;

import com.assetgro.stockgro.data.model.CreateGroupUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.s f30951b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(e1.s sVar, int i10) {
        super(1);
        this.f30950a = i10;
        this.f30951b = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        e1.s sVar = this.f30951b;
        int i10 = this.f30950a;
        switch (i10) {
            case 0:
                CreateGroupUser it = (CreateGroupUser) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it, "it");
                        sVar.remove(it);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        sVar.remove(it);
                        break;
                }
                return Unit.f23355a;
            case 1:
                CreateGroupUser it2 = (CreateGroupUser) obj;
                switch (i10) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        sVar.remove(it2);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        sVar.remove(it2);
                        break;
                }
                return Unit.f23355a;
            default:
                c0.d0 LazyColumn = (c0.d0) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                c0.d0.a(LazyColumn, wd.g.f39031a);
                n nVar = new n(sVar, 1);
                Object obj2 = b1.d.f3079a;
                c0.d0.a(LazyColumn, new b1.c(nVar, true, 1874916106));
                c0.d0.a(LazyColumn, wd.g.f39032b);
                c0.j jVar = (c0.j) LazyColumn;
                jVar.a0(sVar.size(), null, new lb.j(wd.d.f39024i, sVar, 9), new b1.c(new p(sVar, sVar, 1), true, -632812321));
                return Unit.f23355a;
        }
    }
}
