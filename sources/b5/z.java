package b5;

/* loaded from: classes.dex */
public abstract class z implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final a0 f3684f = new z(new y());

    /* renamed from: g, reason: collision with root package name */
    public static final String f3685g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f3686h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f3687i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f3688j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f3689k;

    /* renamed from: l, reason: collision with root package name */
    public static final i5.w f3690l;

    /* renamed from: a, reason: collision with root package name */
    public final long f3691a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3692b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3693c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3694d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3695e;

    /* JADX WARN: Type inference failed for: r1v0, types: [b5.z, b5.a0] */
    static {
        int i10 = e5.x.f15050a;
        f3685g = Integer.toString(0, 36);
        f3686h = Integer.toString(1, 36);
        f3687i = Integer.toString(2, 36);
        f3688j = Integer.toString(3, 36);
        f3689k = Integer.toString(4, 36);
        f3690l = new i5.w(22);
    }

    public z(y yVar) {
        this.f3691a = yVar.f3679a;
        this.f3692b = yVar.f3680b;
        this.f3693c = yVar.f3681c;
        this.f3694d = yVar.f3682d;
        this.f3695e = yVar.f3683e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3691a == zVar.f3691a && this.f3692b == zVar.f3692b && this.f3693c == zVar.f3693c && this.f3694d == zVar.f3694d && this.f3695e == zVar.f3695e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f3691a;
        int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
        long j11 = this.f3692b;
        return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f3693c ? 1 : 0)) * 31) + (this.f3694d ? 1 : 0)) * 31) + (this.f3695e ? 1 : 0);
    }
}
