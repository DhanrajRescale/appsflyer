package y2;

import androidx.lifecycle.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final n f41115b = new n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final n f41116c = new n(1);

    /* renamed from: d, reason: collision with root package name */
    public static final n f41117d = new n(2);

    /* renamed from: e, reason: collision with root package name */
    public static final n f41118e = new n(3);

    /* renamed from: f, reason: collision with root package name */
    public static final n f41119f = new n(4);

    /* renamed from: g, reason: collision with root package name */
    public static final n f41120g = new n(5);

    /* renamed from: h, reason: collision with root package name */
    public static final n f41121h = new n(6);

    /* renamed from: i, reason: collision with root package name */
    public static final n f41122i = new n(7);

    /* renamed from: j, reason: collision with root package name */
    public static final n f41123j = new n(8);

    /* renamed from: k, reason: collision with root package name */
    public static final n f41124k = new n(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41125a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10) {
        super(2);
        this.f41125a = i10;
    }

    public final void a(androidx.compose.ui.node.a aVar, Function1 function1) {
        switch (this.f41125a) {
            case 0:
                m.d(aVar).setResetBlock(function1);
                return;
            case 1:
                m.d(aVar).setUpdateBlock(function1);
                return;
            case 2:
                m.d(aVar).setReleaseBlock(function1);
                return;
            case 3:
                m.d(aVar).setUpdateBlock(function1);
                return;
            default:
                m.d(aVar).setReleaseBlock(function1);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        switch (this.f41125a) {
            case 0:
                a((androidx.compose.ui.node.a) obj, (Function1) obj2);
                return Unit.f23355a;
            case 1:
                a((androidx.compose.ui.node.a) obj, (Function1) obj2);
                return Unit.f23355a;
            case 2:
                a((androidx.compose.ui.node.a) obj, (Function1) obj2);
                return Unit.f23355a;
            case 3:
                a((androidx.compose.ui.node.a) obj, (Function1) obj2);
                return Unit.f23355a;
            case 4:
                a((androidx.compose.ui.node.a) obj, (Function1) obj2);
                return Unit.f23355a;
            case 5:
                m.d((androidx.compose.ui.node.a) obj).setModifier((g1.o) obj2);
                return Unit.f23355a;
            case 6:
                m.d((androidx.compose.ui.node.a) obj).setDensity((w2.b) obj2);
                return Unit.f23355a;
            case 7:
                m.d((androidx.compose.ui.node.a) obj).setLifecycleOwner((t) obj2);
                return Unit.f23355a;
            case 8:
                m.d((androidx.compose.ui.node.a) obj).setSavedStateRegistryOwner((o7.f) obj2);
                return Unit.f23355a;
            default:
                q d10 = m.d((androidx.compose.ui.node.a) obj);
                int ordinal = ((w2.k) obj2).ordinal();
                if (ordinal != 0) {
                    i10 = 1;
                    if (ordinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i10 = 0;
                }
                d10.setLayoutDirection(i10);
                return Unit.f23355a;
        }
    }
}
