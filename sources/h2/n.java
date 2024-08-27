package h2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class n extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final n f17855b = new n(0);

    /* renamed from: c, reason: collision with root package name */
    public static final n f17856c = new n(1);

    /* renamed from: d, reason: collision with root package name */
    public static final n f17857d = new n(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17858a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10) {
        super(1);
        this.f17858a = i10;
    }

    public final Boolean a(androidx.compose.ui.node.a aVar) {
        boolean z10 = true;
        switch (this.f17858a) {
            case 0:
                j n10 = aVar.n();
                if (n10 == null || !n10.f17851b) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 1:
                j n11 = aVar.n();
                if (n11 == null || !n11.f17851b) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return Boolean.valueOf(aVar.f1422w.d(8));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f17858a) {
            case 0:
                return a((androidx.compose.ui.node.a) obj);
            case 1:
                return a((androidx.compose.ui.node.a) obj);
            default:
                return a((androidx.compose.ui.node.a) obj);
        }
    }
}
