package o1;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final long f29370a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f29371b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f29372c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f29373d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f29374e = 0;

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f29370a = (0 & 4294967295L) | j11;
        f29371b = (1 & 4294967295L) | j11;
        f29372c = j11 | (2 & 4294967295L);
        f29373d = (j10 & 4294967295L) | (4 << 32);
    }

    public static final boolean a(long j10, long j11) {
        return j10 == j11;
    }

    public static String b(long j10) {
        if (a(j10, f29370a)) {
            return "Rgb";
        }
        if (a(j10, f29371b)) {
            return "Xyz";
        }
        if (a(j10, f29372c)) {
            return "Lab";
        }
        if (a(j10, f29373d)) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
