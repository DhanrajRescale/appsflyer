package l7;

/* loaded from: classes.dex */
public abstract class b extends x {
    public abstract void d(q7.g gVar, Object obj);

    public final void e(Object obj) {
        q7.g a10 = a();
        try {
            d(a10, obj);
            a10.f31822b.executeInsert();
        } finally {
            c(a10);
        }
    }
}
