package g7;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w3 extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final w3 f17110b = new w3(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17111a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(int i10) {
        super(1);
        this.f17111a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Object obj3;
        b1 b1Var = b1.f16664b;
        a aVar = a.f16641b;
        b1 b1Var2 = b1.f16665c;
        b1 b1Var3 = b1.f16663a;
        int i10 = this.f17111a;
        switch (i10) {
            case 0:
                Function0 it = (Function0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                it.mo2invoke();
                return Unit.f23355a;
            case 1:
                d it2 = (d) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        it2.f16702d = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it2, "it");
                        it2.c(b1Var2, aVar);
                        it2.c(b1Var, aVar);
                        break;
                }
                return Unit.f23355a;
            case 2:
                d it3 = (d) obj;
                switch (i10) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        it3.f16702d = true;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        it3.c(b1Var2, aVar);
                        it3.c(b1Var, aVar);
                        break;
                }
                return Unit.f23355a;
            case 3:
                d it4 = (d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                Iterator it5 = it4.f16701c.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        obj2 = it5.next();
                        b1 b1Var4 = ((b) obj2).f16657a;
                        if (b1Var4 != b1Var3) {
                            if (it4.f16699a[b1Var4.ordinal()] == a.f16640a) {
                            }
                        }
                    } else {
                        obj2 = null;
                    }
                }
                b bVar = (b) obj2;
                if (bVar == null) {
                    return null;
                }
                return new Pair(bVar.f16657a, bVar.f16658b);
            default:
                d it6 = (d) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                Iterator it7 = it6.f16701c.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj3 = it7.next();
                        if (((b) obj3).f16657a == b1Var3) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                b bVar2 = (b) obj3;
                if (bVar2 == null) {
                    return null;
                }
                return bVar2.f16658b;
        }
    }
}
