package bt;

import at.l;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class a implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7309a;

    public final l a() {
        switch (this.f7309a) {
            case 0:
                return b.f7310a;
            case 1:
            default:
                return st.d.f34772a;
            case 2:
                return st.a.f34769a;
            case 3:
                return st.b.f34770a;
            case 4:
                return st.c.f34771a;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f7309a) {
            case 0:
                return a();
            case 1:
            default:
                return a();
            case 2:
                return a();
            case 3:
                return a();
            case 4:
                return a();
        }
    }
}
