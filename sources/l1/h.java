package l1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f23893b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f23894c = new h(3);

    /* renamed from: d, reason: collision with root package name */
    public static final h f23895d = new h(4);

    /* renamed from: e, reason: collision with root package name */
    public static final h f23896e = new h(5);

    /* renamed from: f, reason: collision with root package name */
    public static final h f23897f = new h(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23898a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f23898a = i10;
    }

    public final o a() {
        switch (this.f23898a) {
            case 1:
                return o.f23914b;
            case 2:
                return o.f23914b;
            case 3:
                return o.f23914b;
            default:
                return o.f23914b;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f23898a;
        switch (i10) {
            case 0:
                ((j) obj).b(false);
                return Unit.f23355a;
            case 1:
                int i11 = ((b) obj).f23884a;
                return a();
            case 2:
                int i12 = ((b) obj).f23884a;
                return a();
            case 3:
                int i13 = ((b) obj).f23884a;
                return a();
            case 4:
                int i14 = ((b) obj).f23884a;
                return a();
            case 5:
                t tVar = (t) obj;
                switch (i10) {
                    case 5:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(tVar));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(tVar));
                }
            default:
                t tVar2 = (t) obj;
                switch (i10) {
                    case 5:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(tVar2));
                    default:
                        return Boolean.valueOf(androidx.compose.ui.focus.a.C(tVar2));
                }
        }
    }
}
