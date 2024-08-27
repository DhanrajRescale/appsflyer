package a7;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f231a;

    /* renamed from: b, reason: collision with root package name */
    public final b f232b;

    public f(int i10, b bVar) {
        this.f231a = i10;
        this.f232b = bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f231a, ((f) obj).f231a);
    }
}
