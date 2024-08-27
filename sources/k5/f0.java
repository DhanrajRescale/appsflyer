package k5;

/* loaded from: classes.dex */
public final class f0 implements w {

    /* renamed from: b, reason: collision with root package name */
    public int f22093b;

    /* renamed from: c, reason: collision with root package name */
    public int f22094c;

    /* renamed from: d, reason: collision with root package name */
    public int f22095d;

    /* renamed from: e, reason: collision with root package name */
    public int f22096e;

    /* renamed from: f, reason: collision with root package name */
    public int f22097f;

    /* renamed from: g, reason: collision with root package name */
    public int f22098g;

    public f0(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f22093b = i10;
        this.f22094c = i11;
        this.f22095d = i12;
        this.f22096e = i13;
        this.f22097f = i14;
        this.f22098g = i15;
    }

    public static int a(int i10) {
        switch (i10) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
