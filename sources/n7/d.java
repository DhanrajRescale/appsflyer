package n7;

/* loaded from: classes.dex */
public final class d implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f28346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28347b;

    /* renamed from: c, reason: collision with root package name */
    public final String f28348c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28349d;

    public d(String str, int i10, int i11, String str2) {
        this.f28346a = i10;
        this.f28347b = i11;
        this.f28348c = str;
        this.f28349d = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        d dVar = (d) obj;
        int i10 = this.f28346a - dVar.f28346a;
        if (i10 == 0) {
            return this.f28347b - dVar.f28347b;
        }
        return i10;
    }
}
