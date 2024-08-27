package m;

import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class w2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SearchView f25779b;

    public /* synthetic */ w2(SearchView searchView, int i10) {
        this.f25778a = i10;
        this.f25779b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25778a;
        SearchView searchView = this.f25779b;
        switch (i10) {
            case 0:
                searchView.u();
                return;
            default:
                i4.a aVar = searchView.f1043j0;
                if (aVar instanceof j3) {
                    aVar.b(null);
                    return;
                }
                return;
        }
    }
}
