package b0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class k extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final k f2888b = new k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final k f2889c = new k(1);

    /* renamed from: d, reason: collision with root package name */
    public static final k f2890d = new k(2);

    /* renamed from: e, reason: collision with root package name */
    public static final k f2891e = new k(3);

    /* renamed from: f, reason: collision with root package name */
    public static final k f2892f = new k(4);

    /* renamed from: g, reason: collision with root package name */
    public static final k f2893g = new k(5);

    /* renamed from: h, reason: collision with root package name */
    public static final k f2894h = new k(6);

    /* renamed from: i, reason: collision with root package name */
    public static final k f2895i = new k(7);

    /* renamed from: j, reason: collision with root package name */
    public static final k f2896j = new k(8);

    /* renamed from: k, reason: collision with root package name */
    public static final k f2897k = new k(9);

    /* renamed from: l, reason: collision with root package name */
    public static final k f2898l = new k(10);

    /* renamed from: m, reason: collision with root package name */
    public static final k f2899m = new k(11);

    /* renamed from: n, reason: collision with root package name */
    public static final k f2900n = new k(12);

    /* renamed from: o, reason: collision with root package name */
    public static final k f2901o = new k(13);

    /* renamed from: p, reason: collision with root package name */
    public static final k f2902p = new k(14);

    /* renamed from: q, reason: collision with root package name */
    public static final k f2903q = new k(15);

    /* renamed from: r, reason: collision with root package name */
    public static final k f2904r = new k(16);

    /* renamed from: s, reason: collision with root package name */
    public static final k f2905s = new k(17);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10) {
        super(2);
        this.f2906a = i10;
    }

    public final Integer a(a2.q qVar, int i10) {
        switch (this.f2906a) {
            case 1:
                return Integer.valueOf(qVar.e(i10));
            case 2:
                return Integer.valueOf(qVar.D(i10));
            case 3:
                return Integer.valueOf(qVar.D(i10));
            case 4:
                return Integer.valueOf(qVar.e(i10));
            case 5:
                return Integer.valueOf(qVar.W(i10));
            case 6:
                return Integer.valueOf(qVar.D(i10));
            case 7:
                return Integer.valueOf(qVar.z(i10));
            case 8:
                return Integer.valueOf(qVar.e(i10));
            case 9:
                return Integer.valueOf(qVar.e(i10));
            case 10:
                return Integer.valueOf(qVar.D(i10));
            case 11:
                return Integer.valueOf(qVar.D(i10));
            case 12:
                return Integer.valueOf(qVar.e(i10));
            case 13:
                return Integer.valueOf(qVar.W(i10));
            case 14:
                return Integer.valueOf(qVar.D(i10));
            case 15:
                return Integer.valueOf(qVar.z(i10));
            default:
                return Integer.valueOf(qVar.e(i10));
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2906a) {
            case 0:
                float intValue = ((Number) obj).intValue() / 2.0f;
                float f10 = -1.0f;
                if (((w2.k) obj2) != w2.k.f38799a) {
                    f10 = (-1.0f) * (-1);
                }
                return Integer.valueOf(Math.round((1 + f10) * intValue));
            case 1:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 2:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 3:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 4:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 5:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 6:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 7:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 8:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 9:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 10:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 11:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 12:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 13:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 14:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 15:
                return a((a2.q) obj, ((Number) obj2).intValue());
            case 16:
                return a((a2.q) obj, ((Number) obj2).intValue());
            default:
                return Integer.valueOf(((x1) obj).b((w2.b) obj2));
        }
    }
}
