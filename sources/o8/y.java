package o8;

import coil.request.NullRequestDataException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29857b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f29858c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f29859d;

    public /* synthetic */ y(int i10, Object obj, Object obj2, Object obj3) {
        this.f29856a = i10;
        this.f29857b = obj;
        this.f29858c = obj2;
        this.f29859d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f29856a;
        Object obj2 = this.f29859d;
        Object obj3 = this.f29858c;
        Object obj4 = this.f29857b;
        switch (i10) {
            case 0:
                q1.b bVar = (q1.b) obj4;
                q1.b bVar2 = (q1.b) obj3;
                q1.b bVar3 = (q1.b) obj2;
                i iVar = (i) obj;
                if (iVar instanceof g) {
                    g gVar = (g) iVar;
                    if (bVar != null) {
                        gVar.getClass();
                        return new g(bVar);
                    }
                    return gVar;
                }
                if (iVar instanceof f) {
                    f fVar = (f) iVar;
                    y8.e eVar = fVar.f29799b;
                    if (eVar.f41333c instanceof NullRequestDataException) {
                        if (bVar2 != null) {
                            return new f(bVar2, eVar);
                        }
                        return fVar;
                    }
                    if (bVar3 != null) {
                        return new f(bVar3, eVar);
                    }
                    return fVar;
                }
                return iVar;
            default:
                Function1 function1 = (Function1) obj4;
                Function1 function12 = (Function1) obj3;
                Function1 function13 = (Function1) obj2;
                i iVar2 = (i) obj;
                if (iVar2 instanceof g) {
                    if (function1 != null) {
                        function1.invoke(iVar2);
                    }
                } else if (iVar2 instanceof h) {
                    if (function12 != null) {
                        function12.invoke(iVar2);
                    }
                } else if (iVar2 instanceof f) {
                    if (function13 != null) {
                        function13.invoke(iVar2);
                    }
                } else if (!(iVar2 instanceof e)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f23355a;
        }
    }
}
