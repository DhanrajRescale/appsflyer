package d2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final s f13604b = new s(0);

    /* renamed from: c, reason: collision with root package name */
    public static final s f13605c = new s(1);

    /* renamed from: d, reason: collision with root package name */
    public static final s f13606d = new s(2);

    /* renamed from: e, reason: collision with root package name */
    public static final s f13607e = new s(3);

    /* renamed from: f, reason: collision with root package name */
    public static final s f13608f = new s(4);

    /* renamed from: g, reason: collision with root package name */
    public static final s f13609g = new s(5);

    /* renamed from: h, reason: collision with root package name */
    public static final s f13610h = new s(6);

    /* renamed from: i, reason: collision with root package name */
    public static final s f13611i = new s(7);

    /* renamed from: j, reason: collision with root package name */
    public static final s f13612j = new s(8);

    /* renamed from: k, reason: collision with root package name */
    public static final s f13613k = new s(9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13614a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10) {
        super(1);
        this.f13614a = i10;
    }

    public final Boolean a(androidx.compose.ui.node.a aVar) {
        boolean z10 = false;
        switch (this.f13614a) {
            case 0:
                return Boolean.valueOf(aVar.f1422w.d(8));
            case 1:
            case 2:
            default:
                h2.j n10 = aVar.n();
                if (n10 != null && n10.f17851b) {
                    if (n10.f17850a.containsKey(h2.i.f17832h)) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 3:
                h2.j n11 = aVar.n();
                if (n11 != null && n11.f17851b) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 4:
                return Boolean.valueOf(aVar.f1422w.d(8));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f13614a) {
            case 0:
                return a((androidx.compose.ui.node.a) obj);
            case 1:
                return Unit.f23355a;
            case 2:
                return Boolean.FALSE;
            case 3:
                return a((androidx.compose.ui.node.a) obj);
            case 4:
                return a((androidx.compose.ui.node.a) obj);
            case 5:
                return a((androidx.compose.ui.node.a) obj);
            case 6:
                return (p2.x) obj;
            case 7:
                return Boolean.valueOf(w0.d(obj));
            case 8:
                return null;
            default:
                a3.a.u(obj);
                return Unit.f23355a;
        }
    }
}
