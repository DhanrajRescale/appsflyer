package t6;

/* loaded from: classes.dex */
public final class g extends s6.d implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public long f35432k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g gVar = (g) obj;
        if (g(4) != gVar.g(4)) {
            if (!g(4)) {
                return -1;
            }
        } else {
            long j10 = this.f18004f - gVar.f18004f;
            if (j10 == 0) {
                j10 = this.f35432k - gVar.f35432k;
                if (j10 == 0) {
                    return 0;
                }
            }
            if (j10 <= 0) {
                return -1;
            }
        }
        return 1;
    }
}
