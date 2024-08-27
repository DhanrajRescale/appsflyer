package qu;

/* loaded from: classes2.dex */
public abstract class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kp.g f32301a = new kp.g("COMPLETING_ALREADY", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final kp.g f32302b = new kp.g("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final kp.g f32303c = new kp.g("COMPLETING_RETRY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final kp.g f32304d = new kp.g("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final kp.g f32305e = new kp.g("SEALED", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final v0 f32306f = new v0(false);

    /* renamed from: g, reason: collision with root package name */
    public static final v0 f32307g = new v0(true);

    public static final Object a(Object obj) {
        j1 j1Var;
        i1 i1Var;
        if (obj instanceof j1) {
            j1Var = (j1) obj;
        } else {
            j1Var = null;
        }
        if (j1Var != null && (i1Var = j1Var.f32228a) != null) {
            return i1Var;
        }
        return obj;
    }
}
