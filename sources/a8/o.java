package a8;

import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.mig35.carousellayoutmanager.CarouselLayoutManager;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f280a;

    /* renamed from: b, reason: collision with root package name */
    public int f281b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f282c;

    public /* synthetic */ o(int i10, int i11, Object obj) {
        this.f280a = i11;
        this.f282c = obj;
        this.f281b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f280a;
        Object obj = this.f282c;
        switch (i10) {
            case 0:
                ((RecyclerView) obj).l0(this.f281b);
                return;
            case 1:
                ((SystemForegroundService) obj).f2607e.cancel(this.f281b);
                return;
            case 2:
                ((com.google.android.material.datepicker.l) obj).f11294h.l0(this.f281b);
                return;
            case 3:
                int i11 = this.f281b;
                int[] iArr = no.c.E;
                ((no.c) obj).h(i11);
                return;
            case 4:
                ((vo.c) obj).f38208g.x(this.f281b, 4);
                return;
            default:
                Iterator it = ((CarouselLayoutManager) obj).f12108x.iterator();
                if (!it.hasNext()) {
                    return;
                }
                a3.a.u(it.next());
                throw null;
        }
    }

    public o(RecyclerView recyclerView, int i10) {
        this.f280a = 0;
        this.f281b = i10;
        this.f282c = recyclerView;
    }

    public o(vo.c cVar) {
        this.f280a = 4;
        this.f282c = cVar;
        this.f281b = -1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(vo.c cVar, int i10) {
        this(cVar);
        this.f280a = 4;
    }
}
