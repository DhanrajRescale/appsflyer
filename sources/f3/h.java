package f3;

/* loaded from: classes.dex */
public final class h extends c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f3.h, f3.c] */
    public static h k(String str) {
        ?? cVar = new c(str.toCharArray());
        cVar.f15911b = 0L;
        long length = str.length() - 1;
        if (cVar.f15912c == Long.MAX_VALUE) {
            cVar.f15912c = length;
            b bVar = cVar.f15913d;
            if (bVar != 0) {
                bVar.k(cVar);
            }
        }
        return cVar;
    }

    @Override // f3.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && e().equals(((h) obj).e())) {
            return true;
        }
        return super.equals(obj);
    }

    @Override // f3.c
    public final int hashCode() {
        return super.hashCode();
    }
}
